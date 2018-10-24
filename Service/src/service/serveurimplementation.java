/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import javax.swing.plaf.TableUI;

public class serveurimplementation extends UnicastRemoteObject implements intserveur{
     public serveurimplementation() throws RemoteException{
         super();
     }
    @Override
    public double moy(int a, int b, int c) throws RemoteException {
      return (a+b+c)/3;
    }

    @Override
    public Date getdate() throws RemoteException {
       return new Date();
    }
    public double [] table(double d,double e, double y){
        double [] table =new double [3];
        table[0]=d;
        table[1]=e;
        table[2]=y;
        
      return table;  
    }
    
}
