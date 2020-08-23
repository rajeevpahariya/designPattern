package templatePattern.template1;

public abstract class Game {
	public abstract void initializeGame();
	public abstract void startGame();
	public abstract void endGame();
	
	// Finally so that subclasses can't change the behavior of this
	public final void play() {
		initializeGame();
		startGame();
		endGame();
	}
}
