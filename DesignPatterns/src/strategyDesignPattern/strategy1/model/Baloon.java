package strategyDesignPattern.strategy1.model;

import strategyDesignPattern.strategy1.controller.ScoreBoardBase;

public class Baloon implements ScoreBoardBase{
	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) -20;
	}
}
