package decoratorPattern;

public class VeggieTopping extends ToppingDecorator {

	public VeggieTopping(BasePizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+90;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return basePizza.description()+" + Extra veggie";
	}

}
