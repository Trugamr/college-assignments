class MyExcep extends Exception{
    public MyExcep(String msg){
        super(msg);
    }
}

public class testClass{
    public static void main(String args[]){
        try{
            throw new MyExcep("Faaltu!!");
        }
        catch(MyExcep me){
            System.out.println(me);
            System.out.println("Messege Catched: "+me.getMessage());
        }
    }
}