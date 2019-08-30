package hacker.solutionk

class Stack {
    var elements:Node? = null
    fun isEmpty():Boolean {
        if (elements == null) return true
        return false
    }
    fun push(obj:String):Node {
        val node:Node = Node(obj,elements)
        elements = node
        return node
    }
    fun peek():String? {
        return elements?.obj
    }
    fun pop():String? {
        var node:Node? = elements
        elements = elements?.next
        return node?.obj
    }
    fun contains(obj:String):Boolean {
        var walk:Node? = elements
        while (walk != null) {
            if (walk.obj.equals(obj)) return true
            walk = walk.next
        }
        return false
    }
}