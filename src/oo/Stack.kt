package oo

class Stack<E>(vararg val elements: E) {
    val items = elements.toMutableList()
    fun push(item: E) {
        items.add(item)
    }
    fun pop(): E? {
        if (!items.isEmpty()) {
            return items.removeAt(items.size-1)
        } else {
            return null
        }
    }
    fun isEmpty(): Boolean {
        return items.isEmpty()
    }
}

fun main(args: Array<String>) {
    val stack = Stack(3,1,6,9)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
}