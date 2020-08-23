package prototypePattern.prototype1;

public class Main {
	public static void main(String[] args) {
		Person ryan = new Person("Ryan", 21);
		System.out.println("Person 1 :" + ryan);
		
		Person cloneRyna = (Person)ryan.clone();
		cloneRyna.setName("Clone Ryan");
		System.out.println("Person 2 :" + cloneRyna);
		
		Dolphin dolphin = new Dolphin("Sam", 15);
		System.out.println("dolphin 1 :" + dolphin);
		
		Dolphin cloneDolphin = (Dolphin)dolphin.clone();
		cloneDolphin.setName("tammy");
		System.out.println("dolphin 2 :" + cloneDolphin);
	}
}
