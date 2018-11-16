import java.awt.*;
import java.awt.event.*;

class TextListenerDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("Type Something!");
        TextField t = new TextField();

        t.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                l.setText("You Typed: " + t.getText());
            }
        });
        
        l.setBounds(105, 80, 100, 30);
        t.setBounds(100, 120, 100, 30);
        f.add(l);
        f.add(t);        
        
        f.setTitle("Text Listener Demo");
        f.setLayout(null);
        f.setSize(300, 250);
        f.setVisible(true);        
    }
}