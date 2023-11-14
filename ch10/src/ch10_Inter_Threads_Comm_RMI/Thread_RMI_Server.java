package ch10_Inter_Threads_Comm_RMI;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
public class Thread_RMI_Server {
    public static void main(String[] args) {
        try {
            RemoteInterface remoteObj = new RMI_Implementation();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/RemoteObject", remoteObj);
            System.out.println("Server started.");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
