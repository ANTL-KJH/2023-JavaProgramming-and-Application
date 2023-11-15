/**
 * Project Name : JavaProgramming and Application HW10.1
 * Program's purpose and basic function :
 * - Full Duplex Bidirectional Text Chatting Program Server ver.
 * Program First Author : JH KIM
 * Date of First Write : 2023.11.14
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.11.14			v1.00			First Write
 */
import java.awt.*;
import java.awt.event.*; // for ActionEvent(), ActionListener()
import javax.swing.*;
import javax.swing.border.Border;
import java.io.*; // for socket
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
public class Full_Duplex_Bidirectional_Text_Chatting_Server extends JFrame {
    static private JTextArea jtxt_display_area = null;
    private JTextArea jtxt_msg_input_area = null;
    private String input_msg = null;
    static private JTextField jtxt_serv_addr = null;
    static private JTextField jtxt_cli_addr = null;
    static private DataInputStream sockDataInputstream = null;
    static private DataOutputStream sockDataOutputstream = null;
    private static int port_no = 5555;
    public Full_Duplex_Bidirectional_Text_Chatting_Server() { // constructor
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
        JTextArea msg_input_area = new JTextArea("Sample message to be sent to client", 3, 30);
        pnl_message_input_area.add(new JScrollPane(msg_input_area));
        jtxt_msg_input_area = msg_input_area;
        JButton send_button = new JButton("Send Text Message to Client");
//send_button.setLocation(100, 100);
        send_button.setSize(150, 50);
        send_button.setBackground(Color.GREEN);
        send_button.addActionListener(new ActionHandler());
        c.add(send_button);
        setSize(400, 600);
        setVisible(true);
    }
    static private void setDataInputStream( DataInputStream sockDinStr) {
        sockDataInputstream = sockDinStr;
    }
    static private void setDataOutputStream(DataOutputStream sockDoutStr) {
        sockDataOutputstream = sockDoutStr;
    }
    private class ActionHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if (b.getText().equals("Send Text Message to Client")) {
                String input_msg = jtxt_msg_input_area.getText();
                jtxt_display_area.append("<< " + input_msg + "\n");
                jtxt_msg_input_area.setText(""); // clear input text message area
                try {
                    sockDataOutputstream.writeUTF(input_msg);
                } catch (IOException e1) {
// TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] agrs) throws IOException {
        Full_Duplex_Bidirectional_Text_Chatting_Server gui_TxtChat_Server = new Full_Duplex_Bidirectional_Text_Chatting_Server();
//gui_TxtChatting.
        ServerSocket servSocket = new ServerSocket(port_no);
        SocketAddress serv_addr = servSocket.getLocalSocketAddress();
        System.out.printf("Socket Server:: ServerSocket (serv_addr: %s) is opened.\n", serv_addr);
        jtxt_display_area.append("Socket Server (" + serv_addr + "):: ServerSocket is opened.\n");
// getting client request
        Socket cliSocket = null;
        System.out.printf("Socket Server:: waiting for a client's connection request ....\n");
        jtxt_display_area.append("Socket Server:: waiting for a client's connection request ....\n");
        try
        {
// mynewSocket object to receive incoming client requests
            cliSocket = servSocket.accept();
            System.out.printf("Socket Server:: Connected to a client: %s\n", cliSocket);
            jtxt_display_area.append("Socket Server:: Connected to a client" + cliSocket + "\n");
// obtaining input and out streams
            DataInputStream sockDataInputstream = new DataInputStream(cliSocket.getInputStream());
            setDataInputStream(sockDataInputstream);
            DataOutputStream sockDataOutputstream = new DataOutputStream(cliSocket.getOutputStream());
            setDataOutputStream(sockDataOutputstream);
            String recvMsgStr;
            String msgStrToSent;
            while(true)
            {
                try {
// getting answers from client
                    recvMsgStr = sockDataInputstream.readUTF();
                    if(recvMsgStr.equals("Exit"))
                    {
                        System.out.println("Client " + cliSocket + " sends exit...");
                        System.out.println("Connection closing...");
                        jtxt_display_area.append("Client " + cliSocket + " sends exit...");
                        jtxt_display_area.append("Connection closing...");
                        cliSocket.close();
                        System.out.println("Closed");
                        jtxt_display_area.append("Closed");
                        break;
                    }
                    jtxt_display_area.append(">> " + recvMsgStr + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
            } // end while(true
            try{
// closing resources
                sockDataInputstream.close();
                sockDataOutputstream.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        catch (Exception e){
            if (cliSocket != null)
                cliSocket.close();
            servSocket.close();
            e.printStackTrace();
        }
    }
}
