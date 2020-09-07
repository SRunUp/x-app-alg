package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:52 上午
 * */
object Utils {
    fun swap(array: IntArray, i: Int, j: Int) {
        if (i == j) return
        if (array[i] == array[j]) return

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }


    fun print(array: IntArray) {
        println(array.joinToString(","))
    }
}