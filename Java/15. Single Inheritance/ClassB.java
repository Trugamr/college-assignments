class ClassA {
    public void dispMsgA() {
        System.out.println("dispMsgA() method of Class A");
    }
}

class ClassB extends ClassA {
    public void dispMsgB() {
        System.out.println("dispMsgB() method of Class B");
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        //diplaying message from class A
        b.dispMsgA();
        //displaying message from class B
        b.dispMsgB();
    }
}