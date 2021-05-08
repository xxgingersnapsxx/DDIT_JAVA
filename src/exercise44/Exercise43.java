package exercise44;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int programmingBase = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int database = scanner.nextInt();
		System.out.print("화면구현: ");
		int viewImplementation = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int applicationImplementation = scanner.nextInt();
		System.out.print("머신러닝: ");
		int machineLearning = scanner.nextInt();
		int sum = programmingBase + database + viewImplementation + applicationImplementation + machineLearning;
		double average = sum / 5.0;
		String grade = "";
		if (average >= 90) {
			grade = "A";
		} else if (average >= 80) {
			grade = "B";
		} else if (average >= 70) {
			grade = "C";
		} else if (average >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		System.out.println("학점: " + grade);
		scanner.close();
	}
}
