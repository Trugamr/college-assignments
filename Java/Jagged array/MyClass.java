import java.util.Scanner;
import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[5];
        arr[3] = new int[1];

        for(int i=0; i<arr.length; i++) {
            ps.printf("Enter %d numbers for row %d - ", arr[i].length, i);
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        ps.printf("\nJagged Array - \n");
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                ps.printf("%d ", arr[i][j]);
            }
            ps.printf("\n");
        }

    }
}