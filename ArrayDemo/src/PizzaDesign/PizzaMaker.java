package PizzaDesign;

public class PizzaMaker {

	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		System.out.println("Ingredient : " +basicPizza.getDescription());
		System.out.println("Cost : " +basicPizza.getCost());


	}

}
