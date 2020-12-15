package x.app.alg.tree

/**
 * @author shiyajun
 * @date 2020/12/8 2:58 下午
 * */

/**
 * B+ 树非叶子节点的定义
 *
 * 假设 keywords=[3,5,8,10]
 * 4 个键值将数据分为 5 个区间：[-INF,3, [3,5), [5,8), [8,10), [10,INF)
 * 5 个区间分别对应：children[0]..children[1]
 *
 * m 值是事先计算得到的，计算的依据是让所有信息的大小正好等于也得大小
 * PAGE_SIZE = (m-1)*4[keywords大小]+m*8[children大小]
 * */
class BPlusTreeNode {
    // 键值，用来划分数据区间
    val keywords = arrayOfNulls<Int>(m - 1)

    // 保存子节点指针
    var children = arrayOfNulls<BPlusTreeNode>(m)

    companion object {
        // 5 叉树
        private const val m = 5
    }
}

/**
 * B+ 树中叶子节点的定义
 *
 * B+ 树中的叶子节点跟内部节点是不一样的，
 * 叶子节点存储的值，而非区间。
 * 这个定义⾥，每个叶⼦节点存储3个数据⾏的键值及地址信息。
 *
 * k 值是事先计算得到的，计算的依据是让所有信息的⼤⼩正好等于⻚的⼤⼩：
 * PAGE_SIZE = k*4[keyw..⼤⼩]+k*8[dataAd..⼤⼩]+8[prev⼤⼩]+8[next⼤⼩]
 * */
class BPlusTreeLeafNode {
    // 数据的键值
    val keywords = arrayOfNulls<Int>(k)

    // 数据的地址
    val dataAddress = arrayOfNulls<Long>(k)

    lateinit var prev: BPlusTreeLeafNode

    lateinit var next: BPlusTreeLeafNode


    companion object {
        private const val k = 3
    }
}