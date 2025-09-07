package decoratorPattern;

public class PlainPizza implements BasePizza {

	public PlainPizza() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Base Pizza";
	}

}
