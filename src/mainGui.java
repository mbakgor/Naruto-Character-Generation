import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class mainGui extends audioSelecter {

	JFrame mainFrame;
	private JLabel mainBackgroundlbl,welcomeText,nameText;
	private JButton getStart;
	private JTextField enterName;
	private JRadioButton yes,no;
	private ButtonGroup specialCheck;
	
	public mainGui()
	{
		initialize();
	}
	
	private void initialize()
	{
		mainFrame = new JFrame();
		mainFrame.setResizable(false);
		mainFrame.setBounds(100,100,1366,768);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.getContentPane().setLayout(null);
		mainFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(mainGui.class.getResource("/media/mainFrameIcon.png")));
		
		
		welcomeText = new JLabel("Welcome to Naruto Character Generation!");
		welcomeText.setForeground(Color.CYAN);
		welcomeText.setBackground(Color.CYAN);
		welcomeText.setFont(new Font ("Comic Sans MS",Font.BOLD,18));
		welcomeText.setBounds(530, 150, 370, 35);
		mainFrame.getContentPane().add(welcomeText);
		welcomeText.setVisible(true);
		
		nameText = new JLabel("Enter your character name and select speciality");
		nameText.setForeground(Color.CYAN);
		nameText.setBackground(Color.CYAN);
		nameText.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		nameText.setBounds(530,200,500,23);
		mainFrame.getContentPane().add(nameText);
		nameText.setVisible(true);
		
		
		getStart = new JButton("Let's Start!");
		getStart.setFont(new Font ("Comic Sans MS",Font.BOLD,16));
		getStart.setBounds(670, 250, 130, 23);
		mainFrame.getContentPane().add(getStart);
		getStart.setVisible(true);
		
		enterName = new JTextField(5);
		enterName.setBounds(530,250,130,23);
		mainFrame.getContentPane().add(enterName);
		enterName.setVisible(true);
		
		yes = new JRadioButton("Yes");
		yes.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		yes.setForeground(Color.CYAN);
		yes.setBounds(800,250,100,30);
		yes.setOpaque(false);
		yes.setBorderPainted(false);
		yes.setVisible(true);
		
		no = new JRadioButton("No");
		no.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		no.setForeground(Color.CYAN);
		no.setBounds(850, 250, 100, 30);
		no.setOpaque(false);
		no.setBorderPainted(false);
		no.setVisible(true);
		
		specialCheck = new ButtonGroup();
		specialCheck.add(yes); specialCheck.add(no);
				
		mainFrame.getContentPane().add(no);
		mainFrame.getContentPane().add(yes);
        mainFrame.getContentPane().add(audioButton);
        
		
		mainBackgroundlbl = new JLabel("");
		mainBackgroundlbl.setIcon(new ImageIcon(mainGui.class.getResource("/media/mainBackground.png")));
		mainBackgroundlbl.setBounds(0, 0, 1366, 768);
		mainFrame.getContentPane().add(mainBackgroundlbl);
		mainBackgroundlbl.setVisible(true);
		
		getStart.addMouseListener(new MouseAdapter()
				{
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(yes.isSelected())
				{
					
				characterGeneration characterMenu = new characterGeneration(enterName.getText(),true);
				characterMenu.charactergenFrame.setVisible(true);
				mainFrame.setVisible(false);
				
		      	}
				
				if(no.isSelected())
				{
					
				characterGeneration characterMenu = new characterGeneration(enterName.getText(),false);
				characterMenu.charactergenFrame.setVisible(true);
				mainFrame.setVisible(false);
				
		      	}
				
			}
				});
		
		
		
		
		
	}
	
}
