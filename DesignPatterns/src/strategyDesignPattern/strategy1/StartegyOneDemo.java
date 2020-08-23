package strategyDesignPattern.strategy1;

import strategyDesignPattern.strategy1.controller.ScoreBoard;
import strategyDesignPattern.strategy1.model.Baloon;
import strategyDesignPattern.strategy1.model.Clowns;
import strategyDesignPattern.strategy1.model.SquareBaloon;

public class StartegyOneDemo {
	public static void main(String[] args) {
		ScoreBoard board = new ScoreBoard();
		
		System.out.print("Baloon Score  ");
		board.sb = new Baloon();
		board.showScore(10, 5);
		
		System.out.print("Clowns Score  ");
		board.sb = new Clowns();
		board.showScore(10, 5);
		
		System.out.print("Square Baloon Score  ");
		board.sb = new SquareBaloon();
		board.showScore(10, 5);
	}
}
