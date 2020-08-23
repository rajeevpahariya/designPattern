package builderDesignPatter.builder3;

public class TipiHouseBuilder implements HouseBuilder {
private House house;
	
	public TipiHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Wood Bars");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Wood Blocks");
	}

	@Override
	public void bulidRoof() {
		house.setRoof("Wood Roof");
	}

	@Override
	public void buildInterior() {
		house.setInterior("Wood Interior");
	}

	@Override
	public House getHouse() {
		return this.house;
	}
}
