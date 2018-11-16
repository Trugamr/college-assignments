import java.awt.*;
import java.awt.event.*;

class ActionListenerDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button b = new Button("Click Me!");
        Label l = new Label("Not Clicked Yet!");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Button Clicked!");
            }
        });
        
        l.setBounds(105, 80, 100, 30);
        b.setBounds(100, 120, 100, 30);
        f.add(l);
        f.add(b);        
        
        f.setTitle("Action Listener Demo");
        f.setLayout(null);
        f.setSize(300, 250);
        f.setVisible(true);        
    }
}