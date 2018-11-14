import java.awt.*;
import java.awt.event.*;

class MainWindow {
    MainWindow() {
        Frame f = new Frame("AWT Test");
        Panel p = new Panel();
        Label l = new Label("Press any key");
        
        f.add(p);
        p.add(l);

        f.setSize(220, 70);
        f.setVisible(true);
    }
}

class awtFirst {
    public static void main(String[] args) {
        MainWindow m = new MainWindow();
    }
}