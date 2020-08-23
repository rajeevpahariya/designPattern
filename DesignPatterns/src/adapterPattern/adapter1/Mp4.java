package adapterPattern.adapter1;

public class Mp4 implements AdvancedMedialPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);
	}

}
