// 동서남북 중앙의 5개 영역으로 나눔
package ch09_BorderLayout;
import java.awt.*;
import javax.swing.*;
public class test_JavaJFrames extends JFrame {
    public test_JavaJFrames()
    {
        setSize(500, 300);
        setLocation(200, 200);
        setTitle("Sample JFrame with four panels");
        setLayout(new BorderLayout());
        JPanel panel1 = new JPanel();
        panel1.setSize(200, 150);
        this.add(panel1, BorderLayout.NORTH);
        panel1.setBackground(Color.yellow);
        JLabel label1 = new JLabel("Text on Panel_1");
        label1.setForeground(Color.red);
        panel1.add(label1);
        JPanel panel2 = new JPanel();
        panel2.setSize(150, 50);
        this.add(panel2, BorderLayout.SOUTH);
        panel2.setBackground(Color.green);
        JLabel label2 = new JLabel("Text on Panel_2");
        label2.setForeground(Color.magenta);
        panel2.add(label2);
        JPanel panel3 = new JPanel();
        panel3.setSize(150, 50);
        this.add(panel3, BorderLayout.WEST);
        panel3.setBackground(Color.pink);
        JLabel label3 = new JLabel("Text on Panel_3");
        label3.setForeground(Color.black);
        panel3.add(label3);
        JPanel panel4 = new JPanel();
        panel4.setSize(100, 50);
        this.add(panel4, BorderLayout.EAST);
        panel4.setBackground(Color.cyan);
        JLabel label4 = new JLabel("Text on Panel_4");
        label4.setForeground(Color.blue);
        panel4.add(label4);
        JPanel panel5 = new JPanel();
        panel5.setSize(100, 50);
        this.add(panel5, BorderLayout.CENTER);
        panel5.setBackground(Color.orange);
        JLabel label5 = new JLabel("Text on Panel_5");
        label5.setForeground(Color.red);
        panel5.add(label5);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        test_JavaJFrames jFr = new test_JavaJFrames();
    }
}
