import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.Border.border;
class Myframe extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	public Myframe()
	{
		
		ImageIcon image =new ImageIcon("pikachu.png");
		ImageIcon image2=new ImageIcon("pikachu2.png");
		
		label=new JLabel();
		label.setIcon (image2);
		label.setBounds(90,155,300,300);
		label.setVisible (false);
		
		/*JButton*/  button =new JButton();
		button.setBounds(150,50,150,100); //button size width and horizontal vertical position
		button.addActionListener ( this);	//it listens what action is performed // we can also use this ..in the place of buttonlistener(); 
		button.setText("Push me");
		button.setFocusable(false);//do nothing ?
		button.setIcon (image);
		
		//button.setHorizontalTextPosition(JButton.Center);
		//button.setVerticalTextPosition(JButton.Center);
		
		button.setFont(new Font("Comic Sans",Font.BOLD,15));
		button.setIconTextGap (10);
		button.setBackground(Color.YELLOW);
		button.setForeground(Color.red);
		button.setBorder(BorderFactory.createEtchedBorder ());
		//button.setEnabled (false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(500,500);
		this.add(button);
		this.add(label);
	
	}
	
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource()==button)
		{
			button.setEnabled (false);
		//System.out.println("Pikachu");
				label.setVisible (true);
			button.setBackground (Color.black);
		}
	}
}