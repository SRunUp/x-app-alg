package x.app.alg.sorts

import org.junit.jupiter.api.Test

/**
 * @author shiyajun
 * @date 2020/9/9 2:52 下午
 */
internal class MergeSortTest {

    @Test
    fun sort() {
        val array = intArrayOf(5, 11, 7, 6, 8)
        MergeSort.sort(array)

        array.print()
    }
}