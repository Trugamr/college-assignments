class Main {
    public static void main(String[] args) {
        int[] parsedArgs = new int[20];

        //parsing command line arguments to integer
        for(int i=0; i<args.length; i++) {
            parsedArgs[i] = Integer.parseInt(args[i]);
        }

        System.out.print("Input from command line - ");
        for(int i=0; i<args.length; i++) {
            System.out.print(parsedArgs[i] + " ");
        }
        
        int temp;
        for(int i=0; i<args.length; i++) {
            for(int j = 0; j< args.length - 1; j++) {
                if(parsedArgs[j]>parsedArgs[j+1]) {
                    temp = parsedArgs[j+1];
                    parsedArgs[j+1] = parsedArgs[j];
                    parsedArgs[j] = temp;
                }
            }
        }



        System.out.print("\nInput sorted in ascending order - ");
        for(int i=0; i<args.length; i++) {
            System.out.print(parsedArgs[i] + " ");
        }
        

    }
}