package commandPattern.command1;

public class ContraDownCommand implements Command {
	private ContraCharacter contra;

	public ContraDownCommand(ContraCharacter contra) {
		this.contra = contra;
	}

	@Override
	public void execute() {
		contra.moveDown();
	}
}
