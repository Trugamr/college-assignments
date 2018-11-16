import java.awt.*;

class MainFrame extends Frame {
    Label nameL, fnameL, emailL, dobL, genderL, courseL, addressL, spacer, heading;
    TextField nameT, fnameT, emailT, dobT, addressT;
    Choice courses = new Choice();
    CheckboxGroup gender = new CheckboxGroup();
    Checkbox maleC, femaleC;
    Button submitB = new Button("Submit");
    MainFrame() {
        //labels
        heading = new Label("Student Form");
        nameL = new Label("Name : ");
        fnameL = new Label("Father's Name : ");
        emailL = new Label("Email : ");
        dobL = new Label("Date of Birth : ");
        genderL = new Label("Gender : ");
        courseL = new Label("Course : ");
        addressL = new Label("Address : ");
        spacer = new Label("                       ");

        //text fields
        nameT = new TextField(16);
        fnameT = new TextField(16);
        emailT = new TextField(16);
        dobT = new TextField(16);
        addressT = new TextField(16);

        //choice
        courses.add("BCA");
        courses.add("BA");
        courses.add("BCom");

        //checkbox
        maleC = new Checkbox("Male", gender, true);
        femaleC = new Checkbox("Female", gender, false);

        //adding to frame;
        
        add(nameL); add(nameT);
        add(fnameL); add(fnameT);
        add(emailL); add(emailT); 
        add(dobL); add(dobT);
        add(addressL); add(addressT);
        add(genderL); add(maleC); add(femaleC); 
        add(courseL); add(courses); add(spacer);
        add(submitB);

        //frame options
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setTitle("Student Form");
        setSize(250, 300);
        setVisible(true);
    }
}

class StudentForm {
    public static void main(String[] args) {
        new MainFrame();
    }
}