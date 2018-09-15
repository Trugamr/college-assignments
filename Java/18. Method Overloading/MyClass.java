import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        ps.println("Hello");

        MyClass o = new MyClass();
        
        int sum = o.add(10, 30);
        ps.println("Sum is " + sum);

        sum = o.add(10, 30, 20);
        ps.println("Sum is " + sum);

        double ans = o.add(10.9, 4.75);
        ps.println("Sum is " + ans);
    }

    int add(int a, int b) {
        return a+b;
    }

    int add(int a, int b, int c) {
        return a+b+c;
    }

    double add(double a, double b) {
        return a+b;
    }
}