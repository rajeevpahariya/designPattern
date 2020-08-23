package strategyDesignPattern.strategy1.model;

import strategyDesignPattern.strategy1.controller.ScoreBoardBase;

public class Clowns implements ScoreBoardBase{
	@Override
	public int calculateScore(int taps, int multiplier) {
		return (taps * multiplier) -30;
	}
}
