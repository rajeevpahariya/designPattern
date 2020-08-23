package visitorPattern.visitor1;

public interface Visitor {
	double visitor(Shirt shirtItem);
	double visitor(TShirt tshirtItem);
	double visitor(Jacket jacketItem);
}
