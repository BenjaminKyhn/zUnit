public class TestClass extends TestSuite {
    @Override
    protected void testList() {
        testInt1();
        testInt2();
        testStringCaseSensitive();
        testStringCaseInsensitive();
    }

    public void testInt1() {
        int result = 5;
        assertEquals(5, result);
    }

    public void testInt2() {
        assertEquals(3,7);
    }

    public void testStringCaseSensitive(){
        stringCaseSensitiveEquals("Kelvin", "Kelvin");
    }

    public void testStringCaseInsensitive(){
        stringCaseInsensitiveEquals("Kelvin", "kelvin");
    }
}
