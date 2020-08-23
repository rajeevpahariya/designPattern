package templatePattern.template1;

public class CricketGame extends Game {
	@Override
	public void initializeGame() {
		System.out.println("Initializing the Cricket Game!!");
	}

	@Override
	public void startGame() {
		System.out.println("Starting the Cricket Game!!");
	}

	@Override
	public void endGame() {
		System.out.println("Ending the Cricket Game!!");
	}
}
