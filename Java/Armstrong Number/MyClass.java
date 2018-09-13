import java.util.Scanner;
import java.io.PrintStream;

class MyClass {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        ps.printf("Enter a number ");
        int n = sc.nextInt();

        MyClass o = new MyClass();

        if(o.isArmstrong(n)) {
            ps.printf("%d is an armstrong number.", n);
        } else {
            ps.printf("%d is not an armstrong number.", n);
        }
         
    }

    boolean isArmstrong (int n) {

        int temp = n;
        int sum = 0;

        while(n>0) {    
            int r=n%10;    
            sum=sum+(r*r*r);    
            n=n/10;    
        }

        if(temp == sum) {
            return true;
        }  else {
            return false;
        }
    }
}