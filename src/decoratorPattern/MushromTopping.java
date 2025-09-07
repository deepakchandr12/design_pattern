package decoratorPattern;

public class MushromTopping extends ToppingDecorator {

	public MushromTopping(BasePizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	public int cost() {
		// TODO Auto-generated method stub
		return basePizza.cost()+180;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return basePizza.description()+" + Mushroom Topping";
	}

}
