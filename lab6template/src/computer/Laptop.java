package computer;
import component.*;



public class Laptop extends Computer {
	//Laptop has an additional field cameraCost
	private int cameraCost;
	
	//constructor for Laptop
	public Laptop(CPU cpu, Display display, String modelName, int cameraCost) {
		this.cpu = cpu;
		this.display = display;
		this.modelName = modelName;
		this.cameraCost = cameraCost;
	}
	
	//Print function for Laptop
	public String toString() {
		return "Laptop:\n- cameraCost=" + getCameraCost() + "\n- modelName=" + getModelName() + "\n- cpu=" + getCpu() + "\n- display=" + getDisplay() + "\n- price=" + String.format("%.2f", price());
	}
		
	//Overriding price in order to compensate for cameraCost
	@Override
	public double price() {
		return cpu.price() + display.price() + cameraCost;
	}
	
	//Abstract methods
	@Override
	public boolean isWearable() {
		return false;
	}

	@Override
	public boolean isPortable() {
		return true;
	}
	
	//getter and setter for cameraCost
	public int getCameraCost() {
		return cameraCost;
	}
	public void setCameraCost(int cameraCost) {
		this.cameraCost = cameraCost;
	}
}
