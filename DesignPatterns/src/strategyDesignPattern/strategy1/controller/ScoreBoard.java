package strategyDesignPattern.strategy1.controller;

public class ScoreBoard {
	
	public ScoreBoardBase sb;
	public void showScore(int taps, int multiplier) {
		System.out.println(sb.calculateScore(taps, multiplier));
	}
}
