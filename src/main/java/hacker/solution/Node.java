package hacker.solution;

public class Node {
    public Node(Object o, Node n) {
        this.obj = o;
        this.next = n;
    }
    public Node(Object o) {
        this.obj = o;
        this.next = null;
    }
    Object obj;
    Node next;
}
