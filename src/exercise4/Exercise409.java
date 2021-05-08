package exercise4;

import java.util.Scanner;

public class Exercise409 {
	public static void main(String[] args) {
		// 1. 
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int sum = 0;
		while (true) {
			sum += inputNum % 10;
			inputNum = inputNum / 10;
			if (inputNum == 0) {
				break;
			}
		}
		System.out.println(sum);
		scanner.close();
	}
}
