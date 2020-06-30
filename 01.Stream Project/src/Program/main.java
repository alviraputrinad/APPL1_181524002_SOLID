package Program;

import Models.File;
import Models.Music;
import Models.StreamProgressInfo;

public class main {

	public static void main(String[] args) {
		
		File file = new File("Jessica", 12, 90);
		Music music = new Music("Coldplay", "Scientis", 34, 88);
		
		StreamProgressInfo fileInfo = new StreamProgressInfo(file);
		StreamProgressInfo musicInfo = new StreamProgressInfo(music);
		
		System.out.println(fileInfo.CalculateCurrentPercent());
		System.out.println(musicInfo.CalculateCurrentPercent());
		
		
	}
}
