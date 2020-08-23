package singleton.singleton1;

public class Main {

	public static void main(String[] args) {

		// Eagrly Singleton
		MyClass myClass = MyClass.getInstance();
		MyClass secondClass = MyClass.getInstance();

		myClass.name = "Class";

		System.out.println(myClass);
		System.out.println(secondClass);
		
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		System.out.println(singleton1);
		System.out.println(singleton2);
		
		// Below ex for no singleton
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1);
		System.out.println(p2);

	}
}
