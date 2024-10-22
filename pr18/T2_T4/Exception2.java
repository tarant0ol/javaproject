package pr18.T2_T4;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (ArithmeticException e) {
            System.out.println("something went wrong: " + e);
        } catch (Exception e) {
            System.out.println("why you are not inputting int values?!");
        } finally {
            System.out.println("тойота карола");
        }

    }
}
