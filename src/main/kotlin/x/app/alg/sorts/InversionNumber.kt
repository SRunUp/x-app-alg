package x.app.alg.sorts

/**
 * @author shiyajun
 * @date 2020/9/14 10:04 上午
 * 数组中的逆序对 --> 如果 array[i] > array[j] 那么 i < j
 * */
fun inversionUseLoop(array: IntArray): Int {
    var result = 0
    for (i in array.indices) {
        for (j in i + 1 until array.size) {
            if (array[i] > array[j]) {
                result++
            }
        }
    }

    return result
}

fun inversion(array: IntArray): Int {
    return inversionInternally(array, 0, array.size - 1)
}

fun inversionInternally(array: IntArray, l: Int, r: Int): Int {
    if (l >= r) return 0
    val m = l + (r - l) / 2
    val a = inversionInternally(array, l, m)
    val b = inversionInternally(array, m + 1, r)
    val c = acrossNumber(array, l, m, r)
    return a + b + c
}

fun acrossNumber(array: IntArray, l: Int, m: Int, r: Int): Int {
    var i = l
    var j = m + 1
    var k = 0
    val temp = IntArray(r - l + 1)
    var result = 0

    while (i <= m || j <= r) {
        when {
            // 第二个数组为空或者第一个数组的数据小于第二个数组的数据
            j > r || (i <= m && array[i] <= array[j]) -> temp[k++] = array[i++]
            else -> {
                result += (m - i + 1)
                temp[k++] = array[j++]
            }
        }
    }

    for (v in 0..r - l) {
        array[l + v] = temp[v]
    }

    return result
}

 