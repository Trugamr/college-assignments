import java.awt.*;
import java.awt.event.*;

class ItemListenerDemo {
    public static void main(String[] args) {
        Frame f = new Frame();
        Label l = new Label("Choose Something!");
        Choice c = new Choice();
        c.add("Apple");
        c.add("Kiwi");
        c.add("Peach");
        c.add("Pineapple");

        c.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                l.setText("You Chose: " + c.getItem(c.getSelectedIndex()));
            }
        });
        
        l.setBounds(100, 80, 120, 30);
        c.setBounds(100, 120, 100, 30);
        f.add(l);
        f.add(c);        
        
        f.setTitle("Item Listener Demo");
        f.setLayout(null);
        f.setSize(300, 250);
        f.setVisible(true);        
    }
}