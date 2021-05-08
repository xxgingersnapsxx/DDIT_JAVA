package exercise2;

public class Exercise22 {
	public static void main(String[] args) {
		double distance = 40e12;
		double speed = 300000.0 * 60 * 60 * 24 * 365;
		double year = distance / speed;
		System.out.println(year);
	}
}
