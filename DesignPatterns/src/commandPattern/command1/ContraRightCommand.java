package commandPattern.command1;

public class ContraRightCommand implements Command {
	private ContraCharacter contra;

	public ContraRightCommand(ContraCharacter contra) {
		this.contra = contra;
	}

	@Override
	public void execute() {
		contra.moveRight();
	}
}
