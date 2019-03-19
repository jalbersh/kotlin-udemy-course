package hacker.solutionk

import junit.framework.Assert.assertEquals
import org.junit.Test
import java.util.*

class VisitorTest {

    @Test
    fun TestVisitor() {
        val numberOfNodes = 5
        var values = arrayListOf(4, 7, 2, 5, 12)
        var colors = arrayListOf(Color.RED,Color.GREEN,Color.RED,Color.RED,Color.GREEN)
        var map = HashMap<Int, HashSet<Int>>()
        var vals = arrayOf(intArrayOf(1,2),intArrayOf(1,3),intArrayOf(3,4),intArrayOf(3,5))
        var root: TreeNode
        for (i in 0 until numberOfNodes - 1) {
            val u = vals[i][0]
            val v = vals[i][1]
            var uedges: HashSet<Int>? = map[u]
            if (uedges == null) {
                uedges = HashSet()
                map[u] = uedges
            }
            uedges.add(v)
            var vedges: HashSet<Int>? = map[v]
            if (vedges == null) {
                vedges = HashSet()
                map[v] = vedges
            }
            vedges.add(u)
        }
        root = TreeNode(values.get(0),colors.get(0),0)
        VisitorDemo.createEdges(root, 1, values, colors, map)
        val vis1 = SumInLeavesVisitor()
        val vis2 = ProductOfRedNodesVisitor()
        val vis3 = FancyVisitor()

        root.accept(vis1)
        root.accept(vis2)
        root.accept(vis3)

        val res1 = vis1.getResult()
        val res2 = vis2.getResult()
        val res3 = vis3.getResult()

        assertEquals(24,res1)
        assertEquals(40,res2)
        assertEquals(15,res3)
    }
}