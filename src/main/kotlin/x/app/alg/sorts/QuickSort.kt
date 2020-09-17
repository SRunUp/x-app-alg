package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/7 10:50 上午
 * */

fun quickSort(array: IntArray) {
    quickSortInternally(array, 0, array.size - 1)
}

private fun quickSortInternally(array: IntArray, l: Int, r: Int) {
    if (l >= r) return
    val q = partition(array, l, r)
    quickSortInternally(array, l, q - 1)
    quickSortInternally(array, q + 1, r)
}


/**
 * 分区操作
 * */
fun partition(array: IntArray, l: Int, r: Int): Int {
    val pivot = array[r]
    var i = l

    for (j in l until r) {
        if (array[j] < pivot) {
            array.swap(i, j)
            i++
        }
    }
    array.swap(i, r)
    return i
}

/**
 * 泛型实现方式
 * */
fun <T : Comparable<T>> partition(array: Array<T>, low: Int, high: Int): Int {
    var left = low
    var right = high
    val mid = left + (right - left) / 2
    val pivot = array[mid]

    while (left <= right) {
        while (array[left] < pivot) {
            left++
        }

        while (array[right] > pivot) {
            right--
        }

        if (left <= right) {
            swap(array, left, right)
            left++
            right--
        }
    }
    return left
}