package ch09_4_3_Drawing_Star;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Draw_Star extends JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Draw_Star");
        Container cp = jf.getContentPane();
        cp.add(new JComponent() {
            public void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                double radius = 100;
                double x, y, cx = 125, cy = 125;
                double theta_rad = 0;
                final double PI = 3.141592;
                int px[] = new int[5];
                int py[] = new int[5];
                for (int i=0; i<5; i++) {
                    theta_rad = (3.0 * PI) / 2.0 + i * (2.0 * PI) / 5.0;
                    px[i] = (int)(cx + radius * Math.cos(theta_rad));
                    py[i] = (int)(cy + radius * Math.sin(theta_rad));
                }
                g2.setStroke(new BasicStroke(5));
                g2.setColor(Color.RED);
                g2.drawLine(px[0], py[0], px[2], py[2]);
                g2.drawLine(px[2], py[2], px[4], py[4]);
                g2.drawLine(px[4], py[4], px[1], py[1]);
                g2.drawLine(px[1], py[1], px[3], py[3]);
                g2.drawLine(px[3], py[3], px[0], py[0]);
            }
        });
        jf.setSize(300, 300);
        jf.setVisible(true);
    }
}
