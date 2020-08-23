package builderDesignPatter.builder3;

public class Main {
	public static void main(String[] args) {
		HouseBuilder iglooBuilder = new IglooHouseBuilder();
		CivilEngineer engineer = new CivilEngineer(iglooBuilder);
		engineer.constructHouse();
		House house = engineer.getHouse();
		System.out.println(house);
	}
}
