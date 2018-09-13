class ClassA {
    public void msgA() {
        System.out.println("Message from Class A");
    }
}

class ClassB extends ClassA {
    public void msgB() {
        System.out.println("Message from Class B");
    }
}

class ClassC extends ClassB {
    public void msgC() {
        System.out.println("Message from Class C");
    }

    public static void main(String[] args) {
        ClassC c = new ClassC();
        
        //displaying message from class a
        c.msgA();
        //displaying message from class b
        c.msgB();
        //displaying message from class c
        c.msgC();
    }
}