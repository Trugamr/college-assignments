class MyClass {
    public static void main(String[] args) {
        MyClass o = new MyClass();
        o.printInfo();
        
        o.changeInfo("Harry Potter", 24);
        System.out.printf("\nChanged global name and age variables using this operator - %s, %d", o.name, o.age);
    }

    String name = "Jane Doe";
    int age = 20;

    void printInfo() {
        String name = "Jai Wolf";
        int age = 23;

        System.out.printf("Name and age inside method - %s, %d\n", name, age);
        System.out.printf("Name and age outside method accessed using this keyword - %s, %d", this.name, this.age);
    }

    void changeInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

}