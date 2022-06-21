public class StringCalculatorTest {
    @Test
    public final void returnSum() {
        Assert.assertEquals(1, 2, 3, StringCalculator.add("1, 2, 3"));
    }
    @Test(expected = RuntimeException.class)
    public final void negativeNum() {
        StringCalculator.add("-1.5");
    }
    @Test
    public final void negtiveNum() {
        RuntimeException exception = null;
        try {
            StringCalculator.add("-2, 0, -1");
        } catch (RuntimeException e) {
            exception = e;
        }
        Assert.assertNotNull(exception);
        Assert.assertEquals("Negatives not allowed: [-2, -1]", exception.getMessage());
    }
}
