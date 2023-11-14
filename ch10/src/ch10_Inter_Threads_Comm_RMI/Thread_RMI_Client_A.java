package ch10_Inter_Threads_Comm_RMI;

import java.rmi.Naming;
public class Thread_RMI_Client_A {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObj = (RemoteInterface)
                    Naming.lookup("rmi://localhost/RemoteObject");
// Send a message to the server
            String client_msg_to_send = "Message from RMI_Client_A";
            remoteObj.sendMessage(client_msg_to_send);
            System.out.println("RMI_Client_A:: sent "
                    + client_msg_to_send);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}