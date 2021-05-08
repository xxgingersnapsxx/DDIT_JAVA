package chapter2;

public class Question220 {
	public static void main(String[] args) {
		// 구구단의 짝수 단만 출력하여라.
		for (int dan = 2; dan < 10; dan++) {
			if (dan % 2 == 0) {
				System.out.println(dan+"단");
				for (int i = 1; i < 10; i++) {
					if (i % 2 == 1) {
						System.out.println(dan + " * " + i + " = " + dan * i);
					}
				}
				System.out.println();
			}
		}
	}
}
