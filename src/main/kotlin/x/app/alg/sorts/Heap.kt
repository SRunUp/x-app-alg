package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/7/27 11:31 上午
 * */
class Heap(capacity: Int) {
    // 数组，从下标1开始存储数据
    private val array: IntArray = IntArray(capacity + 1)

    // 堆可以存储的最大数据个数
    private val n: Int = capacity

    // 堆中已经存储的数据个数
    private var count: Int = 0

    fun insert(data: Int) {
        // 堆满了
        if (count >= n) return
        ++count
        array[count] = data
        var i = count

        // 自下往上堆化
        while (i / 2 > 0 && array[i] > array[i / 2]) {
            array.swap(i, i / 2)
            i /= 2
        }
    }

    fun removeMax() {
        // 堆中没有数据
        if (count == 0) return
        array[1] = array[count]
        --count

        heapify(array, count, 1)
    }

    // 从上往下堆化
    private fun heapify(array: IntArray, n: Int, i: Int) {
        var currPos = i
        var left: Int
        var right: Int
        var maxPos: Int
        while (true) {
            maxPos = currPos
            left = currPos * 2
            right = currPos * 2 + 1

            if (left <= n && array[maxPos] < array[left]) {
                maxPos = left
            }

            if (right <= n && array[maxPos] < array[right]) {
                maxPos = right
            }

            if (maxPos == currPos) break
            array.swap(maxPos, currPos)
            currPos = maxPos
        }
    }
}