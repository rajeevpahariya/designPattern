package prototypePattern.prototype2;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("Sam", 21);
		System.out.println(person1);
		Person person2 = (Person)person1.clone();
		System.out.println(person2);
		
		System.out.println(System.identityHashCode(person1) + " \n" + 
				System.identityHashCode(person2));
	}
}
