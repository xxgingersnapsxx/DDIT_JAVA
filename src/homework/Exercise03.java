package homework;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputMonth = scanner.nextInt();
		String result;
		if (inputMonth >= 1 && inputMonth <= 12) {
			switch (inputMonth) {
			case 2:
				result = "28일";
				break;
			case 4: case 6: case 9: case 11:
				result = "30일";
				break;
			default:
				result = "31일";
				break;
			}
		} else {
			result = "입력값이 올바르지 않습니다.";
		}
		System.out.println(result);
		scanner.close();
	}
}
