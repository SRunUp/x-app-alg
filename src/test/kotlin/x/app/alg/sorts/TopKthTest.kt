package x.app.alg.sorts

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author shiyajun
 * @date 2020/9/9 11:11 上午
 */
internal class TopKthTest {
    @Test
    fun `use quick select`() {
        val arrange = intArrayOf(5, 11, 6, 7, 8)
        val excepted = 6
        val actual = findKthUseQuickSelect(arrange, 2)
        assertEquals(excepted, actual)
    }
}