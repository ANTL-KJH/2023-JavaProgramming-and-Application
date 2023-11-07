// flowlayout은 왼쪽부터 채워나감
package ch09_1_Java_GUI_basic;

import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
public class JFrame_withFlowLayout extends JFrame {
    public JFrame_withFlowLayout() {
        setSize(300, 200);
        setTitle("JFrame with FlowLayout");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.cyan);
        JButton button1 = new JButton("Button_1");
        JButton button2 = new JButton("Button_2");
        this.add(button1);
        this.add(button2);
        setVisible(true);
    }
    public static void main(String[] agrs) {
        JFrame_withFlowLayout f = new JFrame_withFlowLayout();
    }
}
