package statePattern.implementWithoutPattern;

public class SodaMachine {
	
	// states
	final static int SOLD_OUT = 0;
	final static int NO_MONEY = 1;
	final static int HAS_MONEY = 2;
	final static int SOLD = 3;
	
	// Initial State
	int state = SOLD_OUT;
	int count = 0;
	
	public SodaMachine(int count) {
		this.count = count;
		if(count > 0) {
			state = NO_MONEY;
			System.out.println("Welcome to our soda vending machine !!!");
			System.out.println("Total soda availabe in Vending Machine " + count);
			System.out.println("Insert the dollar to get the Soda from the machine");
		}
	}
	
	// Actions
	
	public void insertMoney() {
		if(state == HAS_MONEY) {
			System.out.println("You can't insert the another $bill");
		}else if(state == NO_MONEY) {
			state = HAS_MONEY;
			System.out.println("You insert a $ bill");
		}else if(state == SOLD_OUT) {
			System.out.println("All soda's from machine are sold out!!");
		}else if(state == SOLD) {
			System.out.println("Please wait! We are dispatching the soda for you!!!");
		}
	}
	
	public void ejectMoney() {
		if(state == HAS_MONEY) {
			System.out.println("Returning $ bill !!");
			state = NO_MONEY;
		}else if(state == NO_MONEY) {
			System.out.println("You haven't inserted $ bill");
		}else if(state == SOLD) {
			System.out.println("Already selected the soda !!");
		}else if(state == SOLD_OUT) {
			System.out.println("All soda's from machine are sold out!!");
		}
	}
	
	public void selectSoda() {
		if(state == HAS_MONEY) {
			System.out.println("You selected a Soda!!");
			state= SOLD;
			dispatchSoda();
		}else if(state == NO_MONEY) {
			System.out.println("You selected soda, but money 1st buddy !!");
		}else if(state == SOLD_OUT) {
			System.out.println("You are out of luck. No Soda!!");
		}else if(state == SOLD) {
			System.out.println("Dispatching your soda as we speak. Enjoy!!");
		}
	}
	
	public void dispatchSoda() {
		if(state == HAS_MONEY) {
			System.out.println("No Soda has been dispatched!!");
		}else if(state == NO_MONEY) {
			state = HAS_MONEY;
			System.out.println("Please insert the $ bill");
		}else if(state == SOLD_OUT) {
			System.out.println("All soda's from machine are sold out!!");
		}else if(state == SOLD) {
			System.out.println("Dispatching your soda as we speak. Enjoy!!");
			count = count -1;
			if(count == 0) {
				System.out.println("Sorry!! Out of Soda");
				state = SOLD_OUT;
			}else {
				state = NO_MONEY;
			}
		}
	}
	
}
