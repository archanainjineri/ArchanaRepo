package PizzaDesign;

public class Mozzarella extends ToppingDecorator{

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough" );
		System.out.println("Adding Mozz" );
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + " Mozz";
	}

	public double getCost() {	
	return tempPizza.getCost()+ 0.45;
	}

	
}
