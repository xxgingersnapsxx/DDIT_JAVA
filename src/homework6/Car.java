package homework6;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200	;
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
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
		return MAX_SPEED;
	}
	public boolean speedUp(double speed) {
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
