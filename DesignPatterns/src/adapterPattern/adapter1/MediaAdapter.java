package adapterPattern.adapter1;

public class MediaAdapter implements MediaPlayer {

	AdvancedMedialPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("VLC")) {
			advancedMusicPlayer = new VLC();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("VLC")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
