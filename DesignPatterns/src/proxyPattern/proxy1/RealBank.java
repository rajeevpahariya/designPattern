package proxyPattern.proxy1;

public class RealBank implements Bank{

	@Override
	public void withdraw(String clientName) throws Exception {
		System.out.println(clientName + " Withdrawing from the Bank");
	}

}
