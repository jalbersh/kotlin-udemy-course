package hacker.solutionk

import java.util.*

    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val n = scan.nextInt()

        val player = arrayOfNulls<Player>(n)
        val checker = CheckerComparator()

        for (i in 0 until n) {
            player[i] = Player(scan.next(), scan.nextInt())
        }
        scan.close()

        Arrays.sort<Player>(player, checker)
        for (i in player.indices) {
            System.out.printf("%s %s\n", player[i]?.name, player[i]?.score)
        }
    }
