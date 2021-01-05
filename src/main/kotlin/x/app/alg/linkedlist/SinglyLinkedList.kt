package x.app.alg.linkedlist

/**
 * @author shiyajun
 * @date 2020/10/30 2:29 下午
 * */
// singly-linked-list
class SListNode(var value: Int) {
    var next: SListNode? = null
}


/**
 * 双指针迭代 - 反转单链表*/
fun reverse(head: SListNode?): SListNode? {
    var prev: SListNode? = null
    var cur = head
    var next: SListNode?

    while (cur != null) {
        // 记录当前节点的下一个节点
        next = cur.next
        // 然后将当前节点指向pre
        cur.next = prev
        // pre和cur节点都前进一位
        prev = cur
        cur = next
    }

    return prev
}

/**
 * 两两交换 - 递归*/
fun swapPairsRecursion(head: SListNode?): SListNode? {
    // 递归终止条件 head == null || head.next == null
    if (head?.next == null) {
        return head as SListNode
    }
    // 第二个节点作为新的头结点
    val newHead = head.next

    // 指向下一个两两交换后的头节点
    head.next = swapPairsRecursion(newHead?.next)

    // 交换
    newHead?.next = head
    return newHead
}

/**
 * 两两交换链表节点 - 迭代方式
 * 增加哨兵节点
 * temp -> a -> b --> temp -> b -> a*/
fun swapPairs(head: SListNode?): SListNode? {
    // 哨兵节点
    val dummyHead = SListNode(0).also {
        it.next = head
    }

    // 临时节点
    var temp = dummyHead
    while (temp.next != null && temp.next?.next != null) {
        // 要交换的 a,b 节点
        val a = temp.next
        val b = temp.next?.next

        // temp -> a -> b --> temp -> b -> a
        temp.next = b
        a?.next = b?.next
        b?.next = a

        // 移动 temp 到交换后的 a 节点位置
        temp = a as SListNode
    }

    return dummyHead.next
}
