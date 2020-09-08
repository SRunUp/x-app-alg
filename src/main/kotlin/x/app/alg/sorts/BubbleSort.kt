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
                    array.swap(j, j + 1)
                    swapped = true
                }
            }
            if (!swapped) break
        }
    }
}