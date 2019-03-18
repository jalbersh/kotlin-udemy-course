package hacker.solution;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.ArrayList;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int result = 0;
    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private long result = 1;
    private final int MODULO = 1000000007;

    public int getResult() {
        return (int)result;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor().equals(Color.RED))
            result = (result*node.getValue()) % MODULO;
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.RED))
            result = (result*leaf.getValue()) % MODULO;
    }
}

class FancyVisitor extends TreeVis {
    int nonLeafNodesAtEvenDepth = 0;
    int greenLeafNodes = 0;
    public int getResult() {
        return Math.abs(nonLeafNodesAtEvenDepth-greenLeafNodes);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            nonLeafNodesAtEvenDepth += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.GREEN)) {
            greenLeafNodes += leaf.getValue();
        }
    }
}

public class VisitorDemo {

    private static int values[];
    private static Color colors[];
    private static Map<Integer, Set<Integer>> map = new HashMap<>();
    public static void setValues(int[] values) {
        VisitorDemo.values = values;
    }
    public static void setColors(Color[] colors) {
        VisitorDemo.colors = colors;
    }
    public static void setMap(Map<Integer, Set<Integer>> map) {
        VisitorDemo.map = map;
    }
    public static Tree solve() {
        Scanner in = new Scanner(System.in);

        int numberOfNodes = in.nextInt();
        values = new int[numberOfNodes];
        for(int index = 0; index < numberOfNodes; index++) {
            values[index] = in.nextInt();
        }
        colors = new Color[numberOfNodes];
        for (int i = 0; i < numberOfNodes; i++) {
            int val = in.nextInt();
            if (val == 0) colors[i] = Color.RED;
            else colors[i] = Color.GREEN;
        }
        TreeNode root = null;
        if (numberOfNodes == 1) {
            return new TreeLeaf(values[0],colors[0],0);
        } else {
            for (int i=0;i<numberOfNodes-1;i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                Set<Integer> uedges = map.get(u);
                if(uedges == null) {
                    uedges = new HashSet<>();
                }
                uedges.add(v);
                map.put(u, uedges);
                Set<Integer> vedges = map.get(v);
                if(vedges == null) {
                    vedges = new HashSet<>();
                }
                vedges.add(u);
                map.put(v, vedges);
            }
            in.close();
            if (numberOfNodes == 1) {
                return new TreeLeaf(values[0],colors[0],0);
            }
            root = new TreeNode(values[0],colors[0],0);
            createEdges(root,1);
            return root;
        }
    }
    protected static void createEdges(TreeNode parent, Integer parentNum) {
        /* Get HashSet of children and loop through them */
        for (Integer treeNum : map.get(parentNum)) {
            map.get(treeNum).remove(parentNum); // removes the opposite arrow direction

            /* Add child */
            Set<Integer> edges = map.get(treeNum);
            boolean hasChild = (edges != null && !edges.isEmpty());
            Tree tree;
            if (hasChild) {
                tree = new TreeNode(values[treeNum-1],colors[treeNum-1],parent.getDepth()+1);
            } else {
                tree = new TreeLeaf(values[treeNum-1],colors[treeNum-1],parent.getDepth()+1);
            }
            parent.addChild(tree);
            /* Recurse if necessary */
            if (tree instanceof TreeNode) {
                createEdges((TreeNode) tree, treeNum);
            }
        }
    }
    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
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