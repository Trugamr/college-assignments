import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);

        MyClass o1 = new MyClass();
        MyClass o2 = new MyClass();
        MyClass o3 = new MyClass();
        myFun();

        ps.printf("\nCount for object o1 - %d\n", o1.count);
        ps.printf("Count for object o2 - %d\n", o2.count);
        ps.printf("Count for object o3 - %d\n", o3.count);
    }

    static int count = 0;

    MyClass() {
        this.count++;
    }

    static void myFun() {
        System.out.printf("This function is called without creating an object");
    }
}