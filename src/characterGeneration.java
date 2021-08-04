import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class characterGeneration extends mainGui{

	JLabel charactergenBackgroundlbl;
	JFrame charactergenFrame;
	Characters newCharacter;
	private JLabel getName;
	private JButton again;
	
   public characterGeneration(String Name,boolean checker)
   {
	   initialize(Name,checker);
   }
   
   public void initialize(String Name,Boolean checker)
   {
	   
	   newCharacter = new Characters(Name,checker);
	   
	   charactergenFrame = new JFrame();
	   charactergenFrame.setResizable(false);
	   charactergenFrame.setBounds(100, 100, 1366, 768);
	   charactergenFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   charactergenFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(mainGui.class.getResource("/media/mainFrameIcon.png")));
	   charactergenFrame.getContentPane().setLayout(null);

       if(newCharacter.specialCharacter) 
       {
    	   charactergenFrame.getContentPane().add(kekkeiGenkais);
	       charactergenFrame.getContentPane().add(kekkeiGenkaiName);
       }
       
       charactergenFrame.getContentPane().add(fightStyle);
       charactergenFrame.getContentPane().add(audioButton);
       charactergenFrame.getContentPane().add(newCharacter.createNatureType());
		
	    getName = new JLabel(""+newCharacter.Name);
		getName.setBounds(0, 180, 500, 70);
		getName.setFont(new Font("Comic Sans MS",Font.BOLD,70));
		getName.setForeground(Color.CYAN);
		charactergenFrame.getContentPane().add(getName);
		getName.setVisible(true);
		
		again = new JButton("Again?");
		again.setBounds(900, 200, 300, 100);
		again.setFont(new Font("Comic Sans MS",Font.BOLD,70));
		again.setForeground(Color.CYAN);
		again.setOpaque(false);
		again.setBorderPainted(false);
		again.setContentAreaFilled(false);
		charactergenFrame.getContentPane().add(again);
		again.setVisible(true);
		
		
		charactergenBackgroundlbl = new JLabel("");
		charactergenBackgroundlbl.setIcon(new ImageIcon(mainGui.class.getResource("/media/charactergenBackground.png")));
		charactergenBackgroundlbl.setBounds(0, 0, 1366, 768);
		charactergenFrame.getContentPane().add(charactergenBackgroundlbl);
		charactergenBackgroundlbl.setVisible(true);

		
		again.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				mainFrame.setVisible(true);
				charactergenFrame.setVisible(false);
			}
			
			
		});
		
		
		
   }
	
}
