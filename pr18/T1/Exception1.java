package pr18.T1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println( 2 / 0 );
            System.out.println("этот код никогда не будет, никогда");
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }

    }
}
