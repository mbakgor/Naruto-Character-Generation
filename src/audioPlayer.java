import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import java.net.URL;
public class audioPlayer implements Runnable {

	private ArrayList<String> musicFiles;
	private int currentSongIndex;
	public FloatControl gainControl;
	public Clip clip;
	URL clickSoundURL;
	public audioPlayer(String... files)
	{
		musicFiles = new ArrayList<String>();
		for(String file : files) musicFiles.add(("./resources/media/" + file + ".wav"));
		
	}
	
	public void playSound(String fileName)
	{
		File soundFile = new File(fileName);
		
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
			AudioFormat format = ais.getFormat();
			DataLine.Info info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(ais);
			gainControl =  (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-10);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		playSound(musicFiles.get(currentSongIndex));
	}

	
}
