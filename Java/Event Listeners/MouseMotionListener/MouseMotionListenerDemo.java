import java.awt.*;
import java.awt.event.*;

class MouseMotionListenerDemo extends Frame implements MouseMotionListener {
    Label l = new Label("Mouse Status will update here.");

    MouseMotionListenerDemo() {        
        addMouseMotionListener(this);
        setLayout(new FlowLayout());
        add(l);
        setSize(600, 100);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse Moved to X: " + e.getX() + ", Y: " + e.getY());
    };
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse Dragged to X: " + e.getX() + ", Y: " + e.getY());
    };

    public static void main(String[] args) {
       new MouseMotionListenerDemo();    
    }
}