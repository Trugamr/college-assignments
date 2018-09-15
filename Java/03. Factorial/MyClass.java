import java.util.Scanner;
import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        ps.printf("Enter a number ");
        int n = sc.nextInt();

        MyClass o = new MyClass();

        ps.printf("Factorial of %d is %d.", n, o.factorial(n));
         
    }

    int factorial(int a) {
        int fact=1;
        for(int i=1; i<=a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}