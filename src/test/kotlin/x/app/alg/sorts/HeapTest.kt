package x.app.alg.sorts

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * @author shiyajun
 * @date 2020/9/17 4:09 下午
 */
internal class HeapTest {
    @Test
    fun `heap sort`() {
        val array = intArrayOf(5, 3, 2, 6, 8, 7).toTypedArray()
        heapSort(array)
        println(array.joinToString(","))
    }
}