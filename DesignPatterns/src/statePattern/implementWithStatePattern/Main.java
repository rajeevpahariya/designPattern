package statePattern.implementWithStatePattern;

public class Main {
	public static void main(String[] args) {

		SodaVendingMachine machine = new SodaVendingMachine(2);
		System.out.println(machine);

		machine.insertMoney();
		machine.selectSoda();
		machine.dispatchSoda();
		System.out.println(machine);
		
		machine.insertMoney();
		machine.selectSoda();
		machine.dispatchSoda();
		System.out.println(machine);
		
		machine.insertMoney();
		machine.selectSoda();
		System.out.println(machine);
	}
}
