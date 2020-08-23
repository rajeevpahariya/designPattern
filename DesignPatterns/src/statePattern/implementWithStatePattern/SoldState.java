package statePattern.implementWithStatePattern;

public class SoldState implements State {

	SodaVendingMachine machine;

	public SoldState(SodaVendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney() {
		System.out.println("Give a second.. Soda coming right out....");
	}

	@Override
	public void ejectMoney() {
		System.out.println("Sorry!!!, Your soda is coming !!!!!");
	}

	@Override
	public void selectSoda() {
		System.out.println("Nope.. you can't select another soda!!");
	}

	@Override
	public void dispatchSoda() {
		System.out.println("Dispatching your soda....");
		machine.setCount(machine.getCount()-1);
		if (machine.getCount() > 0) {
			machine.setState(machine.getNoMoneyState());
		} else {
			machine.setState(machine.getSoldOutState());
		}
	}

	@Override
	public String toString() {
		return "Dispatchig the soda!!!";
	}

}
