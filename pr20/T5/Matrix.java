package pr20.T5;

public class Matrix<E extends Number> {
    private int cols;
    private int rows;
    private E[][] matrix;

    public Matrix(int rows, int cols) {
         this.cols = cols;
         this.rows = rows;
         this.matrix = (E[][]) new Number[rows][cols];
     }

    public int getCols() { return cols; }
    public E getvalue(int i, int j) { return matrix[i][j];}
    public int getRows() { return rows; }
    public int[] getShape() {return new int[]{rows, cols};}
    public void setvalue(int i, int j, E value) {this.matrix[i][j] = value; }

    public void fillFromArray(E[] list) {
         for (int i = 0; i < this.rows; i++) {
             for (int j = 0; j < this.cols; j++) {
                 this.matrix[i][j] = list[i * cols + j];
             }
         }
    }

    public void print_Matrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print(this.matrix[i][j] + " ".repeat(getTabulation(this.matrix[i][j])));
            }
            System.out.println();
        }
    }

    private int getTabulation(E number) {
         int max_len = 0;
         for (int i = 0; i < this.rows; i++) {
             for (int j = 0; j < this.cols; j++) {
                 int l = String.valueOf(this.matrix[i][j]).length();
                 if (l > max_len) {
                     max_len = l;
                 }
             }
         }
         return max_len + 3 - String.valueOf(number).length();
    }

    public static <E extends Number> Matrix<E> addMatrix(Matrix<E> matrix1, Matrix<E> matrix2) {
        if (matrix1.cols != matrix2.cols | matrix1.rows != matrix2.rows) {
            throw new MatrixSizeException("Matrix size should be equal, now: matrix1: (" + matrix1.rows + ", " + matrix1.cols + "), matrix 2: (" + matrix2.rows + ", " + matrix2.cols + ")");
        }
        Matrix<E> result = new Matrix<>(matrix1.rows, matrix1.cols);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.cols; j++) {
                result.setvalue(i, j, add(matrix1.getvalue(i, j), matrix2.getvalue(i, j)));
            }
        }
        return result;
    }

    private static <T> T add(T one, T two) {
         if (one.getClass() == Byte.class) {
             return (T) (Byte) (byte) ((Byte) one + (Byte) two);
         } else if (one.getClass() == Short.class) {
             return (T) (Short) (short) ((Short) one + (Short) two);
         } else if (one.getClass() == Integer.class) {
             return (T) (Integer) ((Integer) one + (Integer) two);
         } else if (one.getClass() == Long.class) {
             return (T) (Long) ((Long) one + (Long) two);
         } else if (one.getClass() == Double.class) {
             return (T) (Double) ((Double) one + (Double) two);
         } else if (one.getClass() == Float.class) {
             return (T) (Float) ((Float) one + (Float) two);
         }
         else throw new NumberFormatException("wrong number format");
    }

    private static <T> T mult(T one, T two) {
        if (one.getClass() == Byte.class) {
            return (T) (Byte) (byte) ((Byte) one * (Byte) two);
        } else if (one.getClass() == Short.class) {
            return (T) (Short) (short) ((Short) one * (Short) two);
        } else if (one.getClass() == Integer.class) {
            return (T) (Integer) ((Integer) one * (Integer) two);
        } else if (one.getClass() == Long.class) {
            return (T) (Long) ((Long) one * (Long) two);
        } else if (one.getClass() == Double.class) {
            return (T) (Double) ((Double) one * (Double) two);
        } else if (one.getClass() == Float.class) {
            return (T) (Float) ((Float) one * (Float) two);
        }
        else throw new NumberFormatException("wrong number format");
    }

    public static <E extends Number> Matrix<E> multMatrix(Matrix<E> matrix1, Matrix<E> matrix2) {
        if (matrix1.rows != matrix2.cols | matrix1.cols != matrix2.rows) {
            throw new MatrixSizeException("Matrix size should be opposite (like (2, 7) and (7, 2)), now: matrix1: (" + matrix1.rows + ", " + matrix1.cols + "), matrix 2: (" + matrix2.rows + ", " + matrix2.cols + ")");
        }
        Matrix<E> result = new Matrix<>(matrix1.rows, matrix1.cols);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix1.cols; j++) {
                E sum = (E) (Double) 0.;
                for (int k = 0; k < matrix1.cols; k++) {
                    sum = add(sum, mult(matrix1.getvalue(i, k), matrix2.getvalue(k, j)));
                }
                result.setvalue(i, j, sum);
            }
        }
        return result;
    }

    public void transpose() {
        //this.matrix = (E[][]) new Object[cols][rows];
        Matrix<E> result = new Matrix<>(this.cols, this.rows);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                result.matrix[j][i] = this.matrix[i][j];
            }
        }
        this.matrix = result.matrix;
        int temp = this.cols;
        this.cols = rows;
        this.rows = temp;
    }
}
