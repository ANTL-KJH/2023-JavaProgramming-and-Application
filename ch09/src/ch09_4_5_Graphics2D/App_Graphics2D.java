package ch09_4_5_Graphics2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class App_Graphics2D extends JFrame{
    private Panel_withGraphics2D panel;
    public App_Graphics2D() {
        setSize(400, 300);
        panel = new Panel_withGraphics2D();
        getContentPane().add(panel, "Center");
    }
    public static void main(String[] args) {
        App_Graphics2D app_G2D = new App_Graphics2D();
        app_G2D.setTitle("Application_Graphics2D");
        app_G2D.setVisible(true);
    }
}
class Panel_withGraphics2D extends JPanel {
    final static BasicStroke stroke_02 = new BasicStroke(2.0f);
    final static BasicStroke stroke_10 = new BasicStroke(10.0f);
    final static BasicStroke stroke_20 = new BasicStroke(20.0f);
    final static BasicStroke stroke_30 = new BasicStroke(30.0f);
    public Panel_withGraphics2D() {}
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.RED);
        g2.setStroke(stroke_02);
        g2.draw(new Line2D.Double(20.0, 10.0, 300.0, 10.0));
        g2.setColor(Color.GREEN);
        g2.setStroke(stroke_10);
        g2.draw(new Line2D.Double(20.0, 50.0, 300.0, 50.0));
        g2.setColor(Color.BLUE);
        g2.setStroke(stroke_20);
        g2.draw(new Line2D.Double(20.0, 100.0, 300.0, 100.0));
        g2.setColor(Color.MAGENTA);
        g2.setStroke(stroke_30);
        g2.draw(new Line2D.Double(20.0, 150.0, 300.0, 150.0));
    }
}
