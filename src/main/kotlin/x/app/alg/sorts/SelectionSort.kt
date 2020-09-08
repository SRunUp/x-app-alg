package x.app.alg.sorts

/**
 * 选择排序*/
object SelectionSort {
    fun sort(array: IntArray) {
        if (array.isEmpty()) return
        val n = array.size

        for (i in array.indices) {
            // 查找最小值
            var minIndex = i
            for (j in i + 1 until n) {
                if (array[j] < array[minIndex]) {
                    minIndex = j
                }
            }

            array.swap(i, minIndex)
        }
    }
}