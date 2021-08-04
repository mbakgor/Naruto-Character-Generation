import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class audioSelecter extends fightStyle {

	private int songID = 1;
	public JButton audioButton;
	static audioPlayer player = new audioPlayer("play");
	

	     public audioSelecter()
		    {
	    	 
	    	 audioButton = new JButton();
	         audioButton.setBounds(1310, 65, 50, 50);
		     audioButton.setIcon(new ImageIcon(mainGui.class.getResource("/media/audioChange.png")));
		     audioButton.setVisible(true);
		     
		     audioButton.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseClicked(MouseEvent e)
					{
						
						play(++songID);
						
					}
					
					
				});
	
	
            }
	     
	     public void play(int currentSongID)
	     {
	    	 if(currentSongID == 1) {
	    		 
	    		 player = new audioPlayer("play");
	    		 player.run();
	    	 }
	    	 else if(currentSongID == 2) {
	    		 
	    		 player.clip.stop();
	    		 player = new audioPlayer("play1");
	    		 player.run();
	    	 }
	    	 else if(currentSongID == 3) {
	    		 
	    		 player.clip.stop();
	    		 player = new audioPlayer("play2");
	    		 player.run();
	    	 }
	    	 else if(currentSongID == 4) {
	    		 
	    		 player.clip.stop();
	    		 player = new audioPlayer("play3");
	    		 player.run();
	    	 }
	    	 else if(currentSongID == 5) {
	    		 
	    		 player.clip.stop();
	    		 player = new audioPlayer("play4");
	    		 player.run();
	    	 }
	    	 else {
	    		 songID = 1;
	    		 player.clip.stop();
	    		 play(songID);
	    	 }
	     }
}
