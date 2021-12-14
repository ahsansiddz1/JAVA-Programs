import javax.swing.JFrame;

public class buttonMain {

	public static void main (String [] args)
	{
		JFrame frame = new JFrame("Push Counter");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		bgcolorchangerbutton panel = new bgcolorchangerbutton();
		frame.getContentPane().add(panel);
		frame.setSize(400,300);
		frame.setVisible(true);
  
	}
}