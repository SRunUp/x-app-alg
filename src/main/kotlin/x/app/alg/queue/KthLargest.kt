package x.app.alg.queue

import java.util.*

/**
 * @author shiyajun
 * @date 2021/1/4 6:23 下午
 * */
class KthLargest(private val k: Int, nums: IntArray) {
    private val queue: PriorityQueue<Int> = PriorityQueue(k)

    init {
        for (num in nums) {
            add(num)
        }
    }

    private fun add(num: Int): Int {
        when {
            // 如果队列还没达到指定大小
            queue.size < k -> {
                queue.offer(num)
            }

            // 如果堆顶元素是否少于当前值
            queue.peek() < num -> {
                queue.poll()
                queue.offer(num)
            }
        }

        return queue.peek()
    }
}