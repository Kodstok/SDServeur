/* Classe qui implémente l'Interface (à transformer en stub après la compilation)*/

//package com.jmdoudoux.test.rmi;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteRobotImp extends UnicastRemoteObject implements RemoteRobot  {

  private static final long serialVersionUID = 2674880711467464646L;
  private Robot robot; 
  protected RemoteRobotImp() throws RemoteException {
    super();
    try {
		robot = new Robot(); 
		} catch (java.awt.AWTException e) { };
  }

  public void pressAkey() throws RemoteException {
	  robot.mousePress(InputEvent.BUTTON1_MASK); robot.mouseRelease(InputEvent.BUTTON1_MASK);
	  System.out.println("pressAkey");
  }
}
