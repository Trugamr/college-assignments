import java.util.*;

class myClass {
    public static void main(String[] args) {

        System.out.println("Hello World");
//adding
        operation o = new operation();
        System.out.println("Sum is " + o.add(7,6));

        System.out.print("Enter a number - ");
//taking input
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
//checking if even or odd
        if(o.isEven(num)) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
//factorial of a number
        System.out.println("Factorial of " + num + " is " + o.factorial(num));
//fibonacci series
        System.out.print("Fibonacci Series - ");
        o.fibo(num);
    }
}

class operation {
    int add(int a, int b) {
        return (a + b);
    }

    boolean isEven(int a) {
        if(a%2==0) {
            return true;
        } else {
            return false;
        }
    }

    long factorial(int a) {
        int fact=1;
        for(int i=1; i<=a; i++) {
            fact = fact * i;
        }
        return fact;
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