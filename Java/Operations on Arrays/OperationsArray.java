import java.util.Scanner;
import java.io.PrintStream;

class OperationsArray {
    public static void main(String[] args) {
        PrintStream ps = new PrintStream(System.out);
        Scanner sc = new Scanner(System.in);

        OperationsArray o = new OperationsArray();

        int[] array = new int[20];

        ps.print("Enter number of items - ");
        int n = sc.nextInt();
        ps.printf("Enter %d items in array - ", n);
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }

        ps.printf("\n1.Average\n2.Max. Value\n3.Min. Value\n(any other to exit)");
        int choice;

        boolean run = true;
        while(run) {
            ps.printf("\n\nEnter choice - ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    //array average
                    float avg = o.getAvg(array, n);
                    ps.println("Average is " + avg);
                    break;
                case 2:
                    //max array value
                    int max = o.getMax(array, n);
                    ps.println("Max value is " + max);                
                    break;
                case 3:             
                    //min array value
                    int min = o.getMin(array, n);
                    ps.println("Min value is " + min);
                    break;
                default:
                    run = false;
            } 
        }
    }

    float getAvg(int[] arr, int n) {
        float sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i]; 
        }
        return sum/n;
    }

    int getMax(int[] arr, int n) {
        int max = arr[0];
        for(int i=0; i<n; i++) {
            if(max <= arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    int getMin(int[] arr, int n) {
        int min = arr[0];
        for(int i=0; i<n; i++) {
            if(min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

    