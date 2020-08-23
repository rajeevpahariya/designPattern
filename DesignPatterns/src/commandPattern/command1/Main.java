package commandPattern.command1;

public class Main {
	public static void main(String[] args) {
		
		// Creating Reciver
		MarioCharacter marioChar = new MarioCharacter();
		marioChar.setName("Mario");
		
		ContraCharacter contraChar = new ContraCharacter();
		contraChar.setName("Contra");
		
		// Create Commands
		Command marioUp = new MarioUpCommand(marioChar);
		Command marioDown = new MarioDownCommand(marioChar);
		Command marioRight = new MarioRightCommand(marioChar);
		Command marioLeft = new MarioLeftCommand(marioChar);
		
		Command contraUp = new ContraUpCommand(contraChar);
		Command contraDown = new ContraDownCommand(contraChar);
		Command contraRight = new ContraRightCommand(contraChar);
		Command contraLeft = new ContraLeftCommand(contraChar);
		
		// Invoker for Mario
		GameBoy gameBoyMario = new GameBoy(marioUp, marioDown, marioLeft, marioRight);
		gameBoyMario.arrowUp();
		gameBoyMario.arrowDown();
		gameBoyMario.arrowLeft();
		gameBoyMario.arrowRight();
		
		System.out.println("==================");
		
		// Invoker for Contra
		GameBoy gameBoyContra = new GameBoy(contraUp, contraDown, contraLeft, contraRight);
		gameBoyContra.arrowUp();
		gameBoyContra.arrowDown();
		gameBoyContra.arrowLeft();
		gameBoyContra.arrowRight();
	}
}
