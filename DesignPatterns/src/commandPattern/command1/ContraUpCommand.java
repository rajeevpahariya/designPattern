package commandPattern.command1;

public class ContraUpCommand implements Command{
	private ContraCharacter contra;
	public ContraUpCommand(ContraCharacter contra) {
		this.contra = contra;
	}

	@Override
	public void execute() {
		contra.moveUp();
	}
}
