package statePattern.implementWithStatePattern;

public class SoldOutState implements State{
	
	SodaVendingMachine machine;
	
	public SoldOutState(SodaVendingMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertMoney() {
		System.out.println("Machine Sold Out!!!");
	}

	@Override
	public void ejectMoney() {
		System.out.println("Insert Money before ejecting......");
	}

	@Override
	public void selectSoda() {
		System.out.println("No soda left in machine!!!");
	}

	@Override
	public void dispatchSoda() {
		System.out.println("Sold Out!!!");
	}
	
	@Override
	public String toString() {
		return "Sold Out !!!!!!!!!!";
	}

}
