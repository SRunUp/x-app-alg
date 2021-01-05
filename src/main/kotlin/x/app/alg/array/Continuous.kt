package x.app.alg.array

/**
 * @author shiyajun
 * @date 2020/12/15 11:16 上午
 * 连续的区间信息
 * */
object Continuous {
    fun consecutiveRange(array: IntArray): List<List<Int>> {
        val result = arrayListOf<List<Int>>()
        var start = 0
        var end = 0
        for (i in array.indices) {
            // 连续时，移动 end 指针位置
            if (end + 1 <= array.lastIndex && array[i] == array[i + 1] - 1) {
                end = i + 1
                continue
            }

            // 不连续时，就添加内容
            result.add(array.slice(start..end))
            // start / end 指针往后移动一位
            start = i + 1
            end++
        }

        return result
    }
}