package homework6;

public class Plane {
	private String manufacturer;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;
	public Plane() {
		numberOfPlanes++;
	}
	public Plane(String manufacturer, String model, int maxNumberOfPassengers) {
		this();
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Plane [manufacturer=");
		builder.append(manufacturer);
		builder.append(", model=");
		builder.append(model);
		builder.append(", maxNumberOfPassengers=");
		builder.append(maxNumberOfPassengers);
		builder.append("]");
		return builder.toString();
	}

}
