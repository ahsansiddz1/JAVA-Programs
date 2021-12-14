import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class loadingBar
	
		{
			JFrame frame=new JFrame("Progress Bar");;
			JProgressBar JBar=new JProgressBar(); 
		//		JProgressBar JBar=new JProgressBar(0,500);//CAN ALSO set the value of our choice
			
			public loadingBar()
			{
				
				frame.setSize(330,300);
				frame.setLayout (null);
				frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
				
				
				JBar.setValue(0);
				JBar.setBounds(10,80,280,50);
				JBar.setStringPainted (true);
				JBar.setFont(new Font("MV BOLI",Font.BOLD,25));
				JBar.setForeground(Color.GREEN);
				JBar.setBackground(Color.BLACK);
				
				frame.add(JBar);
				frame.setVisible (true);
				
				fill();
			}		
	
				public void fill()
				{
					int counter=100;
				
		while(counter>=0){ 
			
						JBar.setValue(counter);
					
								try{
										Thread.sleep(50); //it is 50 milli seconds
									} 
							catch(InterruptedException e)
									{
										e.printStackTrace ();
									}
									
									counter-=1;
									}
									JBar.setString ("DONE ");
								}
			
		}