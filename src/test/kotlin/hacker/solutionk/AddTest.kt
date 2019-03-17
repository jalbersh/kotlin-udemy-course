package hacker.solutionk

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

object AddTest {
    @Test
    fun testAdd() {
        val ob = Add()
        try {
            val n1 = 1
            val n2 = 2
            val n3 = 3
            val n4 = 4
            val n5 = 5
            val n6 = 6
//        assertEquals(ob.add(n1, n2), 3)
//        assertEquals(ob.add(n1, n2, n3), 6)
//        assertEquals(ob.add(n1, n2, n3, n4), 10)
//        assertEquals(ob.add(n1, n2, n3, n4, n5), 15)
//        assertEquals(ob.add(n1, n2, n3, n4, n5, n6), 21)
            val methods = Add::class.java.declaredMethods
            val set = HashSet<String>()
            var overload = false
            for (i in methods.indices) {
                if (set.contains(methods[i].name)) {
                    overload = true
                    break
                }
                set.add(methods[i].name)
            }
            assertFalse(overload)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
