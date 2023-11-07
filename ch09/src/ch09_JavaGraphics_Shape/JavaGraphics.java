package ch09_JavaGraphics_Shape;

import java.awt.*;
import javax.swing.*;
public class JavaGraphics extends JFrame {
    Container contentPane;
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillRect(10, 10, 50, 50);
            g.setColor(Color.BLUE);
            g.fillOval(10, 70, 50, 50);
            g.setColor(Color.GREEN);
            g.fillRoundRect(10, 130, 50, 50, 20, 20);
            g.setColor(Color.MAGENTA);
            g.fillArc(10, 190, 50, 50, 0, 270);
            g.setColor(Color.ORANGE);
            int[] x = {35, 10, 35, 60};
            int[] y = {250, 275, 300, 275};
            g.fillPolygon(x, y, 4);
            g.setColor(Color.RED);
            g.drawLine(10, 325, 50, 350);
        }
    }
    JavaGraphics() { // constructor
        setTitle("Testing JavaGraphics");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        MyPanel panel = new MyPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        setSize(300, 500);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JavaGraphics();
    }
}
