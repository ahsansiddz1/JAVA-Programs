import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bgcolorchangerbutton extends JPanel implements ActionListener
{
	private JButton button;
	private int count;
	private Color[] colors = new Color[] {Color.pink, Color.magenta, Color.orange, Color.yellow, Color.green, Color.blue, new Color(138, 43, 226)};
    private String buttoncolor[]={"pink","Magenta","Yellow","Green","Blue","Purple","Light pink"};
    private String c;
    private int index;
    
    public bgcolorchangerbutton()
    {
    	index = 0;
   	
    	button = new JButton("Push Me !");
    	button.addActionListener(this);
    	button.setFont(new Font("Comic Sans",Font.BOLD,13));
		button.setBorder(BorderFactory.createEtchedBorder ());
			setBackground(Color.yellow);	
			add(button);
}
    
    public void actionPerformed (ActionEvent e)
    {
    	if(index < (colors.length - 1))
    	{
    		c=buttoncolor[index];
    		index++;  
    	}
    	else
    	{
    		index = 0;
    	}
    	button.setText (c);
    	setBackground(colors[index]);
    }
}