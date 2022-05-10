package computer;

import main.SaleItem;
import component.*;

public abstract class Computer implements SaleItem {
	//protected variables of the superclass
	protected String modelName;
	protected Component cpu;
	protected Component display;
	
	//abstract methods of the superclass
	public abstract boolean isWearable();
	public abstract boolean isPortable();
	
	//implementing SaleItem
	//price method calculates the total price of the computer object
	//returns it as a double
	@Override
	public double price() {
		return cpu.price() + display.price();
	}

	//setters and getters of the computer class
	protected String getModelName() {
		return modelName;
	}
	protected Component getCpu() {
		return cpu;
	}
	protected Component getDisplay() {
		return display;
	}
	
	protected void setModelName(String name) {
		modelName = name;
	}
	protected void setCpu(Component cpu) {
		this.cpu = cpu;
	}
	protected void setDisplay(Component display) {
		this.display = display;
	}
}
















