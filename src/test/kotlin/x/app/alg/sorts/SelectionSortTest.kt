package x.app.alg.sorts

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SelectionSortTest {

    @Test
    fun test() {
        val array = intArrayOf(5, 4, 3, 1, 6)
        SelectionSort.sort(array)

        println(array.joinToString(","))
    }

}