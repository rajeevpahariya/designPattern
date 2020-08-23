package statePattern.implementWithStatePattern;

public class SodaVendingMachine {
	
	State soldOutState;
	State soldState;
	State hasMoneyState;
	State noMoneyState;

	// Initial state
	State state = this.soldOutState;
	int count = 0;

	public SodaVendingMachine(int count) {
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.hasMoneyState = new HasMoneyState(this);
		this.noMoneyState = new NoMoneyState(this);
		this.count = count;
		if (count > 0) {
			state = this.noMoneyState;
		}
	}

	// Actions
	public void insertMoney() {
		state.insertMoney();
	}

	public void ejectMoney() {
		state.ejectMoney();
	}

	public void selectSoda() {
		state.selectSoda();
	}

	public void dispatchSoda() {
		state.dispatchSoda();
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getHasMoneyState() {
		return hasMoneyState;
	}

	public void setHasMoneyState(State hasMoneyState) {
		this.hasMoneyState = hasMoneyState;
	}

	public State getNoMoneyState() {
		return noMoneyState;
	}

	public void setNoMoneyState(State noMoneyState) {
		this.noMoneyState = noMoneyState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\n The Soda Machine, Co");
		result.append("\n Inventory : " + getCount() + " soda");
		if(getCount() !=1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Soda Vending Machine is " + getState() + "\n");
		return result.toString();
	}
	
}
