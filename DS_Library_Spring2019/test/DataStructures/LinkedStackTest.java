/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import Exceptions.EmptyCollectionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bryson
 */
public class LinkedStackTest {

    public LinkedStackTest() {
    }

    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop() throws Exception {
        System.out.println("pop");
        LinkedStack<String> instance = new LinkedStack<>();
       try{
            String test = instance.pop();
            assertTrue(instance.isEmpty());
        }catch(EmptyCollectionException e)
        {
            System.out.println("Exception thrown in testPOP");
            assertTrue("caught exception", true);
        }
        String obj;
        instance.push("pina coolada");
        instance.push("yeetis");
        assertEquals(2, instance.size());
        obj = instance.pop();
        assertEquals(1, instance.size());
        assertEquals(obj, "yeetis");
        obj = instance.pop();
        assertEquals(obj, "pina coolada");
        assertTrue(instance.isEmpty());
        

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        try {
            LinkedStack<String> instance = new LinkedStack<>();
            assertTrue(instance.isEmpty());
            instance.push("fart hehehehe");
            assertEquals(1, instance.size());
            instance.push("yeet hehehehe");
            instance.push("smoothie hehehehe");

            assertEquals("smoothie hehehehe", instance.peek());

// TODO review the generated test code and remove the default call to fail.
//  fail("The test case is a prototype.");
        } catch (EmptyCollectionException ex) {
            fail("Some how none of that worked");
        }
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testPeek() throws Exception {
        System.out.println("peek");
        LinkedStack<String> instance = new LinkedStack<>();
        LinkedStack<String> instance2 = new LinkedStack<>();
        instance.push("hello");
        instance.push("goodbye");
        //String obj = instance.peek();
        assertEquals(2, instance.size());
        assertEquals("goodbye", instance.peek());
        try
        {
            instance2.peek();
        }catch(EmptyCollectionException e)
        {
            System.out.println("Exception thrown in testPOP");
            assertTrue("caught exception", true);
        }
    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        LinkedStack instance = new LinkedStack();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class LinkedStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        LinkedStack instance = new LinkedStack();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LinkedStack.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LinkedStack instance = new LinkedStack();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
