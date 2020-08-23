package statePattern.implementWithStatePattern;

public class NoMoneyState implements State{

	SodaVendingMachine machine;
	
	public NoMoneyState(SodaVendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("You inserted a dollar!!!");
		machine.setState(machine.getHasMoneyState());
	}

	@Override
	public void ejectMoney() {
		System.out.println("You haven't inserted any money!!!");
	}

	@Override
	public void selectSoda() {
		System.out.println("You selected, but no money inserted!!");
	}

	@Override
	public void dispatchSoda() {
		System.out.println("You have to pay me first!!");
	}
	
	@Override
	public String toString() {
		return "Waiting for a dollar!!!";
	}
	
}
