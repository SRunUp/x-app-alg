package x.app.alg.linkedlist

/**
 * @author shiyajun
 * @date 2020/10/30 11:00 上午
 * */
class LRUCache(private val capacity: Int) {
    internal inner class DLinkedNode {
        var key = 0
        var value = 0
        lateinit var prev: DLinkedNode
        lateinit var next: DLinkedNode

        constructor()
        constructor(key: Int, value: Int) {
            this.key = key
            this.value = value
        }
    }

    private val cache = mutableMapOf<Int, DLinkedNode>()
    private var size = 0

    /**
     * 哨兵模式 - 使用一个伪头部（dummy head）和伪尾部（dummy tail）标记界限，这样在添加节点和删除节点的时候就不需要检查相邻的节点是否存在。
     */
    private val head: DLinkedNode
    private val tail: DLinkedNode
    operator fun get(key: Int): Int {
        val node = cache[key] ?: return -1

        //如果Key存在，先通过哈希表定位，再移到头部
        moveToHead(node)
        return node.value
    }

    fun put(key: Int, value: Int) {
        val node = cache[key]
        if (node == null) {
            //如果key不存在，创建一个新的节点
            val newNode = DLinkedNode(key, value)
            cache[key] = newNode
            addToHead(newNode)
            ++size
            if (size > capacity) {
                //超出容量，删除双向链表的尾节点
                val tail = removeTail()
                cache.remove(tail.key)
                --size
            }
        } else {
            //如果key存在，找到key，修改Value,并移到头部
            node.value = value
            moveToHead(node)
        }
    }

    private fun removeTail(): DLinkedNode {
        val result = tail.prev
        removeNode(result)
        return result
    }

    private fun moveToHead(node: DLinkedNode) {
        removeNode(node)
        addToHead(node)
    }

    private fun removeNode(node: DLinkedNode) {
        node.prev.next = node.next
        node.next.prev = node.prev
    }

    private fun addToHead(node: DLinkedNode) {
        node.prev = head
        node.next = head.next
        head.next.prev = node
        head.next = node
    }

    init {
        head = DLinkedNode()
        tail = DLinkedNode()
        head.next = tail
        tail.prev = head
    }
}