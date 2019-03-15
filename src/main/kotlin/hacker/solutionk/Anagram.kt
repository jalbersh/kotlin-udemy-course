package hacker.solutionk

import java.util.*

object Anagram {
    fun isAnagram(a: String, b: String): Boolean {
        var a = a
        var b = b
        // Complete the function
        a = a.toLowerCase()
        b = b.toLowerCase()
        if (a.length != b.length) return false
        if (a == b) return true
        //        if (a.equals(reverse(b))) return true;
        val aset = HashSet<Char>()
        val aletters = a.toCharArray()
        val bletters = b.toCharArray()
        val bset = HashSet<Char>()
        for (i in 0 until a.length) {
            aset.add(aletters[i])
            bset.add(bletters[i])
        }
        if (aset.size != bset.size) return false
        val amap = HashMap<Char, Int>()
        val bmap = HashMap<Char, Int>()
        val ait = aset.iterator()
        while (ait.hasNext()) {
            val c = ait.next()
            val origLength = a.length
            val newLength = a.replace(c.toString().toRegex(), "").length
            val occurences = origLength - newLength
            amap[c] = occurences
        }
        val bit = bset.iterator()
        while (bit.hasNext()) {
            val c = bit.next()
            val origLength = b.length
            val newLength = b.replace(c.toString().toRegex(), "").length
            val occurences = origLength - newLength
            bmap[c] = occurences
        }
        if (amap.size != bmap.size) return false
        for (i in 0 until amap.size) {
            val c = aset.toTypedArray()[i]
            var aOccurs: Int? = 0
            var bOccurs: Int? = 0
            try {
                aOccurs = amap[c]
                bOccurs = bmap[c]
            } catch (e: Exception) {
            }

            if (aOccurs != bOccurs) return false
        }
        return true
    }

    @JvmStatic
    fun main(args: Array<String>) {

        val scan = Scanner(System.`in`)
        val a = scan.next()
        val b = scan.next()
        scan.close()
        val ret = isAnagram(a, b)
        println(if (ret) "Anagrams" else "Not Anagrams")
    }
}