import java.util.Scanner;
import java.io.PrintStream;

class Student {
    
    String name;
    Student(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        Student s = new Student("James");
        s = null;       

        ps.print("Waiting for keypress: ");
        String input = sc.nextLine();
        if(input.equals("d")) {
            System.gc();
        } else {
            ps.println("Garbage collection not done.");
        }  
    }

    protected void finalize() {
        System.out.println("Garbage Collector Called - Dumped " + this.name + " | " + this);
    }
}