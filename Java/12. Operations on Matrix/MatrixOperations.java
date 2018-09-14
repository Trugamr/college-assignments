import java.util.Scanner;
import java.io.PrintStream;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream ps = new PrintStream(System.out);

        MatrixOperations o = new MatrixOperations();

        int[][] matrix1 = new int[10][10];
        int[][] matrix2 = new int[10][10];

        ps.print("Enter number of rows and cols - ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        ps.printf("Enter %d elements in first array - ", row*col);
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        ps.printf("Enter %d elements in second array - ", row*col);
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        ps.printf("First array - \n");
        o.printArray(matrix1, row, col);

        ps.printf("\nSecond array - \n");
        o.printArray(matrix2, row, col);

        ps.printf("\nSum of first and second matrix - \n");
        o.printArray(o.addArray(matrix1, matrix2, row, col), row, col);

        if(col == row) {
            ps.printf("\nProduct of first and second matrix - \n");
            o.printArray(o.multiplyArray(matrix1, matrix2, row, col), row, col);
        } else {
            ps.printf("\nProduct not possible, number of columns of first not equal to rows of second matrix.\n");
        }


    }

    void printArray(int[][] mat, int r, int c) {
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.printf("%d ",mat[i][j]);
            }
            System.out.printf("\n");
        }
    }

    int[][] addArray(int[][] mat1, int[][] mat2, int r, int c) {
        int[][] sum = new int[10][10];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sum;
    }

    int[][] multiplyArray(int[][] mat1, int[][] mat2, int r, int c) {
        int sum = 0;
        int[][] product = new int[10][10];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                for(int k=0; k<r; k++) {
                    sum += mat1[i][k] * mat2[k][j];
                }
                product[i][j] = sum;
            }
        }
        return product;
    }
}