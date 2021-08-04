import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JLabel;

public class Characters  {

	ArrayList<Characters> players = new ArrayList<Characters>();
	String Name;
	boolean specialCharacter = true;
	String natureType;
	String fightingStyle;
	Random rand;
	JLabel natureTypelbl;
	
	
	public Characters(String Name,boolean specialCharacter)
	{
		this.Name = Name;
		this.specialCharacter = specialCharacter;
		
		players.add(this);
	}
	
	public JLabel createNatureType()
	{
		
		int check;
		rand = new Random();
		check = rand.nextInt(5) + 1;
		
		natureTypelbl = new JLabel("");
		natureTypelbl.setBounds(270, 565, 500, 100);
		natureTypelbl.setFont(new Font("Comic Sans MS",Font.BOLD,60));
		natureTypelbl.setForeground(Color.CYAN);
		natureTypelbl.setVisible(true);
		
		if(check == 1) {
			this.natureType = "Lightning";
			natureTypelbl.setText(natureType);
		}
		if(check == 2) {
			this.natureType = "Fire";
			natureTypelbl.setText(natureType);
		}
		if(check == 3) {
			this.natureType = "Water";
			natureTypelbl.setText(natureType);
		}
		if(check == 4) {
			this.natureType = "Earth";
			natureTypelbl.setText(natureType);
		}
		if(check == 5) {
			this.natureType = "Wind";
			natureTypelbl.setText(natureType);
		}
		
		return natureTypelbl;
	}
	
	
}
