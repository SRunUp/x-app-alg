package x.app.alg.sorts

object BubbleSort {
    fun sort(array: IntArray) {
        if (array.isEmpty()) {
            return
        }

        val n = array.size
        var swapped = false

        for (i in array.indices) {
            for (j in 0 until n - i - 1) {
                if (array[j] > array[j + 1]) {
                    // 交换次数等于 满有序度 n*(n-1)/2 - 初始有虚度
                    // 如何计算初始有序度？
                    Utils.swap(array, j, j + 1)
                    swapped = true
                }
            }
            if (!swapped) break
        }
    }
}