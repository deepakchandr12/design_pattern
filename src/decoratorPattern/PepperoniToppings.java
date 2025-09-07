package decoratorPattern;

public class PepperoniToppings extends ToppingDecorator {

	public PepperoniToppings(BasePizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+70;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return basePizza.description()+" + Pepperoni";
	}

}
