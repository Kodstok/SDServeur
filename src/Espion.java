import java.awt.*;
import java.awt.event.*;
import java.rmi.Naming;
class Espion implements MouseListener,KeyListener 
{
	private Frame frame; 
	private Robot robot; 
	public Espion(Frame f) 
	{
		super(); 
		frame = f;
		// Robot pour simuler le click. 
		try {
			robot = new Robot(); 
			} catch (java.awt.AWTException e) { };
		int j;

		for (j=0;j<f.getComponentCount();j++) 
		{
			f.getComponent(j).addMouseListener(this);
			f.getComponent(j).addKeyListener(this);
		};
		
		try 
        { 
			RemoteRobotImp obj = new RemoteRobotImp(); 
            // Bind this object instance to the name "HelloServer" 
            Naming.rebind("rmi://localhost/HelloServer", obj); 
        } 
        catch (Exception e) 
        { 
            System.out.println("RemoteRobotImpl err: " + e.getMessage()); 
            e.printStackTrace(); 
        } 
	};

public void mouseClicked(MouseEvent e) { } public void mouseEntered(MouseEvent e) { } public void mouseExited(MouseEvent e) { } public void mousePressed(MouseEvent e) {

System.out.println("Press!");

} public void mouseReleased(MouseEvent e) {

System.out.println("Release!");

}

public void keyPressed(KeyEvent e) { } public void keyReleased(KeyEvent e) { // Simulation d’un click de souris.

//robot.mousePress(InputEvent.BUTTON1_MASK); robot.mouseRelease(InputEvent.BUTTON1_MASK);

} public void keyTyped(KeyEvent e) { }

};