import java.io.PrintStream;

class Varaibles {
    int[] arr = {10, 30, 50, 25, 62};
}

class Sum extends Varaibles {
    double sum = 0;
    Sum() {
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i];
        }
    }    
}

class Avg extends Sum {
    double avg = sum/arr.length;

    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        
        Avg a = new Avg();

        ps.println("Average for " + a.arr.length + " items with sum " + a.sum + " is " + a.avg);
    }
}