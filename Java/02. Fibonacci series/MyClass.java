import java.util.Scanner;
import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        ps.printf("Enter number of items to print in Fibonacci Series ");
        int n = sc.nextInt();

        MyClass o = new MyClass();
        ps.print("Fibonacci Series - ");
        o.fibo(n);
    }

    void fibo(int a) {
        int t1 = 0, t2 = 1;
        for(int i=0; i<a; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
        
}