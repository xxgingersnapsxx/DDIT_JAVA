package homework6;

public class NewCar {
	private double speed;
	private String color;
	// 1mile = 1.6km
	private static final double MAX_SPEED = 200 / 1.6;	// 125마일
	public NewCar() {
	}
	public NewCar(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (speed >= 0 && speed <= MAX_SPEED) {
//			this.speed = speed;
			this.speed += speed;
			if (this.speed > MAX_SPEED) {
				this.speed = MAX_SPEED;
			}
			return true;
		}
		return false;
	}
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Car [speed=");
		builder.append(speed);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
}
