import java.awt.*;
import java.awt.event.*;

class MouseListenerDemo extends Frame implements MouseListener {
    Label l = new Label("Mouse Click Position");
    Label l1 = new Label("Mouse status");

    MouseListenerDemo() {        
        addMouseListener(this);
        setLayout(new FlowLayout());
        add(l);
        add(l1);
        setSize(600, 100);
        setVisible(true);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed on X: " + e.getX() + ", Y: " + e.getY());
    };
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked on X: " + e.getX() + ", Y: " + e.getY());
    };
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released on X: " + e.getX() + ", Y: " + e.getY());
    };
    public void mouseEntered(MouseEvent e) {
        l1.setText("Mouse Entered");
    };
    public void mouseExited(MouseEvent e) {
        l1.setText("Mouse Exited");
    };

    public static void main(String[] args) {
       new MouseListenerDemo();    
    }
}