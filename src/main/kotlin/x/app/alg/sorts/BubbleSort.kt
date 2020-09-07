package x.app.alg.sorts

/**
 * 冒泡排序
 * 只会操作相邻的元素
 * 每次冒泡对两个元素进行比较，满足大小关系就互换位置
 * 一次冒泡会至少让一个元素移动到它应该在的位置，重复 n 次就完成了 n 个数据的排序工作*/
object BubbleSort {
    fun sort(array: IntArray) {
        if (array.isEmpty()) {
            return
        }

        val n = array.size
        var swapped = false

        for (i in array.indices) {
            for (j in 0 until n - i - 1) {
                if (array[j] > array[j + 1]) {
                    // 交换次数等于 满有序度 n*(n-1)/2 - 初始有虚度
                    // 如何计算初始有序度？
                    Utils.swap(array, j, j + 1)
                    swapped = true
                }
            }
            if (!swapped) break
        }
    }
}