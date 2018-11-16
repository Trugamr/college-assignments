import java.awt.*;
import java.awt.event.*;

class KeyListenerDemo extends Frame implements KeyListener {
    Label l1 = new Label("Press any key on keyboard!");
    Label l2 = new Label("pressed key will appear here");
    Label l3 = new Label("typed key will appear here");
    Label l4 = new Label("released key will appear here");

    KeyListenerDemo() {        
        addKeyListener(this);
        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        setSize(340, 180);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l2.setText("Key Pressed : " + e.getKeyChar() + ", Key Code : " + e.getKeyCode());
    };
    public void keyTyped(KeyEvent e) {
        l3.setText("Key Typed : " + e.getKeyChar());
    };
    public void keyReleased(KeyEvent e) {
        l4.setText("Key Released : " + e.getKeyChar() + ", Key Code : " + e.getKeyCode());
    };

    public static void main(String[] args) {
       new KeyListenerDemo();    
    }
}