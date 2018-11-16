import java.awt.*;
import java.awt.event.*;

class MouseListenerDemo extends Frame implements MouseListener {
    Label l = new Label("Mouse Click Position");

    MouseListenerDemo() {        
        addMouseListener(this);
        setLayout(new FlowLayout());
        add(l);
        setSize(600, 100);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {};
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked on X: " + e.getX() + ", Y: " + e.getY());
    };
    public void mouseReleased(MouseEvent e) {};
    public void mouseEntered(MouseEvent e) {};
    public void mouseExited(MouseEvent e) {};

    public static void main(String[] args) {
       new MouseListenerDemo();    
    }
}