package x.app.alg.linkedlist

import org.junit.jupiter.api.Test
import java.util.*

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

    @Test
    fun `linked hashmap`() {
        val m = linkedMapOf<Int, Int>()
        m[3] = 11
        m[1] = 12
        m[5] = 23
        m[2] = 22

        for ((key, _) in m) {
            println(key)
        }
    }

    @Test
    fun isValid() {
        val s = "()"
        val stack = LinkedList<Char>()

        val parenMap = mapOf(')' to '(', ']' to '[', '}' to '{')
        for (c in s) {
            if (!parenMap.containsKey(c)) {
                stack.push(c)
            } else if (stack.isNotEmpty() && parenMap[c] != stack.pop()) {
                System.err.println("stack is empty")
            }
        }

    }
}