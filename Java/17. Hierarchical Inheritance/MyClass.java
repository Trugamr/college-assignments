class MyClass {
    public static void main(String[] args) {
        ClassB b = new ClassB();
        //calling disp method of class a using variable of class b
        b.dispA();
        b.dispB();
        System.out.println("\n");
        //calling disp method of class a using variable of class c
        b.dispA();
        b.dispC();

    }
}

class ClassA {
    public void dispA() {
        System.out.println("disp() method of Class A");
    }
}

class ClassB extends ClassA {
    public void dispB() {
        System.out.println("disp() method of Class B");
    }
}

class ClassC {
    public void dispC() extends ClassA {
        System.out.println("disp() method of Class C");
    }
}