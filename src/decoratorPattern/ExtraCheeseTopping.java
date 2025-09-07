package decoratorPattern;

public class ExtraCheeseTopping extends ToppingDecorator {
	
	public ExtraCheeseTopping(BasePizza pizza) {
		super(pizza);
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+20;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return basePizza.description()+" + Extra Cheese";
	}

	
	
		

}
