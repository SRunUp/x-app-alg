package x.app.alg.map.lab

import org.junit.jupiter.api.Test
import java.util.*

/**
 * @author shiyajun
 * @date 2020/10/30 3:00 下午
 */
class HashMapLab {
    @Test
    fun `simple test`() {
        val map = mapOf(Pair(1, 1), Pair(2, 2))

        for (key in map.keys) {
            println(key)
        }
        for ((key, value) in map) {
            println("[$key] = ($value)")
        }

        map.getOrDefault(1,2)
    }
}