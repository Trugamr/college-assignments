import java.util.Scanner;
import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        ps.printf("Enter a number ");
        int n = sc.nextInt();

        MyClass o = new MyClass();

        if(o.isEven(n)) {
            ps.printf("%d is Even.", n);
        } else {
            ps.printf("%d is Odd.", n);
        }
         
    }

    boolean isEven(int x) {
        if(x%2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}