package commandPattern.command1;

public class MarioRightCommand implements Command {
	private MarioCharacter mario;

	public MarioRightCommand(MarioCharacter mario) {
		this.mario = mario;
	}

	@Override
	public void execute() {
		mario.moveRight();
	}
}
