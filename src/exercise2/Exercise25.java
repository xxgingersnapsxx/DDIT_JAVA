package exercise2;

import java.util.Scanner;

public class Exercise25 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 갯수: ");
		int fiveHundred = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		int oneHundred = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		int fifty = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		int ten = scanner.nextInt();
		int sum = fiveHundred * 500 + oneHundred * 100 + fifty * 50 + ten * 10;
		System.out.println("저금통 안의 동전의 총 액수: " + sum);
		
		scanner.close();
	}
}
