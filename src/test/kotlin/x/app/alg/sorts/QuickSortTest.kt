package x.app.alg.sorts

import org.junit.jupiter.api.Test

/**
 * @author shiyajun
 * @date 2020/9/7 11:14 上午
 */
internal class QuickSortTest {

    @Test
    fun sort() {
        val array = intArrayOf(5, 11, 8, 6, 7)
        QuickSort.sort(array)
        array.print()
    }
}