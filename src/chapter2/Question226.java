package chapter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Question226 {
	public static void main(String[] args) {
		// 1. 정수 7개를 저장할 수 있는 변수 score를 선언 및 생성하여라.
//		score: {34, 25, 36, 76, 29, 90, 11};
		
		int[] score = new int[7];
		
		// 2. 변수 score의 각 요소를 0 이상 100 이하인 임의의 정수를 저장하여라.
		Random random = new Random();
		for (int i = 0; i < score.length; i++) {
			score[i] = random.nextInt(101);
		}
		// 3. 변수 score에 저장된 요소들의 합계를 구하여라.
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		// 4. 변수 score에 저장된 요소들의 평균을 구하여라.
		double average = (double) sum / score.length;
		// 5. 변수 score에 저장된 요소에서 최댓값을 구하여라.
		// 6. 변수 score에 저장된 요소에서 최솟값을 구하여라.
		int maxNum = score[0];
		int minNum = score[0];
		for (int i = 0; i < score.length; i++) {
			if (maxNum < score[i]) {
				maxNum = score[i];
			}
			if (minNum > score[i]) {
				minNum = score[i];
			}
		}
		System.out.print("score: {");
		for (int i = 0; i < score.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(score[i]);
		}
		System.out.print("}\n");
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (int)(average * 100 + 0.5) / 100.0);
		System.out.println("최댓값: " + maxNum);
		System.out.println("최솟값: " + minNum);
		// 7. 1~6번의 결과를 이용하여 다음과 같이 출력하여라.
		Arrays.sort(score);
		System.out.print("score: {");
		for (int i = 0; i < score.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(score[i]);
		}
		System.out.print("}\n");
	}
}
