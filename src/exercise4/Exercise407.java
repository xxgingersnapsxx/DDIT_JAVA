package exercise4;

public class Exercise407 {
	public static void main(String[] args) {
		// 1 + 1+2 + 1+2+3 + 1+2+3+4 .....
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("(");
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "+");
				sum = sum + j;
			}
			System.out.print(")");
			System.out.println();
		}
		System.out.println(sum);
	}
}
