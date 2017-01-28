package PizzaDesign;



public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough" );
		System.out.println("Adding TomatoSauce" );
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription() + " Tomato Sauce";
	}

	public double getCost() {	
	return tempPizza.getCost()+ 0.35;
	}

	
}
