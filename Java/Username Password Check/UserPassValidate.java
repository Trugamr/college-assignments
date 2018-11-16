import java.awt.*;
import java.awt.event.*;

class UserPassValidate extends Frame {
    Label userL, passL, statusL;
    TextField userT, passT;
    Button loginBtn;
    UserPassValidate() {
        //labels
        userL = new Label("Username :  ");
        passL = new Label("Password :   ");
        statusL = new Label(" :  Please Login!");

        //textfields
        userT = new TextField(12);
        passT = new TextField(12);
        passT.setEchoChar('*');

        //button
        loginBtn = new Button("Login");

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userT.getText();
                String pass = passT.getText();
                if(user.equals("jane") && pass.equals("root")) {
                    statusL.setText(" :  Login Successful...");
                    statusL.setForeground(Color.GREEN);
                } else {
                    statusL.setText(" :  Wrong user or pass !");
                    statusL.setForeground(Color.RED);
                }
            }
        });

        add(userL); add(userT);
        add(passL); add(passT);
        add(loginBtn); add(statusL);

        setTitle("Login");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setSize(240,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new UserPassValidate();
    }
}