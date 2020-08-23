package commandPattern.command1;

/**
 * @author RG45649
 * Its a receiver class 
 */
public class MarioCharacter {
	private String name;
	
	public void moveUp() {
		System.out.println(getName() + " is moving up");
	}
	
	public void moveDown() {
		System.out.println(getName() + " is moving down");
	}
	
	public void moveLeft() {
		System.out.println(getName() + " is moving Left");
	}
	
	public void moveRight() {
		System.out.println(getName() + " is moving Right");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
