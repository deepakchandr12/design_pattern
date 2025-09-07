package decoratorPattern;

public class MargheritaPizza implements BasePizza {

	public MargheritaPizza() {
		// TODO Auto-generated constructor stub
	}

	public int cost() {
		// TODO Auto-generated method stub
		return 250;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Margherita Pizza";
	}

}
