/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import Exceptions.EmptyCollectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author racta
 */
public class ArrayListStackTest {

    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        try {
            ArrayListStack<String> instance = new ArrayListStack<>();
            //Assert that the stack is empty
            assertTrue(instance.isEmpty());
            //Push a string into the stack
            instance.push("Squeak");
            //Assert that there is one entry in the stack
            assertEquals(1, instance.size());
            //Push two more entries into the stack
            instance.push("Mouse");
            instance.push("Mice");
            //Assert that the top of the stack is the last entry
            //we pushed into the stack
            assertEquals("Mice", instance.peek());
        } catch (EmptyCollectionException ex) {
            fail("Unexpected ECE - testPush");
        }
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        ArrayListStack instance = new ArrayListStack();
        //Create a String object
        String obj;
        //Push two entries into the stack
        instance.push("Squeak");
        instance.push("Mouse");
        //Assert that the stack contians two entries
        assertEquals(2, instance.size());
        //Pop the last entry added
        obj = (String) instance.pop();
        //Assert that there is one entry in the stack
        //and that the entry that was popped was the last entry added
        assertEquals(1, instance.size());
        assertEquals(obj, "Mouse");
        //Pop that last entry
        obj = (String) instance.pop();
        assertEquals(obj, "Squeak");
        //Assert that stack is now empty
        assertTrue(instance.isEmpty());
        try {
            instance.pop();
            assertTrue(instance.isEmpty());
        } catch (EmptyCollectionException e) {
            System.out.println("Unexpected ECE - testPop");
            assertTrue("caught exception", true);
        }
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        ArrayListStack i2 = new ArrayListStack();
        //Push two entries into the stack
        instance.push("Squeak");
        instance.push("Mouse");
        //Assert that there are two entries in the stack
        assertEquals(2, instance.size());
        //Assert that the top entry by using the peek method.
        assertEquals("Mouse", instance.peek());
        try {
            i2.peek();
        } catch (EmptyCollectionException e) {
            System.out.println("Unexpected ECE - testPeek");
            assertTrue("caught exception", true);
        }
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("empty");
        ArrayListStack instance = new ArrayListStack();
        //Assert that the list is empty
        assertEquals(0, instance.size());
    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        ArrayListStack instance = new ArrayListStack();
        //Assert that the list is empty
        assertEquals(0, instance.size());
        //Push an entry into the stack
        instance.push("Mice");
        //Assert that the stack contians 1 entry
        assertEquals(1, instance.size());
        //Push a second sntry into the stack
        instance.push("Like");
        //Assert that the stack contains 2 entries
        assertEquals(2, instance.size());
        //Add a third and final entry to the stack
        instance.push("Cheese");
        //Assert that the stack containse 3 entries
        assertEquals(3, instance.size());
    }
}
