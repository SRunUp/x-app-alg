package x.app.alg.sorts

import org.junit.jupiter.api.Test

internal class BubbleSortTest {
    @Test
    fun test() {
        val array = intArrayOf(5, 4, 3, 1, 6)
        BubbleSort.sort(array)

        println(array.joinToString(","))
    }
}