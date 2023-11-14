package ch10_TimerThread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class ThreadTimerEx extends JFrame {
    public ThreadTimerEx() {
        setTitle("ThreadTimerEx Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
        TimerThread th = new TimerThread(timerLabel);
        c.add(timerLabel);
        setSize(300, 150);
        setVisible(true);
        th.start();
    }
    public static void main(String[] args) {
        new ThreadTimerEx(); } }
