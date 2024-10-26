package pr20.T5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Double[] list1 = {10.5, 3.5, 7., 4.};
        Double[] list2 = {50., 3., 4., 5.};
        Double[] list6 = {1., 2., 3., 4., 5., 6., 7., 8.};
        Matrix<Double> matrix1 = new Matrix<>(2, 2);
        Matrix<Double> matrix2 = new Matrix<>(2, 2);
        Matrix<Double> matrix3;
        Matrix<Double> matrix4 = new Matrix<>(2, 2);
        Matrix<Double> matrix5;
        Matrix<Double> matrix6 = new Matrix<>(2, 4);

        matrix4.setvalue(0,0, 10.);
        matrix4.setvalue(0,1, 9.);
        matrix4.setvalue(1,0, 8.);
        matrix4.setvalue(1,1, 7.);

        matrix1.fillFromArray(list1);
        matrix2.fillFromArray(list2);

        System.out.println("list1: " + Arrays.toString(list1));
        System.out.println("list2: " + Arrays.toString(list2));
        System.out.println("list6: " + Arrays.toString(list6));
        System.out.println();

        System.out.println("Matrix 1: matrix from list 1");
        matrix1.print_Matrix();
        System.out.println();

        System.out.println("Matrix 2: matrix from list 2");
        matrix2.print_Matrix();
        System.out.println();

        System.out.println("Matrix 3: Sum of matrix 1 and matrix 2:");
        matrix3 = Matrix.addMatrix(matrix1, matrix2);
        matrix3.print_Matrix();
        System.out.println();

        System.out.println("Matrix 4: assigning each element manually");
        matrix4.print_Matrix();
        System.out.println();

        System.out.println("Matrix 5: mult of matrix 1 and matrix 2:");
        matrix5 = Matrix.multMatrix(matrix1, matrix2);
        matrix5.print_Matrix();
        System.out.println();

        System.out.println("Matrix 6: from list, before transpose:");
        matrix6.fillFromArray(list6);
        matrix6.print_Matrix();
        System.out.println();

        System.out.println("Matrix 6: after transpose: ");
        matrix6.transpose();
        matrix6.print_Matrix();

    }
}
