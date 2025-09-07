package decoratorPattern;

public abstract class ToppingDecorator implements BasePizza {
	BasePizza basePizza;
	public ToppingDecorator(BasePizza pizza) {
		this.basePizza = pizza;
	}
		

}
