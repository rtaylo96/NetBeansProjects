package Shopping;

import DataStructures.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class ShoppingListArrayListTest {

    private final ShoppingListArrayList instance;

    /**
     * Initialize instance and entries
     */
    public ShoppingListArrayListTest() {
        instance = new ShoppingListArrayList();
    }

    /**
     * Test of add method, of class ShoppingArray.
     */
    @Test
    public void testAdd() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        
        // Assert that there are no entries in the list.
        assertEquals(0, instance.size());
        
        // Add an entry
        instance.add(entry1);
        
        // The list ahould not be empty now.
        assertEquals(1, instance.size());
        
        // Add another entry
        instance.add(entry2);
        
        // The list should now contain 2 entries
        assertEquals(2, instance.size());
        
        // check that there are two entries and that the second entry is the tea
        assertTrue(instance.contains(entry2));
        
        //throw new UnsupportedOperationException("This method has not been implemented yet");

    }

    /**
     * Test of remove method, of class ShoppingArrayList.
     */
    @Test
    public void testRemove() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);

        // Test element not found case
        assertFalse(instance.remove(entry1));

        instance.add(entry1);
        assertEquals(1, instance.size());
        assertTrue(instance.contains(entry1));

        instance.remove(entry1);

        // Test general case (size)
        assertEquals(0, instance.size());

        // Test general case (content)
        assertFalse(instance.contains(entry1));
        
        instance.add(entry1);
        instance.add(entry2);
        instance.add(entry3);
        
        // Test remove shifts elements
        // Before shift
        try {
            assertTrue(instance.find(0).equals(entry1));
            assertTrue(instance.find(1).equals(entry2));
            assertTrue(instance.find(2).equals(entry3));
        }
        catch (EmptyCollectionException e) {
            fail("Unexpected ECE - testRemove");
        }
        
        assertTrue(instance.remove(entry1));
        
        // After shift
        try {
            assertTrue(instance.find(0).equals(entry2));
            assertTrue(instance.find(1).equals(entry3));
        }
        catch (EmptyCollectionException e) {
            fail("Unexpected ECE - testRemove");
        }
        
        // Collection bounds changed
        try {
            instance.find(2);
            fail();
        }
        catch (IndexOutOfBoundsException | EmptyCollectionException e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }

    /**
     * Test of find method, of class ShoppingArrayList.
     */
    @Test
    public void testFind() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);

        // Assert that the list is empty
        assertEquals(0, instance.size());

        // Add entries to the list
        instance.add(entry1);
        instance.add(entry2);
        instance.add(entry3);
        
        // Test finding an index with entries in the list
        try {
            assertTrue(instance.find(0).equals(entry1));
            assertTrue(instance.find(1).equals(entry2));
            assertTrue(instance.find(2).equals(entry3));
        }         
        catch (EmptyCollectionException e) {
            fail("Unexpected ECE - testFind");
        }
        
        //Now test finding an index that is not in the list.
        try {
            instance.find(3);
            fail();
        }
        catch (IndexOutOfBoundsException | EmptyCollectionException e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
        
        //throw new UnsupportedOperationException("This method has not been implemented yet");

    }

    /**
     * Test of indexOf method, of class ShoppingArrayList.
     */
    @Test
    public void testIndexOf() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);

        //Assert that the list is empty
        assertEquals(0, instance.size());
        
        // Add entries
        instance.add(entry1);
        instance.add(entry2);
        instance.add(entry3);
        
        // Test that the entries are in thier indexes with a try catch
        try {
            assertTrue(instance.find(0).equals(entry1));
            assertTrue(instance.find(1).equals(entry2));
            assertTrue(instance.find(2).equals(entry3));
        }
        catch (EmptyCollectionException e) {
            fail("Unexpected ECE - testIndexOf");
        }
     
        //throw new UnsupportedOperationException("This method has not been implemented yet");

    }

    /**
     * Test of contains method, of class ShoppingArrayList.
     */
    @Test
    public void testContains() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);

        // Test element does not exist case
        assertFalse(instance.contains(entry1));

        instance.add(entry1);

        // Test element exists case
        assertTrue(instance.contains(entry1));
    }

    /**
     * Test of size method, of class ShoppingArrayList.
     */
    @Test
    public void testSize() {
        Grocery entry1 = new Grocery("Mayo", "Dressing / Mayo", 1, 2.99f, 1);
        Grocery entry2 = new Grocery("Green Tea", "Tea", 6, 1.99f, 2);
        Grocery entry3 = new Grocery("Lucky Charms", "Cereal", 7, 3.99f, 1);
        
        // Assert that the list is empty
        assertEquals(0, instance.size());
        
        // Add entry 1 to the list
        instance.add(entry1);
        
        // Assert that the list contains 1 entry
        assertEquals(1, instance.size());
        
        // Add entry 2 to the list
        instance.add(entry2);
        
        // Assert that the list contains 2 entries
        assertEquals(2, instance.size());
        
        // Add entry 3 to the list
        instance.add(entry3);
        
        // Assert that the list contains 3 entries
        assertEquals(3, instance.size());

        //throw new UnsupportedOperationException("This method has not been implemented yet");

    }

    /**
     * Test of isEmpty method, of class ShoppingArrayList.
     */
    @Test
    public void testIsEmpty() {
        // Assert that the list is empty
        assertEquals(0, instance.size());

        //throw new UnsupportedOperationException("This method has not been implemented yet");

    }

}
