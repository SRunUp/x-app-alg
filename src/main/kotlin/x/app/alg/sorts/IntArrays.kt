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

fun IntArray.print() {
    println(this.joinToString(","))
}