package x.app.alg.sorts

object Utils {
    fun swap(array: IntArray, i: Int, j: Int) {
        if (i == j) return
        if (array[i] == array[j]) return

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}