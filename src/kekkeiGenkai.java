import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class kekkeiGenkai {

	private Random rand = new Random();
	JLabel kekkeiGenkais,kekkeiGenkaiName;
	int detArr[] = new  int[100];
	int i = 0;
	private int det = rand.nextInt(13) + 1;
	
		public kekkeiGenkai()
		{
			kekkeiGenkais = new JLabel("");
			kekkeiGenkais.setBounds(0, 380, 70, 70);
			kekkeiGenkais.setVisible(true);
			
			kekkeiGenkaiName = new JLabel("");
			kekkeiGenkaiName.setBounds(100, 365, 500, 100);
			kekkeiGenkaiName.setFont(new Font("Comic Sans MS",Font.BOLD,60));
			kekkeiGenkaiName.setForeground(Color.CYAN);
			kekkeiGenkaiName.setVisible(true);

				
			if(det == 1) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/byakugan.png")));
		 	    kekkeiGenkaiName.setText("Byakugan");
		 	    detArr[i++] = det;
			
		    }
			
			if(det == 2) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/crystal.png")));
		     	kekkeiGenkaiName.setText("Crystal");
		     	detArr[i++] = det;
	     	}
			
			if(det == 3) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/dark.png")));
			    kekkeiGenkaiName.setText("Dark");
			    detArr[i++] = det;
		    }
			
			if(det == 4) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/explosion.png")));
		      	kekkeiGenkaiName.setText("Explosion");
		      	detArr[i++] = det;
		    }
			
			if(det == 5) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/rinnegan.png")));
			    kekkeiGenkaiName.setText("Rinnegan");
			    detArr[i++] = det;
	      	}
			
			if(det == 6) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/sharingan.png")));
			    kekkeiGenkaiName.setText("Sharingan");
			    detArr[i++] = det;
		    }
			
			if(det == 7) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/magnet.png")));
			    kekkeiGenkaiName.setText("Magnet");
			    detArr[i++] = det;
		    }
			
			if(det == 8) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/ice.png")));
			    kekkeiGenkaiName.setText("Ice");
			    detArr[i++] = det;
		    }
			
			if(det == 9) 
			{	
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/wood.png")));
			    kekkeiGenkaiName.setText("Wood");
			    detArr[i++] = det;
			}
			
			if(det == 10) 
			{
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/jogan.png")));
			    kekkeiGenkaiName.setText("Jogan");
			    detArr[i++] = det;
			}
			
			if(det == 11) 
			{
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/tenseigan.png")));
			    kekkeiGenkaiName.setText("Tenseigan");
			    detArr[i++] = det;
			}
			
			if(det == 12) 
			{
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/ketsuryugan.png")));
			    kekkeiGenkaiName.setText("Ketsuryugan");
			    detArr[i++] = det;
			}
			
			if(det == 13) 
			{
				kekkeiGenkais.setIcon(new ImageIcon(mainGui.class.getResource("/media/storm.png")));
			    kekkeiGenkaiName.setText("Storm");
			    detArr[i++] = det;
		    }
		

}
}
