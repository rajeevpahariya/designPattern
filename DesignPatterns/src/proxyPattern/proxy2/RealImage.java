package proxyPattern.proxy2;

public class RealImage implements Image{

	private String fileName;
	
	public RealImage(String fileName) {
		this.fileName = fileName;
		loadFromTheDisk(fileName);
	}

	private void loadFromTheDisk(String fileName2) {
		System.out.println("Loading .....  " + fileName2);
	}

	@Override
	public void display() {
		System.out.println("Displaying ..." + fileName);
	}

}
