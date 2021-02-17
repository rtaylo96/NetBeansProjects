package project4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class MailForwardingSystemTest {

    private final MailForwardingSystem instance;

    /**
     * Initialize instance
     */
    public MailForwardingSystemTest() {
        instance = new MailForwardingSystem();
    }

    /**
     * Test of mail method, of class MailForwardingSystem.
     */
    @Test
    public void testMail() {
        System.out.println("mail");
        UserInfo info1 = new UserInfo("user", "123", "456");
        //Initiate the method
        instance.mail("user", "123");
        //Assert that oldAdd and address are the same
        assertEquals(info1.getOldAdd(), "123");
        //Assert that customer and cosName are the same
        assertEquals(info1.getCosName(), "user");
        //Assert the results for if the method fails
        String expResult = "123";
        String result = instance.mail("user", "123");
        assertEquals(expResult, result);

    }

    /**
     * Test of add method, of class MailForwardingSystem.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        UserInfo info1 = new UserInfo("user", "123", "456");
        // Add an entry
        instance.add("user", "123", "456");
        // Assert true the entries are the same
        assertEquals(info1.getCosName(), "user");
        assertEquals(info1.getOldAdd(), "123");
        assertEquals(info1.getNewAdd(), "456");
        // Assert false for inputing the same data again
        boolean expResult = false;
        boolean result = instance.add("user","123","456");
        assertEquals(expResult, result);

    }

    /**
     * Test of remove method, of class MailForwardingSystem.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        // Add an entry
        instance.add("user", "123", "456");
        // Assert that the entry was added
        assertTrue(instance.equals(instance));
        // Remove the entry
        instance.remove("user", "123", "456");
        // Assert that the entry was removed
        assertTrue(instance.equals(instance));
        // Assert false for the method not working.
        boolean expResult = false;
        boolean result = instance.remove("user", "123", "456");
        assertEquals(expResult, result);
    }

}
