import java.awt.*;
import java.awt.event.*;

class TextFieldCopier extends Frame{
    TextField one, two;
    Button copyBtn;
    TextFieldCopier() {
        one = new TextField(14);
        two = new TextField(14);

        copyBtn = new Button("Copy Text");

        add(one); add(two);
        add(copyBtn);

        setTitle("Text Field Copier");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300, 100);
        setVisible(true);

        copyBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                two.setText(one.getText());
                copyBtn.setLabel("Copied!");
            }
        });
    }

    public static void main(String[] args) {
        new TextFieldCopier();
    }
}