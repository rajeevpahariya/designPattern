package adapterPattern.adapter1;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdp;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}
		// mediaAdapter is providing support to play other file formats
		else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			mediaAdp = new MediaAdapter(audioType);
			mediaAdp.play(audioType, fileName);
		}
		else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}

}
