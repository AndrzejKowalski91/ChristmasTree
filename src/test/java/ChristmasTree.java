import org.junit.jupiter.api.Test;
import test.ChristmasTree;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasTreeTest {

    @Test
    public void testChristmasTreeWithThreeLevels() {
        // Redirect the standard output to capture the printed tree
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Provide input for the number of levels
        String input = "3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        // Call the main method
        ChristmasTree.main(null);

        // Expected output for a Christmas tree with 3 levels
        String expectedOutput = "  *\n" +
                " ***\n" +
                "*****\n" +
                "  *\n";

        // Verify if the actual output matches the expected output
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testChristmasTreeWithFiveLevels() {
        // Redirect the standard output to capture the printed tree
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Provide input for the number of levels
        String input = "5\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));

        // Call the main method
        ChristmasTree.main(null);

        // Expected output for a Christmas tree with 5 levels
        String expectedOutput = "    *\n" +
                "   ***\n" +
                "  *****\n" +
                " *******\n" +
                "*********\n" +
                "    *\n";

        // Verify if the actual output matches the expected output
        assertEquals(expectedOutput, outputStream.toString());
    }
}