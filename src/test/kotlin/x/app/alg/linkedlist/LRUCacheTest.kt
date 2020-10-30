package x.app.alg.linkedlist

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.LinkedHashMap

/**
 * @author shiyajun
 * @date 2020/10/30 11:01 上午
 */
class LRUCacheTest {
    @Test
    fun `simple test`() {
        val lruCache = LRUCache(2)
        lruCache.put(1, 1)
        lruCache.put(2, 2)

        println(lruCache[1])
        lruCache.put(3, 3)

        println(lruCache[2])
        println(lruCache[3])
    }
}