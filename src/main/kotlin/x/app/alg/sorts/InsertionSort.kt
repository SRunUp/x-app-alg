package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/8 4:39 下午
 * */
object InsertionSort {
    fun sort(array: IntArray) {
        val n = array.size
        for (i in 1 until n) {
            val key = array[i]
            var j = i - 1
            //移动数据
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]
                --j
            }
            array[j + 1] = key
            array.print() { "当前数组：" }

        }
    }
}