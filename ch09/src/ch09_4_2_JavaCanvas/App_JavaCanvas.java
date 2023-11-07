package ch09_4_2_JavaCanvas;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
public class App_JavaCanvas extends Canvas{
    public void paint(Graphics g) {
        setBackground(Color.YELLOW);
        g.drawString("Hello", 40, 40);
        g.setColor(Color.BLUE);
        g.fillRect(130, 30, 100, 80);
        g.setColor(Color.GREEN);
        g.drawOval(30, 130, 50, 60);
        g.setColor(Color.RED);
        g.fillOval(130, 130, 50, 60);
        g.setColor(Color.ORANGE);
        g.drawArc(30, 200, 40, 50, 90, 60);
        g.setColor(Color.BLACK);
        g.fillArc(30, 130, 40, 50, 180, 40); }
    public static void main(String[] args) {
        App_JavaCanvas m = new App_JavaCanvas();
        JFrame fr = new JFrame();
        fr.add(m);
        fr.setSize(500, 400);
        fr.setTitle("Java Graphic with Canvas");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
        fr.setVisible(true); } }
