class Main {
    public static void main(String[] args) {
        Main o = new Main();
        float avg = o.getAvg(1, 2, 3, 4, 6, 7, 8, 9);
        System.out.print(avg);
    }

    float getAvg(int... arr) {
        float sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}