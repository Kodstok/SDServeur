/* L'Interface */


//package com.jmdoudoux.test.rmi;

import java.rmi.*;

public interface RemoteRobot extends Remote {

   public void pressAkey() throws RemoteException;

}
