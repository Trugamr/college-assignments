class Person {
    String name, gender;
    int age;

    void dispBasicDetails() {
        System.out.printf("%s - %d | %s", name, age, gender);
    }

    public static void main(String[] args) {
        Student s = new Student(8083, "Jane", 19, "Female");
        System.out.print("Roll No. " + s.rollNo + " -> ");
        s.dispBasicDetails();

        Employee e = new Employee(40000, "Raj", 22, "Male");
        System.out.printf("\nSalary %d -> ", e.salary);
        e.dispBasicDetails();        
    }
}

class Student extends Person {
    int rollNo;
    Student(int rollNo, String name, int age, String gender) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Employee extends Person {
    int salary;
    Employee(int salary, String name, int age, String gender) {
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}