package chapter2;

public class Question219 {
	public static void main(String[] args) {
		// 1. 0 이상 5 이하에서 정수를 결과와 같이출력하여라.
		// 결과: 0 1 2 3 4 5
		for (int i = 0; i < 6; i++) {
			System.out.print(i + " ");
		}
		// 2. 0이상 5이하에서 정수를 결과와 같이 출력하여라.
		// 결과: 5 4 3 2 1 0
		for (int b = 5; b >= 0; b--) {
			System.out.print(b + " ");
		}
		// 3. 2 이상 10 이하의 정수를 합계를 구하여라.
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		// 4. 5이상 15미만에서 정수의 곱을 구하여라.(overflow를 고려하여라.)
		long a = 1l;
		for (int i = 5; i < 15; i++) {
			a = a * i;
		}
		System.out.println(a);

		// 5. 3이상 4462이하에서 짝수인 정수의 합을 구하여라.
		int even = 0;
		for (int i = 3; i <= 4462; i++) {
			if (i % 2 == 0) {
				even += i;
			}
		}
		System.out.println(even);

		// 6. 7초과 57미만에서 2 또는 3의 배수인 정수의 합을 구하여라.
		sum = 0;
		for (int i = 8; i < 57; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("7초과 57미만 2 또는 3의 배수의 합 :" + sum);
		
	}
}
