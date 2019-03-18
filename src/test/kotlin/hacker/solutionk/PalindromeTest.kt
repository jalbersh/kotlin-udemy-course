package hacker.solutionk 

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class PalindromeTest {

    @Test
    fun palindromeTest() {
        assertEquals("Yes",Palindrome.isPalindrome("albeisasiebla"))
        assertNotEquals("Yes",Palindrome.isPalindrome("able"))
    }
}

