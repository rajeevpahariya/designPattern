package commandPattern.command1;

public class ContraLeftCommand implements Command{
	private ContraCharacter contra;

	public ContraLeftCommand(ContraCharacter contra) {
		this.contra = contra;
	}

	@Override
	public void execute() {
		contra.moveLeft();
	}
}
