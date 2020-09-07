package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:50 上午
 * 找到基准值
 * 少于基准值的放左边
 * 大于基准值的放右边
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
     * 这⾥的处理有点类似选择排序。我们通过游标 i 把 A[l...r-1] 分成两部分。
     * A[l...i-1] 的元素都是⼩于 pivot 的，我们暂且叫它“已处理区间”,A[i...r-1] 是“未处理区间”。
     * 我们每次都从未处理的区间 A[i…r-1] 中取⼀个元素A[j]，与 pivot 对⽐
     * 如果⼩于 pivot，则将其加⼊到已处理区间的尾部，也就是A[i]的位置。
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