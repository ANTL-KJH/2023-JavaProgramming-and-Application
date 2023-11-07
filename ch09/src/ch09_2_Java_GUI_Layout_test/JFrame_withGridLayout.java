package ch09_2_Java_GUI_Layout_test;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
public class JFrame_withGridLayout extends JFrame {
    public JFrame_withGridLayout() {
        setSize(300, 150);
        setTitle("Frame with GridLayout");
        setLayout(new GridLayout(0, 3, 2, 2));  // (int row, int col, int hgap, int vgap)
        getContentPane().setBackground(Color.cyan);
        JButton button1 = new JButton("Button_1");
        JButton button2 = new JButton("Button_2");
        JButton button3 = new JButton("Button_3");
        JButton button4 = new JButton("Button_4");
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        setVisible(true);
    }
    public static void main(String[] agrs) {
        JFrame_withGridLayout JFr_GridLayout = new JFrame_withGridLayout();
    }
}
