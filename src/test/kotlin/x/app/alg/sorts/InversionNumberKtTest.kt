package x.app.alg.sorts

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * @author shiyajun
 * @date 2020/9/14 10:10 上午
 */
internal class InversionNumberKtTest {
    @Test
    fun `inversion number user loop`() {
        val array = intArrayOf(5, 7, 11, 6, 8)
        val actual = inversionUseLoop(array)
        assertEquals(3, actual)
    }

    @Test
    fun `inversion number user merge sort`() {
        val array = intArrayOf(5, 7, 11, 6, 8)
        val actual = inversion(array)
        assertEquals(3, actual)
    }
}