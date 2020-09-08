package x.app.alg.sorts

import org.junit.jupiter.api.Test

internal class BubbleSortTest {
    @Test
    fun test() {
        val array = intArrayOf(5, 11, 8, 6, 7)
        BubbleSort.sort(array)
        array.print()
    }
}