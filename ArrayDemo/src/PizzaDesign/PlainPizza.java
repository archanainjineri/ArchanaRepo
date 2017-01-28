package PizzaDesign;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Thin Dough";
	}

	@Override
	public double getCost() {
	System.out.println( "Cost of dough: "+ 4.00);
	return 4.00;
	}

}
