package hacker.solutionk

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin
import java.io.UnsupportedEncodingException
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*

object Sha256 {
    @JvmStatic
    fun main(args: Array<String>) {
        val scan = Scanner(System.`in`)
        val s = scan.nextLine()
        try {
            val bytes = s.toByteArray(charset("US-ASCII"))
            val digest = MessageDigest.getInstance("SHA-256")
            val hashBytes = digest.digest(bytes)
            println(StringBuffer(HexBin.encode(hashBytes).toLowerCase()))
        } catch (uee: UnsupportedEncodingException) {
            println("Problem encoding bytes: " + uee.message)
        } catch (nsa: NoSuchAlgorithmException) {
            println("Problem finding hashing algorithm: " + nsa.message)
        }

    }
}
