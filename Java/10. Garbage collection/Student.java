class Student {
    public static void main(String[] args) {
        Student Jane = new Student("Jane");
        Jane = null;
        System.gc(); 

        Student Rex = new Student("Rex");
        Student Raven = new Student("Raven");
        Rex = Raven;
        System.gc(); 

        Student s = new Student("s");
        s.createObj();
        System.gc();       
    }   

    String name = "";

    Student(String n) {
        this.name = n;
    }

    void createObj() {
        Student Devon = new Student("Devon");
    }

    protected void finalize() {
        System.out.println("Garbage Collector Called - Dumped " + this.name + " | " + this);
    }
}    