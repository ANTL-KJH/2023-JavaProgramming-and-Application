// Grid Layout은 행렬 느낌
package ch09_JFrame_with_Grid_Layout;

import java.awt.*;
import javax.swing.*;

public class JFrame_withGridLayout extends JFrame {
    JFrame_withGridLayout() {
        setTitle("JFrame_GridLayoutExample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);
        setLayout(grid);
        add(new JLabel("Name"));
        add(new JTextField(""));
        add(new JLabel("St_ID"));
        add(new JTextField(""));
        add(new JLabel("Dept"));
        add(new JTextField(""));
        add(new JLabel("Course"));
        add(new JTextField(""));
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrame_withGridLayout();
    }
}
