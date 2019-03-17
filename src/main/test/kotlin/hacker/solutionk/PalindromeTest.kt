package hacker.solutionk 

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class PalindromeTest {

    @Test
    fun palindromeTest() {
        assertEquals("Yes",Palindrome.isPalindrome("albeisasiebla"))
        assertEquals("No",Palindrome.isPalindrome("able"))
    }
}


