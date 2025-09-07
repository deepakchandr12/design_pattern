package decoratorPattern;

public class pizzaStore {

	public pizzaStore() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("======= Decorator Design Pattern ======");
        // Create a plain pizza
        BasePizza pizza = new PlainPizza();
        System.out.println("Plain Pizza "+pizza.description()+" : Costs = "+pizza.cost());

        // Add toppings to the PlainPizza - Extra Cheese Only
        pizza = new ExtraCheeseTopping(pizza);
        System.out.println("Plain pizza with extra cheese "+pizza.description()+" : Costs = "+pizza.cost());

        // Add toppings to the PlainPizza - Extra Cheese and Veggies
        pizza = new ExtraCheeseTopping(new MushromTopping(new PlainPizza()));
        System.out.println("Pizza with extra cheese and veggies"+pizza.description()+" : Costs = "+pizza.cost());        
		
        // Add toppings to the PlainPizza - Extra Cheese and Pepperoni
        pizza = new ExtraCheeseTopping(new PepperoniToppings(new PlainPizza()));
        System.out.println("Pizz Ingredient "+pizza.description()+" : Costs = "+pizza.cost());
        

        // Add toppings to the PlainPizza - Extra Cheese, Mushroom and Pepperoni
        pizza = new ExtraCheeseTopping(new MushromTopping(new PepperoniToppings(new PlainPizza())));
        System.out.println("Pizza Ingredient "+pizza.description()+" : Costs = "+pizza.cost());
        

        // Farmhouse Pizza
        pizza = new FarmHousePizza();
        System.out.println("Farmhouse Pizza"+pizza.description()+" : Costs = "+pizza.cost());        

        // Farmhouse Pizza with Extra Cheese and Mushroom
        pizza = new ExtraCheeseTopping(new MushromTopping(new FarmHousePizza()));
        System.out.println("Farmhouse Pizza with cheese and mushroom "+pizza.description()+" : Costs = "+pizza.cost());
        

        // Tandoori Paneer Delight Pizza
               

        // Chicken Dominator
        

        // Chicken Dominator with Mushroom


	}

}
