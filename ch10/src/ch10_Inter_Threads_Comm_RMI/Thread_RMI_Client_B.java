package ch10_Inter_Threads_Comm_RMI;

import java.rmi.Naming;
public class Thread_RMI_Client_B {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObj = (RemoteInterface)
                    Naming.lookup("rmi://localhost/RemoteObject");
// Receive the processed message from the server
            String response = remoteObj.receiveMessage();
            System.out.println("RMI_Client_B:: received from RMI: "
                    + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

