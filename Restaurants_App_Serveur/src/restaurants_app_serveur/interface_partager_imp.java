package restaurants_app_serveur;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
	 
public class interface_partager_imp extends UnicastRemoteObject implements  interface_partager {
    protected interface_partager_imp () throws RemoteException{
		super();
    }
    int moyenne;
    @Override
    public int getMoyenne() throws RemoteException {
        return moyenne;
    }

    @Override
    public int CalculerMoyenne(double note) throws RemoteException {
        int f=(int) (note/5);
        return f;
    }

    @Override
    public int CalculerScore(int n, int s, int v) throws RemoteException {
        int a=1;
        a=n+s+v;
        int score=a/3;
        return score;
       
    }

    @Override
    public int Comparer() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String AfficherListe() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
