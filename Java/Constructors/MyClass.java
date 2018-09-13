
class MyClass {
    public static void main(String[] args) {
        
        Student s = new Student();
        System.out.printf("Roll No. - %d |  Name - %s \n", s.roll, s.name);
        
        Student s1 = new Student(101, "John");
        System.out.printf("Roll No. - %d |  Name - %s \n", s1.roll, s1.name);
        
        Student s2 = new Student(s1);
        System.out.printf("Copied - Roll No. - %d |  Name - %s \n", s2.roll, s2.name);

    }
}

class Student {
    int roll;
    String name;

    Student() {
        System.out.println("Defaut Constructor Called");
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    Student(Student x) {
        roll = x.roll;
        name = x.name;
    }
}