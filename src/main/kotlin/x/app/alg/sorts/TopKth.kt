package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:52 上午
 * Top K
 * */

fun findKthUseQuickSelect(array: IntArray, k: Int): Int {
    if (array.isEmpty() || array.size < k) return -1

    var p = partition(array, 0, array.size - 1)

    while (k != p + 1) {
        p = when {
            k > p + 1 -> partition(array, p + 1, array.size - 1)
            else -> partition(array, 0, p - 1)
        }
    }

    return array[p]
}
