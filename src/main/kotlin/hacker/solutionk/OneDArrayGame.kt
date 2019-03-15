package hacker.solutionk

import java.util.*

object OneDArrayGame {
    private fun canWin(leap: Int, game: IntArray): Boolean {
        var used = IntArray(game.size)
        for (i in 0 until game.size) used[i]=0
        var position=0;
        var flag: Boolean = true;
        while(flag) {
            if (used[position] == 1) return false;
            used[position]=1;
            if (position < 0 || game[position] == 1) return false
            if (position+leap >= game.size || position+1 >= game.size) return true;
            if (game[position+leap] == 0) position += leap
            else if (game[position+1] == 0) position += 1
            else if (game[position-1] == 0) position -= 1
        }
        return flag
    }
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        var q = scan.nextInt()
        while (q-- > 0) {
            val n = scan.nextInt()
            val leap = scan.nextInt()

            val game = IntArray(n)
            for (i in 0 until n) {
                game[i] = scan.nextInt()
            }

            println(if (canWin(leap, game)) "YES" else "NO")
        }
        scan.close()
    }
}