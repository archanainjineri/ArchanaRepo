package PizzaDesign;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza tempPizza;
	
	public ToppingDecorator(Pizza newPizza){
		tempPizza = newPizza;
	}

	
	public String getDescription() {
		// TODO Auto-generated method stub
		return tempPizza.getDescription();
	}

	public double getCost() {	
	return tempPizza.getCost();
	}
}
