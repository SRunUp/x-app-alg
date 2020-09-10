package x.app.alg.sorts

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

/**
 * @author shiyajun
 * @date 2020/9/10 2:27 下午
 */
internal class InsertionSortTest {

    @Test
    fun sort() {
        val array = intArrayOf(5, 11, 8, 6, 7)
        InsertionSort.sort(array)
    }
}