package ch09_4_4_Draw_Arc;

import java.awt.*;
import javax.swing.*;
public class Draw_ColoredArc extends JFrame {
    Container contentPane;
    Draw_ColoredArc() {
        setTitle("Drawing Arcs");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        MyPanel panel = new MyPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        setSize(300, 300);
        setVisible(true);
    }
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            int x0 = 10, y0 = 10;
            int width = 200, height = 200;
            int startAngles[] = {90, 90+120, 90+240};
            int arcAngle = 120;
            g.fillArc(x0, y0, width, height, startAngles[0], arcAngle);
            g.setColor(Color.GREEN);
            g.fillArc(x0, y0, width, height, startAngles[1], arcAngle);
            g.setColor(Color.BLUE);
            g.fillArc(x0, y0, width, height, startAngles[2], arcAngle);
        }
    }
    public static void main(String[] args) {
        new Draw_ColoredArc();
    }
}
