import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
public class main  {

	public static void main (String[] args)  throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\Do you want to marry me\\src\\music\\Tớ-Thích-Cậu-Nhường-Nào_-Cậu-Sẽ-Biết-Thôi-我多喜歡你，你會知道-_Gửi-Thời-Đẹp-Đẽ-Đơn-Thuần-Của-Chúng-Ta-Ost_.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();
		new doyouwanttomarryme();

	}

}
