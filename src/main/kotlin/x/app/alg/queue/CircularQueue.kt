package x.app.alg.queue

/**
 * @author shiyajun
 * @date 2020/11/23 3:50 下午
 * 循环队列
 * */
class CircularQueue(private val capacity: Int) {
    private val data = arrayOfNulls<Long>(capacity)

    private var head = 0
    private var tail = 0

    fun add(element: Long): Boolean {
        if ((tail + 1) % capacity == head) {
            return false
        }
        data[tail] = element
        tail = (tail + 1) % capacity

        return true
    }

    fun poll(): Long {
        if (head == tail) return -1
        val result = data[head]
        requireNotNull(result)

        head = (head + 1) % capacity
        return result
    }
}