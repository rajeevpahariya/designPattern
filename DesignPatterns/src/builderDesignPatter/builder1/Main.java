package builderDesignPatter.builder1;

public class Main {
	public static void main(String[] args) {
		User rajeev = new User.UserBuilder("Rajeev", "Gupta")
				.age(30)
				.phoneNumber("7353597626")
				.address("Benagalure")
				.build();
		System.out.println(rajeev);
		
		User james = new User.UserBuilder("James", "Bond")
				.age(30)
				.address("Benagalure")
				.build();
		
		System.out.println(james);
	}
}
