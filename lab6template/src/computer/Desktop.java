package computer;
import component.*;

public class Desktop extends Computer {
	//constructor of the Desktop class
	public Desktop(CPU cpu, Display display, String modelName) {
		this.cpu = cpu;
		this.display = display;
		this.modelName = modelName;
	}
	
	//Print function for Desktop
	//check whether this is legitimate!!!!!!!!!!!!!!!!!!
	public String toString() {
		return "Desktop:\n- modelName=" + getModelName() + "\n- Cpu=" + getCpu() + "\n- Display="
				+ getDisplay() + "\n- price=" + String.format("%.2f", price());
	}
	
	
	//abstract methods
	@Override
	public boolean isWearable() {
		return false;
	}

	@Override
	public boolean isPortable() {
		return false;
	}

}
