import java.awt.*;
import java.awt.event.*;

class KeyListenerDemo extends Frame implements KeyListener {
    Label l1 = new Label("Press any key on keyboard!");
    Label l2 = new Label("pressed key will appear here");

    KeyListenerDemo() {        
        addKeyListener(this);
        setLayout(new FlowLayout());
        add(l1);
        add(l2);
        setSize(240, 120);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l2.setText("Key Pressed : " + (char)e.getKeyCode() + ", Key Code : " + e.getKeyCode());
    };
    public void keyTyped(KeyEvent e) {};
    public void keyReleased(KeyEvent e) {};

    public static void main(String[] args) {
       new KeyListenerDemo();    
    }
}