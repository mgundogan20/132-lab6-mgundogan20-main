package component;

public class Display extends Component {
	//field variables for display
	private int width;
	private int height;
	private String resolution;
	private final double productionCostPerPixel = 0.0001;
	
	//constructor for Display
	public Display(int width, int height) {
		this.width = width;
		this.height = height;
		setResolution();
	}
	//printer function for Display
	public String toString() {
		return "width=" + getWidth()+ ", height=" + getHeight() + ", resolution=" + getResolution()
				+ ", productionCostPerPixel=" + productionCostPerPixel + ", productionCost=" + String.format("%.2f", productionCost()) + ", price=" + String.format("%.2f", price());
	}
	//abstract methods
	@Override
	public double productionCost() {
		return productionCostPerPixel * width * height;
	}

	@Override
	public double profitRate() {
		return 0.25;
	}
	//setters and getter for Display
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getResolution() {
		return resolution;
	}
	private void setResolution() {//this is for internal machinery only
		resolution = String.format("%dx%d", width, height);
	}
	public void setWidth(int width) {
		this.width = width;
		setResolution();
	}
	public void setHeight(int height) {
		this.height = height;
		setResolution();
	}
}



























