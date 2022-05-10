package component;

public class CPU extends Component {
	//field variables of CPU
	private double frequency;
	private double numTransistors;
	
	//constructor for CPU
	public CPU(double frequency, double numTransistors) {
		this.frequency = frequency;
		this.numTransistors = numTransistors;
	}
	
	//printer function for CPU
	public String toString() {
		return "frequency=" + getFrequency()+ ", numTransistors=" + getNumTransistors() + ", price=" + String.format("%.2f", price());
	}
	
	//abstract methods of CPU
	@Override
	public double productionCost() {
		return 50*frequency;
	}

	@Override
	public double profitRate() {
		if(frequency > 2.4)
			return 0.3;
		else
			return 0.2;
	}
	
	//setters and getters for CPU
	public double getFrequency() {
		return frequency;
	}
	public double getNumTransistors() {
		return numTransistors;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public void setNumTransistors(int numTransistors) {
		this.numTransistors = numTransistors;
	}
}












