class Person {
    String name, gender;
    int age;

    void dispDetails() {
        System.out.printf("%s - %d | %s", name, age, gender);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(int rollNo, String course, String name, int age, String gender) {
        this.rollNo = rollNo;
        this.course = course;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Student s = new Student(3020, "BCA", "Harry", 17, "Male");
        System.out.printf("%s -> Roll No. %d -> ", s.course, s.rollNo);
        s.dispDetails();
    }
}