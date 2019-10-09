public abstract class TestSuite {

    private int passed;
    private int failed;

    public void runTestSuite() {
        passed = 0;
        failed = 0;

        testList();

        System.out.println("Tests passed: " + passed);
        System.out.println("Tests failed: " + failed);
    }

    protected abstract void testList();

    public void assertEquals(int expected, int actual) {
        if (expected == actual){
            passed++;
        }
        else {
            failed++;
            System.out.println("Expected: " + expected + "\nActual: " + actual);
        }
    }

    public void stringCaseSensitiveEquals(String expected, String actual){
        if (expected.equals(actual)){
            passed++;
        }
        else {
            failed++;
            System.out.println("Expected: " + expected + "\nActual: " + actual);
        }
    }

    public void stringCaseInsensitiveEquals(String expected, String actual){
        if (expected.equals(actual)){
            passed++;
        }
        else {
            failed++;
            System.out.println("Expected: " + expected + "\nActual: " + actual);
        }
    }

    }
