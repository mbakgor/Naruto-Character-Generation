import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;

public class fightStyle extends kekkeiGenkai {

	private Random rand = new Random();
	JLabel fightStyle;
	private int det = rand.nextInt(3) + 1;
	
	
	   public fightStyle()
	   {
		   
		    fightStyle = new JLabel("");
		    fightStyle.setBounds(0, 565, 500, 100);
			fightStyle.setFont(new Font("Comic Sans MS",Font.BOLD,60));
			fightStyle.setForeground(Color.CYAN);
			fightStyle.setVisible(true);
			
			if(det == 1) fightStyle.setText("Ninjutsu-");
			
			if(det == 2) fightStyle.setText("Taijutsu-");
			
			if(det == 3) fightStyle.setText("Genjutsu-");
			
			
			
			
	   }
}
