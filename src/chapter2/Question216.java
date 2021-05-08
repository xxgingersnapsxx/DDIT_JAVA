package chapter2;

import java.util.Random;

public class Question216 {
	public static void main(String[] args) {
		Random random = new Random();
		// 1. 변수 score를 선언하고 0이상 100이하의 정수 중에 임의의 값으로 초기화
		int score = random.nextInt(101);
		// 2. score의 값이 90 이상이면 "A"를 출력, 80점 이상이면 "B"를 출력
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		System.out.println(score);
		// 70점 이상이면 "C"를 출력, 60점이상이면 "D"를 출력
		// 60점 미만이면 "F"를 출력하여라.
	}
}
