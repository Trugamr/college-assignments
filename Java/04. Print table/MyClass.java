import java.util.Scanner;
import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        ps.printf("Enter a number ");
        int n = sc.nextInt();

        MyClass o = new MyClass();

        ps.printf("Table of %d is\n", n);
        o.printTable(n);
         
    }

    void printTable(int x) {
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", x, i, x*i);
        }
    }
}