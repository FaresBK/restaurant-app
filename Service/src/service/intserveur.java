/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface intserveur extends Remote{
    public double moy(int a,int b,int c)throws RemoteException;
    public Date getdate()throws RemoteException;
    public double [] table(double d,double e, double y)throws RemoteException;
}

