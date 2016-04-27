
import java.awt.*; import java.awt.event.*; // Application normale.
public class IHMSimpliste extends Frame 
{

	public IHMSimpliste() 
	{
	
		Label l = new Label(
		"Press Key for Click simulation"); 
		Button b1 = new Button("Exit"); Button b2 = new Button("Other"); 
		b1.addActionListener(
		new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{ System.exit(0); } });
		setLayout(new GridLayout(0, 1)); add(l); add(b1); add(b2);
		
	} 
	public static void main(String args[]) {
	Frame f; Espion e; f=new IHMSimpliste();
	// Utilisation de notre librairie.
	e = new Espion(f);
	f.pack();
	f.setSize(220+10,80+29);
	f.setVisible(true);
	}

}