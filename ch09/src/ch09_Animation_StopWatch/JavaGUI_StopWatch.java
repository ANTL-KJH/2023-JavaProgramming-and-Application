package ch09_Animation_StopWatch;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPanel;

public class JavaGUI_StopWatch extends JFrame {
    boolean running = false;
    Timer timer = new Timer();
    long elapsed_time_ms = 0;
    long last_elapsed_time_ms = 0;
    long current_time_ms;
    long start_time_ms;
    String str_elapsed_time_ms;
    String str_start_time_ms;
    String str_current_time_ms;
    Date date;
    JTextField text_time_ms = new JTextField(1);

    JavaGUI_StopWatch() {
        super("StopWatch with JavaGUI");
        Container contentPane = getContentPane();
        JButton btn_start, btn_pause, btn_stop;
        JPanel panel_time = new JPanel();
        panel_time.setLayout(new BorderLayout());
        JPanel panel_buttons = new JPanel(new GridLayout(1, 3));
        text_time_ms.setEditable(false);
        text_time_ms.setLayout(new BorderLayout());
        text_time_ms.setFont(new Font("courier", Font.BOLD, 40));
        text_time_ms.setText("000.000");
        text_time_ms.setHorizontalAlignment(JTextField.CENTER);
        panel_time.setSize(300, 200);
        text_time_ms.setForeground(Color.red);
        panel_time.add(text_time_ms, BorderLayout.CENTER);
        panel_buttons.setSize(300, 100);
        btn_start = new JButton("Start");
        btn_pause = new JButton("Pause");
        btn_stop = new JButton("Stop");
        btn_start.setFont(new Font("courier", Font.BOLD, 12));
        btn_pause.setFont(new Font("courier", Font.BOLD, 12));
        btn_stop.setFont(new Font("courier", Font.BOLD, 12));
        btn_start.addActionListener(new ButtonListener());
        btn_pause.addActionListener(new ButtonListener());
        btn_stop.addActionListener(new ButtonListener());
        panel_buttons.add(btn_start).setLocation(0, 0);
        panel_buttons.add(btn_pause).setLocation(0, 1);
        panel_buttons.add(btn_stop).setLocation(0, 2);
        contentPane.add(panel_time, BorderLayout.NORTH);
        contentPane.add(panel_buttons, BorderLayout.SOUTH);
        setSize(300, 300);
        setVisible(true);
        timer.scheduleAtFixedRate(update_timer, 0, 5); // task, delay, period
    }

    TimerTask update_timer = new TimerTask() {
        public void run() {
//System.out.println("update_timer executed");
            if (running == true) {
                date = new Date();
                current_time_ms = date.getTime();
                elapsed_time_ms = last_elapsed_time_ms + current_time_ms - start_time_ms; // in long data_type
//str_current_time_ms = String.format("%.3f", current_time_ms/1000.0);
                str_elapsed_time_ms = String.format("%7.3f", elapsed_time_ms / 1000.0);
//System.out.println("Current_time_ms = " + str_current_time_ms);
//System.out.println("Elasped_time_ms = " + str_elapsed_time_ms);
                text_time_ms.setText(str_elapsed_time_ms);
            }
        }
    };

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn.getText().equals("Start")) {
                System.out.println("Start button pressed");
                if (running == true) {
                    return;
                } else {
                    running = true;
                    date = new Date();
                    start_time_ms = date.getTime();
                    str_start_time_ms = String.format("%.3f", start_time_ms / 1000.0);
                    System.out.println("Start_time_ms = " + str_start_time_ms);
                    elapsed_time_ms = last_elapsed_time_ms;
                }
            } else if (btn.getText().equals("Pause")) {
                System.out.println("Pause button pressed");
                running = false;
                last_elapsed_time_ms = elapsed_time_ms;
            } else if (btn.getText().equals("Stop")) {
                System.out.println("Stop button pressed");
                running = false;
                elapsed_time_ms = last_elapsed_time_ms = 0;
                text_time_ms.setText("0.000");
            }
        }
    }

    public static void main(String[] args) {
        new JavaGUI_StopWatch();
    }
}

