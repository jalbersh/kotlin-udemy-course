package hacker.solution;

class Stack {
    Node elements = null;
    Boolean isEmpty() {
        if (elements == null) return true;
        return false;
    }
    Node push(Object obj) {
        Node node = new Node(obj,elements);
        elements = node;
        return node;
    }
    Object peek() {
        if (elements != null) return elements.obj;
        return null;
    }
    Object pop() {
        Node node = elements;
        elements = elements.next;
        return node.obj;
    }
    Boolean contains(Object obj) {
        Node walk = elements;
        while (walk != null) {
            if (walk.obj.equals(obj)) return true;
            walk = walk.next;
        }
        return false;
    }
    public static void main(String[] args) {
            Stack s = new Stack();
            if (s.isEmpty() != true) System.out.println("1Failed"); else System.out.println("1Succeeded");
            s = new Stack();s.push("apples");
            if (s.isEmpty() != false) System.out.println("2Failed"); else System.out.println("2Succeeded");
            s = new Stack();s.push("apples");
            if (!"apples".equals(s.peek())) System.out.println("3Failed"); else System.out.println("3Succeeded");
            s = new Stack();
            if (s.peek() != null) System.out.println("4Failed"); else System.out.println("4Succeeded");
            s = new Stack();s.push("apples");
            if ("oranges".equals(s.peek()) == true) System.out.println("5Failed"); else System.out.println("5Succeeded");
            s = new Stack();
            if (s.contains("anything") == true) System.out.println("6Failed"); else System.out.println("6Succeeded");
            s = new Stack(); s.push("apples");
            if (s.contains("anything") == true) System.out.println("7Failed"); else System.out.println("7Succeeded");
            s = new Stack();s.push("apples");
            if (s.contains("apples") == false) System.out.println("8Failed"); else System.out.println("8Succeeded");
            s = new Stack();
            s.push("apples");
            s.push("pears");
            s.push("plums");
            if (s.contains("oranges") == true) System.out.println("9Failed"); else System.out.println("9Succeeded");
            s = new Stack();
            s.push("apples");
            s.push("pears");
            s.push("plums");
            if (s.contains("apples") == false) System.out.println("10Failed"); else System.out.println("10Succeeded");
    }
}