import org.example.StringCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    private StringCalculator manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new StringCalculator();
    }

    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

    @Test
    public void negTest() {
        manipulatedstring.setString("1,5");
        int length = manipulatedstring.add("1,5");
        assertEquals(6, length);
    }
    @Test
    public void NegativeNum() {

        manipulatedstring.setString("IllegalArgument");
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () ->
                        manipulatedstring.add("-1,5"),
                "Error" );

    }
    @Test
    public void largeNum() {
        manipulatedstring.setString("1,5");
        int length = manipulatedstring.add("1,1000");
        assertEquals(1, length);
    }
}