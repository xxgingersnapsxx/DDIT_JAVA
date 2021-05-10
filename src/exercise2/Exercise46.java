package exercise2;

import java.util.Scanner;

public class Exercise46 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		int sum = 1;
		int num1 = (firstNum - secondNum >= 0) ? secondNum : firstNum;
		int num2 = (firstNum - secondNum < 0) ? secondNum : firstNum;
		
		for (int i = num1; i <= num2; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	}
}
