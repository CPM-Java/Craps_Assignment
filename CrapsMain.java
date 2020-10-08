/**
 * CrapsMain is the starting point for execution.
 * Contains the code to intitialize the frame
 * 
 * @author GrayKnight CPM 
 * @version 11/1/10
 * 
 * DO NOT MODIFY THIS CLASS
 */

 import javax.swing.JFrame;

public class CrapsMain
{

	public static void main(String[] gk)
	{
	    JFrame frame = new JFrame("Craps Table");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new CrapsGUI());
	    frame.pack();
	    frame.setVisible(true);
	}

}
