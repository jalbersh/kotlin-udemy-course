package hacker.solution;

import junit.framework.TestCase;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class VariableArgsAddTest extends TestCase {

    @Test
    public void testAdder() {
        Add ob = new Add();
        try {
            int n1 = 1;
            int n2 = 2;
            int n3 = 3;
            int n4 = 4;
            int n5 = 5;
            int n6 = 6;
            assertEquals(ob.add(n1, n2),3);
            assertEquals(ob.add(n1, n2, n3),6);
            assertEquals(ob.add(n1, n2, n3, n4),10);
            assertEquals(ob.add(n1, n2, n3, n4, n5),15);
            assertEquals(ob.add(n1, n2, n3, n4, n5, n6),21);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());
            }
            assertFalse(overload);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}