package proxyPattern.proxy1;

public class Main {
	public static void main(String[] args) {
		Bank bank = new ProxyBank();
		try {
			bank.withdraw("Rajeev");
			bank.withdraw("abc");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
