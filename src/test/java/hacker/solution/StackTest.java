package hacker.solution;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;

public class StackTest {

    private Stack s;

    @BeforeEach
    public void init() {
        s = new Stack();
    }

    @Test
    public void testEmpty() {
        assertTrue(s.isEmpty());
    }
    @Test
    public void testNotEmpty() {
        s.push("apples");
        assertFalse(s.isEmpty());
    }
    @Test
    public void testPeek() {
        s.push("apples");
        assertEquals("apples",s.peek());
    }
    @Test
    public void testPeekOnEmpty() {
        assertNull(s.peek());
    }
    @Test
    public void testPeekNotSame() {
        s.push("apples");
        assertFalse("oranges".equals(s.peek()));
    }
    @Test
    public void testContainsOnEmpty() {
        assertFalse(s.contains("anything"));
    }
    @Test
    public void testContainsSomething() {
        s.push("apples");
        assertFalse(s.contains("anything"));
    }
    @Test
    public void testContainsSame() {
        s.push("apples");
        assertTrue(s.contains("apples"));
    }
    @Test
    public void testPushMultiplesContainsNotIn() {
        s.push("apples");
        s.push("pears");
        s.push("plums");
        assertFalse(s.contains("oranges"));
    }
    @Test
    public void testPushMultiplesContainsIn() {
        s.push("apples");
        s.push("pears");
        s.push("plums");
        assertTrue(s.contains("apples"));
    }
}