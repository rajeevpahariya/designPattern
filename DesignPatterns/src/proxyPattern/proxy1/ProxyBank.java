package proxyPattern.proxy1;

import java.util.ArrayList;
import java.util.List;

public class ProxyBank implements Bank{

	private RealBank bank = new RealBank();
	private static List<String> bannedClients;
	
	static {
		bannedClients = new ArrayList<String>();
		bannedClients.add("xyz");
		bannedClients.add("abc");
		bannedClients.add("uvw");
	}
	
	@Override
	public void withdraw(String clientName) throws Exception {
		if(bannedClients.contains(clientName.toLowerCase())) {
			throw new Exception(clientName + " Access Denied ! You are banned in Bank");
		}
		bank.withdraw(clientName);
	}

}
