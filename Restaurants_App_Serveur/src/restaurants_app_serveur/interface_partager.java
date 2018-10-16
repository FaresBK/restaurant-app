package restaurants_app_serveur;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface interface_partager extends Remote {
    public int getMoyenne() throws RemoteException;
    public int CalculerMoyenne(double note) throws RemoteException;
    public int CalculerScore(int n,int s,int v) throws RemoteException;
    public int Comparer() throws RemoteException;
    public String AfficherListe() throws RemoteException;

}
