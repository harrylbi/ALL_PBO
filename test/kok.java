public class kok {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        loader.setDefaultAssertionStatus(true);

        AssertExample example = new AssertExample();
        example.run();
    }
}

class AssertExample {
    public void run() {
        int a = 5;
        try {
            assert a == 5 : "a is not 5";
            assert a == 10 : "a is not 10";
            assert a == 15 : "a is not 15";
        } catch (AssertionError e) {
            System.out.println("Assertion error: " + 6 e.getMessage());
        }
    }
}