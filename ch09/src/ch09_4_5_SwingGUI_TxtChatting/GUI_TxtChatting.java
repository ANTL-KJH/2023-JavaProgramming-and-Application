package ch09_4_5_SwingGUI_TxtChatting;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
public class GUI_TxtChatting extends JFrame {
    private JTextArea jtxt_display_area = null;
    private JTextArea jtxt_msg_input_area = null;
    private String input_msg = null;
    private JTextField jtxt_serv_addr = null;
    private JTextField jtxt_cli_addr = null;
    public GUI_TxtChatting() { // constructor
        setTitle("JavaSwing-based TextChatting_Server");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(7, 2, 5, 5);
//gridLayout.setVgap(5); // vertical gap
        Container c = getContentPane();
        c.setBackground(Color.LIGHT_GRAY);
        c.setLayout(new FlowLayout());
        JPanel pnl_addr = new JPanel();
        Border border_addr = BorderFactory.createTitledBorder("Server/Client Address");
        pnl_addr.setBorder(border_addr);
        c.add(pnl_addr);
        JLabel l_serv_addr = new JLabel("Server Addr");
        pnl_addr.add(l_serv_addr);
        JTextField tf_serv_addr = new JTextField("127.0.0.1");
        tf_serv_addr.setBackground(Color.YELLOW);
        pnl_addr.add(tf_serv_addr);
        JLabel l_cli_addr = new JLabel("Client Addr");
        pnl_addr.add(l_cli_addr);
        JTextField tf_cli_addr = new JTextField("127.0.0.1");
        tf_cli_addr.setBackground(Color.YELLOW);
        pnl_addr.add(tf_cli_addr);
        JPanel pnl_display_area = new JPanel();
        Border border_text_area = BorderFactory.createTitledBorder("Program Progress / Received Message");
        pnl_display_area.setBorder(border_text_area);
        c.add(pnl_display_area);
        JTextArea display_area = new JTextArea("Constructor executed...\n", 15, 30);
        pnl_display_area.add(new JScrollPane(display_area));
//display_area.append("\nadded line"); // for testing only
        jtxt_display_area = display_area;
        JPanel pnl_message_input_area = new JPanel();
        Border border_message_input_area = BorderFactory.createTitledBorder("Input message to be sent");
        pnl_message_input_area.setBorder(border_message_input_area);
        c.add(pnl_message_input_area);
        JTextArea msg_input_area = new JTextArea("input message here", 3, 30);
        pnl_message_input_area.add(new JScrollPane(msg_input_area));
        jtxt_msg_input_area = msg_input_area;
        JButton send_button = new JButton("Send Text Message to Client");
//send_button.setLocation(100, 100);
        send_button.setSize(150, 50);
        send_button.setBackground(Color.GREEN);
        send_button.addActionListener(new ActionHandler());
        c.add(send_button);
        setSize(400, 500);
        setVisible(true);
    }
    private class ActionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if (b.getText().equals("Send Text Message to Client")) {
                String input_msg = jtxt_msg_input_area.getText();
                jtxt_display_area.append(">> " + input_msg + "\n");
            }
        }
    }
    public static void main(String[] agrs) {
        GUI_TxtChatting gui_TxtChatting = new GUI_TxtChatting();
    }
}

