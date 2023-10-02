package test.easycodeforall.changeit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.apache.log4j.Logger;

public class MathOperationTest {

    private Logger log = Logger.getLogger(this.getClass());

    @Test
    public void mathFunction() {
        try {
            log.info("Starting execution of mathFunction");
            String expectedValue = "";
            int Number1 = 0;
            int Number2 = 0;
            int Number3 = 0;

            String actualValue = MathOperation.mathFunction(Number1, Number2, Number3);
            log.info("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            System.out.println("Expected Value=" + expectedValue + " . Actual Value=" + actualValue);
            assertEquals(expectedValue, actualValue);
        } catch (Exception exception) {
            log.error("Exception in execution of execute1GetAllLogFromFirstMovF-" + exception, exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }

    @Test
    public void main() {
        try {
            log.info("Starting execution of main");
            String[] args = null;

            MathOperation.main(args);
            assertTrue(true);
        } catch (Exception exception) {
            log.error("Exception in execution ofmain-" + exception, exception);
            exception.printStackTrace();
            assertFalse(false);
        }
    }
}
