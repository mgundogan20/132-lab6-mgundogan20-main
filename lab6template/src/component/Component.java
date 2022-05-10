package component;

import main.SaleItem;

public abstract class Component implements SaleItem {
	//abstract methods of the superclass
	public abstract double productionCost();
	public abstract double profitRate();
		
	//implementing SaleItem
	//price() calculates the total price of the component and 
	//returns it as a double
	@Override
	public double price() {
		return productionCost() * (1 + profitRate());
	}

}
