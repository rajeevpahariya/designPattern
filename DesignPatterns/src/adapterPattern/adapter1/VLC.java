package adapterPattern.adapter1;

public class VLC implements AdvancedMedialPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		
	}

}
