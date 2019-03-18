package hacker.solutionk

import java.util.ArrayList
import java.io.*
import java.util.*
import java.text.*
import java.math.*
import java.util.regex.*
import java.util.Scanner

enum class Color {
    RED, GREEN
}

abstract class Tree(val value: Int, val color: Color, val depth: Int) {
    abstract fun accept(visitor: TreeVis)
}

class TreeNode(value: Int, color: Color, depth: Int) : Tree(value, color, depth) {
    private val children = ArrayList<Tree>()
    override fun accept(visitor: TreeVis) {
        visitor.visitNode(this)

        for (child in children) {
            child.accept(visitor)
        }
    }

    fun addChild(child: Tree) {
        children.add(child)
    }
}

class TreeLeaf(value: Int, color: Color, depth: Int) : Tree(value, color, depth) {
    override fun accept(visitor: TreeVis) {
        visitor.visitLeaf(this)
    }
}

abstract class TreeVis {
    abstract fun getResult(): Int
    abstract fun visitNode(node: TreeNode)
    abstract fun visitLeaf(leaf: TreeLeaf)

}

internal class SumInLeavesVisitor : TreeVis() {
    private var result = 0
    override fun getResult(): Int = result
    override fun visitNode(node: TreeNode) {}
    override fun visitLeaf(leaf: TreeLeaf) {
        result += leaf.value
    }
}

internal class ProductOfRedNodesVisitor : TreeVis() {
    private var result:Long = 1
    private val MODULO = 1000000007
    override fun getResult(): Int = result.toInt()
    override fun visitNode(node: TreeNode) {
        if (node.color == Color.RED)
            result = result * node.value % MODULO
    }
    override fun visitLeaf(leaf: TreeLeaf) {
        if (leaf.color == Color.RED)
            result = result * leaf.value % MODULO
    }
}

internal class FancyVisitor : TreeVis() {
    var nonLeafNodesAtEvenDepth = 0
    var greenLeafNodes = 0
    override fun getResult(): Int
         = Math.abs(nonLeafNodesAtEvenDepth - greenLeafNodes)
    override fun visitNode(node: TreeNode) {
        if (node.depth % 2 == 0) {
            nonLeafNodesAtEvenDepth += node.value
        }
    }
    override fun visitLeaf(leaf: TreeLeaf) {
        if (leaf.color == Color.GREEN) {
            greenLeafNodes += leaf.value
        }
    }
}

object VisitorDemo {

//    private var values: ArrayList<Int> = ArrayList<Int>()
//    private var colors: ArrayList<Color> = ArrayList<Color>()
//    private val map = HashMap<Int, HashSet<Int>>()

    fun solve(): Tree {
        val `in` = Scanner(System.`in`)
        val numberOfNodes = `in`.nextInt()
        var values = ArrayList<Int>(numberOfNodes)
        var colors = ArrayList<Color>(numberOfNodes)
        var map = HashMap<Int, HashSet<Int>>()
        for (i in 0 until numberOfNodes) {
            values.add(i,`in`.nextInt())
        }
        for (i in 0 until numberOfNodes) {
            if (`in`.nextInt() == 0)
                colors.add(i,Color.RED)
            else
                colors.add(i,Color.GREEN)
        }
        var root: TreeNode? = null
        if (numberOfNodes == 1) {
            return TreeLeaf(values.get(0),colors.get(0),0)
        } else {
            for (i in 0 until numberOfNodes - 1) {
                val u = `in`.nextInt()
                val v = `in`.nextInt()
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
            `in`.close()
            if (numberOfNodes == 1) {
                return TreeLeaf(values.get(0),colors.get(0),0)
            }
            root = TreeNode(values.get(0),colors.get(0),0)
            createEdges(root, 1, values, colors, map)
            return root
        }
    }

    fun createEdges(parent: TreeNode, parentNum: Int?, values: ArrayList<Int>, colors: ArrayList<Color>, map: HashMap<Int, HashSet<Int>>) {
        var ints: HashSet<Int> ?= map.get(parentNum)
        var iterator: Iterator<Int> = ints!!.iterator()
        while (iterator.hasNext()) {
            var treeNum = iterator.next()
            map[treeNum]!!.remove(parentNum)

            val edges = map[treeNum]
            val hasChild = edges != null && !edges.isEmpty()
            val tree: Tree
            if (hasChild) {
                tree = TreeNode(values.get(treeNum-1),colors.get(treeNum-1),parent.depth + 1)
            } else {
                tree = TreeLeaf(values.get(treeNum-1),colors.get(treeNum-1),parent.depth + 1)
            }
            parent.addChild(tree)
            if (tree is TreeNode) {
                createEdges(tree, treeNum, values, colors, map)
            }
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {

        val root = solve()
        val vis1 = SumInLeavesVisitor()
        val vis2 = ProductOfRedNodesVisitor()
        val vis3 = FancyVisitor()

        root.accept(vis1)
        root.accept(vis2)
        root.accept(vis3)

        val res1 = vis1.getResult()
        val res2 = vis2.getResult()
        val res3 = vis3.getResult()

        println(res1)
        println(res2)
        println(res3)
    }
}


/*

inputs of:

5
4 7 2 5 12
0 1 0 0 1
1 2
1 3
3 4
3 5

should give output values of:

24
40
15

 */