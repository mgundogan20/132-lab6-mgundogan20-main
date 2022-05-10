package computer;
import component.*;

public class SmartWatch extends Computer {
	//SmartWatch has an additional field buckleCost
	private int buckleCost;
	
	//constructor for SmartWatch
	public SmartWatch(CPU cpu, Display display, String modelName, int buckleCost) {
		this.cpu = cpu;
		this.display = display;
		this.modelName = modelName;
		this.buckleCost = buckleCost;
	}
	
	//Print function for SmartWatch
	public String toString() {
		return "SmartWatch:\n- buckleCost=" + getBuckleCost() + "\n- modelName=" + getModelName() + "\n- cpu=" + getCpu() + "\n- display=" + getDisplay() + "\n- price=" + String.format("%.2f", price());
	}
	
	//Overriding price function in order to compensate for buckleCost
	@Override
	public double price() {
		return cpu.price() + display.price() + buckleCost;
	}
	
	//Abstract methods
	@Override
	public boolean isWearable() {
		return true;
	}

	@Override
	public boolean isPortable() {
		return true;
	}
	
	//setter and getter for buckleCost
	public int getBuckleCost() {
		return buckleCost;
	}
	public void setBuckleCost(int buckleCost) {
		this.buckleCost = buckleCost;
	}
}
