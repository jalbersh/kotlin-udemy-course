package hacker.solutionk

object InheritanceDemo1 {
    @JvmStatic
    fun main(args: Array<String>) {
        val bird = Bird();
        bird.walk()
        bird.fly()
        bird.sing()
    }
}