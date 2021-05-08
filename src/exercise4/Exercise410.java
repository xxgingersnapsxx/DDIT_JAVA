package exercise4;

public class Exercise410 {
	public static void main(String[] args) {
		// 1, 2
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1 + ", " + num2);
		for (int i = 0; i < 9; i++) {
			num3 = num1 + num2;
			System.out.print(", " + num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
