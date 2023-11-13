package ch09_JFrame_with_GridLayout;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
public class App_Swing_GridLayout extends JFrame {
    public App_Swing_GridLayout() {
        this.setSize(600, 600);
        this.setLocation(200, 200);
        setTitle("MyFrame with Two Panels");
        this.setLayout(new GridLayout(3, 1, 10, 10)); // layout of Frame
        JPanel panel_1 = new JPanel();
        JPanel panel_11 = new JPanel();
        JPanel panel_12 = new JPanel();
        panel_11.setSize(50, 70);
        panel_12.setSize(50, 70);
        panel_1.setBackground(Color.cyan);
        Border border_panel_1 = BorderFactory.createTitledBorder("Panel_1");
        panel_1.setBorder(border_panel_1);
        Border border_panel_11 = BorderFactory.createTitledBorder("Panel_11");
        panel_11.setBorder(border_panel_11);
        Border border_panel_12 = BorderFactory.createTitledBorder("Panel_12");
        panel_12.setBorder(border_panel_12);
        GridLayout grid_3x3 = new GridLayout(3, 3, 5, 5);
        panel_1.setLayout(grid_3x3);
        panel_1.add(panel_11);
        panel_1.add(panel_12);
        JPanel panel_2 = new JPanel();
        JPanel panel_21 = new JPanel();
        JPanel panel_22 = new JPanel();
        panel_21.setSize(100, 100);
        panel_22.setSize(100, 100);
        panel_2.setBackground(Color.yellow);
        Border border_panel_2 = BorderFactory.createTitledBorder("Panel_2");
        panel_2.setBorder(border_panel_2);
        Border border_panel_21 = BorderFactory.createTitledBorder("Panel_21");
        panel_21.setBorder(border_panel_11);
        Border border_panel_22 = BorderFactory.createTitledBorder("Panel_22");
        panel_22.setBorder(border_panel_12);
        GridLayout grid_2x3 = new GridLayout(2, 3, 5, 5);
        panel_2.setLayout(grid_2x3);
        panel_2.add(panel_21);
        panel_2.add(panel_22);
        JButton button1 = new JButton("Button_1");
        button1.setSize(50, 50);
        JButton button2 = new JButton("Button_2");
        JButton button3 = new JButton("Button_3");
        JButton button4 = new JButton("Button_4");
        JButton button5 = new JButton("Button_5");
        JButton button6 = new JButton("Button_6");
        JButton button7 = new JButton("Button_7");
        JButton button8 = new JButton("Button_8");
        JButton button9 = new JButton("Button_9");
        JButton button10 = new JButton("Button_10");
        panel_11.add(button1);
        panel_11.add(button2);
        panel_12.add(button3);
        panel_12.add(button4);
        panel_1.add(button5);
        panel_21.add(button6);
        panel_21.add(button7);
        panel_22.add(button8);
        JPanel panel_3 = new JPanel();
        JPanel panel_31 = new JPanel();
        JPanel panel_32 = new JPanel();
        Border border_panel_3 = BorderFactory.createTitledBorder("Panel_3");
        panel_3.setBorder(border_panel_3);
        panel_3.setSize(100, 100);
        panel_3.setBorder(border_panel_3);
        panel_3.setBackground(Color.magenta);
        GridLayout grid_1x2 = new GridLayout(1, 2, 5, 5);
        panel_3.setLayout(grid_1x2);
        Border border_panel_31 = BorderFactory.createTitledBorder("Panel_31");
        panel_31.setBorder(border_panel_31);
        Border border_panel_32 = BorderFactory.createTitledBorder("Panel_32");
        panel_32.setBorder(border_panel_32);
        panel_3.add(panel_31);
        panel_3.add(panel_32);
        panel_31.add(button9);
        panel_32.add(button10);
        this.add(panel_1);
        this.add(panel_2);
        this.add(panel_3);
        setVisible(true);
    }
    public static void main(String[] agrs) {
        App_Swing_GridLayout grd_ex = new App_Swing_GridLayout();
    }
}