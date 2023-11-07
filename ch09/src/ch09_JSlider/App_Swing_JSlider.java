package ch09_JSlider;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class App_Swing_JSlider extends JFrame {
    Container contentPane;
    JLabel colorLabel;
    DrawPanel drawPanel;
    JSlider[] sl = new JSlider[3];

    App_Swing_JSlider() {
        setTitle("Example of JSlider and ChangeEvent");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(5, 1));
        colorLabel = new JLabel("Example of slider");
        for (int i = 0; i < sl.length; i++) {
            sl[i] = new JSlider(JSlider.HORIZONTAL, 0, 255, 128);
            sl[i].setPaintLabels(true);
            sl[i].setPaintTicks(true);
            sl[i].setPaintTrack(true);
            sl[i].setMajorTickSpacing(50);
            sl[i].setMinorTickSpacing(10);
            sl[i].addChangeListener(new ChangeSliderListener());
            contentPane.add(sl[i]);
        }
        sl[0].setForeground(Color.RED);
        sl[1].setForeground(Color.GREEN);
        sl[2].setForeground(Color.BLUE);
        int r = sl[0].getValue();
        int g = sl[1].getValue();
        int b = sl[2].getValue();
//colorLabel.setBackground(new Color(r, g, b));
//contentPane.add(colorLabel);
        drawPanel = new DrawPanel();
        drawPanel.setSize(200, 300);
        drawPanel.setBackground(new Color(r, g, b));
        contentPane.add(drawPanel);
        setSize(300, 600);
        setVisible(true);
    }

    class ChangeSliderListener implements ChangeListener {
        public void stateChanged(ChangeEvent e) {
            int r = sl[0].getValue();
            int g = sl[1].getValue();
            int b = sl[2].getValue();
            colorLabel.setBackground(new Color(r, g, b));
            drawPanel.setBackground(new Color(r, g, b));
        }
    }

    class DrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.YELLOW);
//g.drawOval(50, 50, 200, 200);
            g.fillOval(10, 10, 250, 90);
        }
    }

    public static void main(String[] args) {
        new App_Swing_JSlider();
    }
}

