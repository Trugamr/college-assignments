class Main {
    public static void main(String[] args) {
        Main o = new Main();
        float avg1 = o.getAvg(1, 2, 3, 4, 6, 7, 8, 9);
        float avg2 = o.getAvg(20, 30, 90, 50); 
        System.out.print(avg1 + "\n");
        System.out.print(avg2);
    }

    float getAvg(int... arr) {
        float sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}