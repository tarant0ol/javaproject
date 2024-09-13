package pr1;
import java.lang.*;
import java.util.Scanner;
public class Pr1 {
    public static void main(String[] args) {
        // № 3
        int sum_of_elements = 0;
        int[] list = new int[10];
        for (int i = 0; i < 10; i++){
            list[i] = Math.toIntExact(Math.round(1 + Math.random() * 9));
            sum_of_elements += list[i];
        }
        System.out.println("Сумма: " + sum_of_elements);
        System.out.println("Среднее арефметическое " + (sum_of_elements / list.length));

        // № 5
        Scanner sc = new Scanner(System.in);
        System.out.println("Текущий аргумент командной строки: " + sc.next());

        // № 7
        System.out.println("Факториал 5 = " + factorial(5));
    }

    public static int factorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++){
            res *= i;
        }
        return res;
    }
}

