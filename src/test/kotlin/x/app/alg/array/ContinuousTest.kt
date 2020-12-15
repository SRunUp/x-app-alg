package x.app.alg.array

import org.junit.jupiter.api.Test

/**
 * @author shiyajun
 * @date 2020/12/10 3:59 下午
 */
class ContinuousTest {
    @Test
    fun test() {
        val array = intArrayOf(1, 2, 3, 5, 8, 9, 11)
        val result = Continuous.consecutiveRange(array)

        for (r in result) {
            println(r)
        }
    }
}