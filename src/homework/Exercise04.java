package homework;

import java.util.Scanner;

public class Exercise04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		String result = inputNum + "단\n\n";
		for (int i = 1; i <= 9; i++) {
			result += inputNum + " * " + i + " = " + (inputNum * i) + "\n";
		}
		System.out.println(result);
		scanner.close();
	}
}
