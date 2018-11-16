import java.awt.*;

class GraphicsDemo extends Frame {
    GraphicsDemo() {

        setTitle("Graphics Class");
        setBackground(Color.BLACK);
        setSize(480, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        //text
        g.setColor(Color.WHITE);
        g.drawString("Graphics Class in AWT", 20, 70);

        //oval
        g.setColor(Color.GREEN);
        g.drawOval(20, 100, 140, 100);

        //circle
        g.setColor(Color.RED);
        g.fillOval(180, 100, 100, 100);

        //rectange
        g.setColor(Color.MAGENTA);
        g.fillRect(300, 100, 160, 100);

        //triangle
        int[] xPoints = {120, 200, 40};
        int[] yPoints = {240, 380, 380};
        g.setColor(Color.WHITE);
        g.fillPolygon(xPoints, yPoints, 3);

        //custom polygon
        int[] cxPoints = {220, 320, 400, 320, 220, 270};
        int[] cyPoints = {240, 240, 320, 380, 380, 310};
        g.setColor(Color.WHITE);
        g.drawPolygon(cxPoints, cyPoints, 6);

    }


    public static void main(String[] args) {
        GraphicsDemo gd = new GraphicsDemo();
        gd.paint(null);
    }
}