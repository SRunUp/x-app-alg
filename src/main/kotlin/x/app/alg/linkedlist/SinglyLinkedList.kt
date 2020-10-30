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