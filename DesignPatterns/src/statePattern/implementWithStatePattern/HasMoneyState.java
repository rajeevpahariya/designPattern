package statePattern.implementWithStatePattern;

public class HasMoneyState implements State{

	SodaVendingMachine machine;
	
	public HasMoneyState(SodaVendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("You have already inserted a dollar!!!");
	}

	@Override
	public void ejectMoney() {
		System.out.println("Returning your dollar!!!");
		machine.setState(machine.getNoMoneyState());
	}

	@Override
	public void selectSoda() {
		System.out.println("Selected Item...........");
		machine.setState(machine.getSoldState());
	}

	@Override
	public void dispatchSoda() {
		System.out.println("No Soda Dispacthedd!!!");
	}
	
	@Override
	public String toString() {
		return "Waiting for soda selection";
	}

}
