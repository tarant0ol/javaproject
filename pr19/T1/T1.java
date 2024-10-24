package pr19.T1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class T1 {
    public static void main(String[] args) {
        System.out.println("Введите Инициалы и ИНН");
        Scanner scanner = new Scanner(System.in);
        try {
            boolean access = false;
            String[] input = scanner.nextLine().split(" ");
            File file = new File("src/pr19/T1/information");
            Scanner scanner1 = new Scanner(file);
            while (scanner1.hasNextLine()) {
                String[] info = scanner1.nextLine().split(" ");
                if (input[0].equals(info[0])) {
                    if (input[1].equals(info[1])) {
                        System.out.println("ACCESS GRANTED");
                        access = true;
                        return;
                    } else {
                        if (input[1].length() != info[1].length()) {
                            throw new WrongINNLengthException("Wrong INN length intered: " + input[1].length() + " (length 10 expected)");
                        } else {
                            throw new WrongINNException("Wrong INN Entered: " + input[1]);
                        }
                    }
                }
            }
            if (!access) {
                throw new UserNotFoundException("Wrong user entered");
            }
        } catch (FileNotFoundException e1) {
            System.out.println("There is no such file");
        } catch (WrongINNException | WrongINNLengthException | UserNotFoundException e2) {
            System.err.println(e2);
        }
    }
}
