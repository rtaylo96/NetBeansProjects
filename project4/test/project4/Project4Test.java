package project4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @version Fall 2019
 * @author Rachel Taylor
 */
public class Project4Test {

    /**
     * Test of main method, of class Project4.
     */
    @Test
    public void testMain() {
        System.out.println("Testing main method");
        final ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
        final PrintStream outOrig = System.out;
        final InputStream inOrig = System.in;
        InputStream COMMAND_STREAM = new ByteArrayInputStream(("ADD\nuser\n123\n456\n"
                + "ADD\nuser\n456\n789\n"
                + "MAIL\nuser\n123\n"
                + "MAIL\nuser\n456\n"
                + "REMOVE\nuser\n123\n456\n"
                + "QUIT").getBytes());
        System.setIn(COMMAND_STREAM);
        System.setOut(new PrintStream(byteOutputStream));
        Project4.main(null);
        String consoleOutput = byteOutputStream.toString();
        assertTrue(consoleOutput.contains("Added"));
        assertTrue(consoleOutput.contains("789"));
        assertTrue(consoleOutput.contains("Removed"));
        assertTrue(consoleOutput.contains("Goodbye"));
        System.setIn(inOrig);
        System.setOut(outOrig);
    }
}
