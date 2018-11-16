import java.applet.*;
import java.awt.*;

/*
<applet code="FirstApplet" width=200 height=200>
</applet>
*/

public class FirstApplet extends Applet {
    public void init() {
        Label l1 = new Label("Name: ");
        TextField t1 = new TextField(10);
        Label l2 = new Label("Roll No: ");
        TextField t2 = new TextField(10);

        add(l1); add(t1);
        add(l2); add(t2);  
    }
}