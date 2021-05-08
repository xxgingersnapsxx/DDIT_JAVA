package homework;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputAge = scanner.nextInt();
		String result;
		if (inputAge >= 20 && inputAge < 30) {
			result = "20대입니다.";
		} else {
			result = "20대가 아닙니다.";
		}
		System.out.println(result);
		scanner.close();
	}
}
