package restaurants_app_serveur;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Restaurants_App_Serveur {

    public static void main(String[] args)throws Exception {
        
    LocateRegistry.createRegistry(1099);
    interface_partager_imp restaurant=new interface_partager_imp();
    Naming.rebind("rmi://localhost:1099/DATA", restaurant);
    }
    
}
