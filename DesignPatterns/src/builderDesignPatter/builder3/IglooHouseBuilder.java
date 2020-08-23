package builderDesignPatter.builder3;

public class IglooHouseBuilder implements HouseBuilder{

	private House house;
	
	public IglooHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Ice Bars");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Ice Blocks");
	}

	@Override
	public void bulidRoof() {
		house.setRoof("Ice Roof");
	}

	@Override
	public void buildInterior() {
		house.setInterior("ice Interior");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
