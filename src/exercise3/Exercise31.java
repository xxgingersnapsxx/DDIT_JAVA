package exercise3;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요: ");
		int firstNum = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		int secondNum = scanner.nextInt();
		int bigNumber = ((firstNum+secondNum) + Math.abs(firstNum-secondNum)) / 2;
		int smallNumber = ((firstNum+secondNum) - Math.abs(firstNum-secondNum)) / 2;
		System.out.println("큰 수를 작은 수로 나눈 몫은 " + bigNumber/smallNumber + "이고, 나머지는 " + bigNumber % smallNumber + "이다.");
		scanner.close();
	}
}
