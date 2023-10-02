import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOperationTest {

    // JUnit test method to test the mathFunction method
    @Test
    public void testMathFunction() {
        // Test cases and expected results
        assertEquals("+", MathOperation.mathFunction(1, 2, 3));
        assertEquals("+*", MathOperation.mathFunction(2, 2, 4));
        assertEquals("*", MathOperation.mathFunction(3, -3, -9));
        assertEquals("-", MathOperation.mathFunction(1, 2, -1));
        assertEquals("/", MathOperation.mathFunction(3, 3, 1));
        assertEquals("None", MathOperation.mathFunction(7, 1, 11));
    }
}
