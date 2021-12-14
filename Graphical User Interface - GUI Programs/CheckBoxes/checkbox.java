import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class checkbox extends JFrame implements ActionListener
{
//	JFrame frame=new JFrame("Check Box Program");

	JButton button;
	ImageIcon tick;
	ImageIcon cross;
	JCheckBox checker;
	
	
	checkbox()
	{
		this.setTitle("Check Box Program");
		this.setSize(450,100);
		this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		this.setLayout (new FlowLayout());
		this.getContentPane ().setBackground (Color.black);
		
		cross=new ImageIcon("cross.png"); //checker image
		tick=new ImageIcon("tick.png");    //checker image
	
		button=new JButton("Submit");
		button.addActionListener (this);
		button.setFocusable(false);
		
		checker=new JCheckBox();
		checker.setText ("I am not a Robot");
		checker.addActionListener (this);
		checker.setFont(new Font("Brush Script MT",Font.PLAIN,25));
		checker.setForeground (new Color(0x00FF0));
		checker.setBackground (Color.white);
	
	//----------------------------------------
	//adding image in checker
		checker.setIcon(cross);
		checker.setSelectedIcon(tick);
	//-----------------------------------------
	
		checker.setFocusable(false);
		
		
		
		this.add(button);
		this.add(checker);
		this.setVisible (true);		
		
	}

	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource ()==button)
		{
			System.out.println(checker.isSelected ());
		}
	}

}