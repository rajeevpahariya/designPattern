package commandPattern.command1;

public class MarioUpCommand implements Command{

	private MarioCharacter mario;
	
	public MarioUpCommand(MarioCharacter mario) {
		this.mario = mario;
	}

	@Override
	public void execute() {
		mario.moveUp();
	}

}
