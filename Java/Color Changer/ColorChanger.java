import java.awt.*;
import java.awt.event.*;

class ColorChanger extends Frame {
    Label l = new Label(" Choose Color : ");
    Choice c = new Choice();

    ColorChanger() {

        c.add("RED");
        c.add("GREEN");
        c.add("CYAN");
        c.add("PINK");

        l.setBackground(Color.white);

        c.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                int option = c.getSelectedIndex();
                switch(option) {
                    case 0:
                        setBackground(Color.RED);
                        break;
                    case 1:
                        setBackground(Color.GREEN);
                        break;
                    case 2:
                        setBackground(Color.CYAN);
                        break;
                    case 3:
                        setBackground(Color.PINK);
                        break;
                }
            }
        });

        add(l); add(c);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300, 90);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorChanger();
    }
}