package pr29;

import pr20.T5.Matrix;

import java.net.Inet4Address;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter Graph(matrix) size: ");
        int n = Integer.parseInt(sc.nextLine());
        Matrix<Integer> matrix = new Matrix<>(n, n);


        //System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                matrix.setvalue(i, j, num);
            }
        }
        System.out.println("Our matrix: ");
        matrix.print_Matrix();

        int res = 0;
        for (int i = 0; i<n;i++){
            for (int j = i; j < n; j++) {
                res += matrix.getvalue(i, j);
            }
        }

        System.out.println("result = " + res);
    }
}
