package exercise2;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요: ");
		int firstNum = scanner.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		int secondNum = scanner.nextInt();
		boolean result = firstNum >= secondNum;
		System.out.println("첫번째 수가 두번째 수보다 큰가? " + result);
		scanner.close();
	}
}
