package ch10_Inter_Threads_Comm_RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class RMI_Implementation extends UnicastRemoteObject implements RemoteInterface {
    private String receivedMessage;
    public RMI_Implementation() throws RemoteException {
        super();
    }
    public void sendMessage(String message) throws RemoteException {
        receivedMessage = "RMI_Processed: " + message;
    }
    public String receiveMessage() throws RemoteException {
        return receivedMessage;
    }
}
