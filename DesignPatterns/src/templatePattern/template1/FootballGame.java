package templatePattern.template1;

public class FootballGame extends Game{

	@Override
	public void initializeGame() {
		System.out.println("Initializing the Football Game!!");
	}

	@Override
	public void startGame() {
		System.out.println("Starting the Football Game!!");		
	}

	@Override
	public void endGame() {
		System.out.println("Ending the Football Game!!");		
	}

}
