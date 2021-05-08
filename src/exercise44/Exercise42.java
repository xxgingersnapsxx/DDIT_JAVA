package exercise44;

import java.util.Scanner;

public class Exercise42 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요(1~12): ");
		int month = scanner.nextInt();
		String result = "";
		switch (month) {
		case 12:
		case 1:
		case 2:
			result = "겨울";
			break;
		case 3:
		case 4:
		case 5:
			result = "봄";
			break;
		case 6:
		case 7:
		case 8:
			result = "여름";
			break;
		case 9:
		case 10:
		case 11:
			result = "가을";
			break;
		default:
			result = "잘못된 입력";
			break;
		}
		System.out.println(month + "월은 " + result + "입니다.");
		scanner.close();
	}
}
