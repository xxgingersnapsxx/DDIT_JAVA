package homework6;

public class Circle {
	// 필드
	private double radius;
	private double x;
	private double y;
	
	// 생성자
	public Circle() {
	}
	// 메소드
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
