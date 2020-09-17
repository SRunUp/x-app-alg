package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/17 2:54 下午
 * */
fun <T : Comparable<T>> heapSort(array: Array<T>) {
    buildMaxHeap(array)
    transformMaxHeapToSortedArray(array)
}


fun <T : Comparable<T>> maxHeapify(array: Array<T>, heapSize: Int, index: Int) {
    val left = 2 * index + 1
    val right = 2 * index + 2
    var largest = index

    if (left < heapSize && array[left] > array[largest])
        largest = left
    if (right < heapSize && array[right] > array[largest])
        largest = right
    if (largest != index) {
        swap(array, index, largest)
        maxHeapify(array, heapSize, largest)
    }
}

/**
 * 构造大顶堆 - 从下往上堆化
 * */
private fun <T : Comparable<T>> buildMaxHeap(array: Array<T>) {
    val n = array.size
    for (i in (n / 2 - 1) downTo 0) {
        maxHeapify(array, n, i)
    }
}

private fun <T : Comparable<T>> transformMaxHeapToSortedArray(array: Array<T>) {
    for (i in (array.size - 1) downTo 0) {
        swap(array, i, 0)
        maxHeapify(array, i, 0)
    }
}