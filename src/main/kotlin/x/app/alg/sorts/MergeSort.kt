package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:50 上午
 * */
object MergeSort {
    fun sort(array: IntArray) {
        sortInternally(array, 0, array.size - 1)
    }

    private fun sortInternally(array: IntArray, l: Int, r: Int) {
        if (l >= r) return
        // mid
        val m = l + (r - l) / 2

        // left
        sortInternally(array, l, m)
        // right
        sortInternally(array, m + 1, r)

        // merge lef right
        merge(array, l, m, r)
    }

    private fun mergeV1(array: IntArray, l: Int, m: Int, r: Int) {
        var i = l
        var j = m + 1
        var k = 0
        val temp = IntArray(r - l + 1)


        //左右两个数组比较大小
        while (i <= m && j <= r) {
            when {
                array[i] <= array[j] -> temp[k++] = array[i++]
                else -> temp[k++] = array[j++]
            }
        }

        //数组有剩余数据
        var start = i
        var end = m
        if (j <= r) {
            start = j
            end = r
        }

        while (start <= end) {
            temp[k++] = array[start++]
        }

        //拷贝temp数据到array[p..r]中
        for (v in 0..r - l) {
            array[l + v] = temp[v]
        }
    }

    private fun merge(array: IntArray, l: Int, m: Int, r: Int) {
        var i = l
        var j = m + 1
        var k = 0
        val temp = IntArray(r - l + 1)

        while (i <= m || j <= r) {
            when {
                // 第二个数组为空或者第一个数组的数据小于第二个数组的数据
                j > r || (i <= m && array[i] <= array[j]) -> temp[k++] = array[i++]
                else -> temp[k++] = array[j++]
            }
        }

        for (v in 0..r - l) {
            array[l + v] = temp[v]
        }
    }
}