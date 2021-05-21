package homework8;

public abstract class Shape implements Comparable<Shape> {
	public Shape() {
	}
	// 넓이
	public abstract double area();
	// 둘레
	public abstract double perimeter();
	
	// Comparable 구현
	@Override
	public int compareTo(Shape o) {
		// return 1이면 순서 변경
		// return -1이면 순서 변경 안함
		// return 0이면 그대로
		if (area() > o.area()) {
			return 1;
		} else if (area() < o.area()) {
			return -1;
		} else {
			return 0;
		}
	}
}
