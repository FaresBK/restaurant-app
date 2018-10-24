/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FBK
 */
public class mainserveur {
    
    public static void main (String []args){
        try {
            LocateRegistry.createRegistry(1020);
            serveurimplementation sr=new serveurimplementation();
            Naming.rebind("rmi://localhost:1020/FR",sr);
            System.out.println(sr.toString());
            } catch (Exception ex) {
                ex.printStackTrace();
          }
        }
}
