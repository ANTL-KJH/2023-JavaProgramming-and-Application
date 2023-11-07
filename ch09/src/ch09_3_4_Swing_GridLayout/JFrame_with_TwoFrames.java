package ch09_3_4_Swing_GridLayout;

import java.awt.*;
import javax.swing.*;
public class JFrame_with_TwoFrames extends JFrame {
    public JFrame_with_TwoFrames() {
        this.setSize(300, 400);
        setTitle("JFrame with Two Panels and GridLayout");
        this.setLayout(new FlowLayout()); // layout of Frame
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        panel_1.setSize(250, 200);
        panel_1.setBackground(Color.cyan);
        GridLayout grid_3x3 = new GridLayout(3, 3);
        grid_3x3.setVgap(5); // 5 pixel as vertical gap
        grid_3x3.setHgap(5); // 5 pixel as horizontal gap
        panel_1.setLayout(grid_3x3);
        panel_2.setSize(250, 200);
        panel_2.setBackground(Color.yellow);
        GridLayout grid_2x3 = new GridLayout(2, 3);
        grid_2x3.setVgap(5);
        grid_2x3.setHgap(5); // 5 pixel as horizontal gap
        panel_2.setLayout(grid_2x3);
        this.add(panel_1);
        this.add(panel_2);
        JButton button1 = new JButton("Button_1");
        JButton button2 = new JButton("Button_2");
        JButton button3 = new JButton("Button_3");
        JButton button4 = new JButton("Button_4");
        JButton button5 = new JButton("Button_5");
        JButton button6 = new JButton("Button_6");
        JButton button7 = new JButton("Button_7");
        JButton button8 = new JButton("Button_8");
        panel_1.add(button1);
        panel_1.add(button2);
        panel_1.add(button3);
        panel_1.add(button4);
        panel_1.add(button5);
        panel_2.add(button6);
        panel_2.add(button7);
        panel_2.add(button8);
        setVisible(true);
    }
    public static void main(String[] agrs) {
        JFrame_with_TwoFrames twoFrames_GridLayout =
                new JFrame_with_TwoFrames();
    }
}
