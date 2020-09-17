package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:52 上午
 * */
fun IntArray.swap(i: Int, j: Int) {
    if (i == j) return
    if (this[i] == this[j]) return

    val temp = this[i]
    this[i] = this[j]
    this[j] = temp
}

fun <T : Comparable<T>> swap(array: Array<T>, idx1: Int, idx2: Int) {
    if (idx1 == idx2 || array[idx1] == array[idx2]) return

    array[idx1] = array[idx2].also {
        array[idx2] = array[idx1]
    }
}

fun IntArray.print() {
    println(this.joinToString(","))
}

fun IntArray.print(lazyMessage: () -> String) {
    println("""${lazyMessage()} [${this.joinToString(",")}]""")
}
