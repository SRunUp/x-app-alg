package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:50 上午
 * */
object QuickSort {
    fun sort(array: IntArray) {
        sortInternally(array, 0, array.size - 1)
    }

    private fun sortInternally(array: IntArray, l: Int, r: Int) {
        if (l >= r) return
        val q = partition(array, l, r)
        sortInternally(array, l, q - 1)
        sortInternally(array, q + 1, r)
    }

    /**
     * 分区操作
     * */
    private fun partition(array: IntArray, l: Int, r: Int): Int {
        val pivot = array[r]
        var i = l

        for (j in l until r) {
            if (array[j] < pivot) {
                Utils.swap(array, i, j)
                i++
            }
        }
        Utils.swap(array, i, r)
        return i
    }
}