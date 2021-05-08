package chapter2;

import java.util.Random;

public class Question213 {
	public static void main(String[] args) {
		Random random = new Random();
		// 1. 변수 x를 선언하고 0이상 100미만 사이의 임의의 정수 값으로초기화
		int x = random.nextInt(100);
		System.out.println(x);
		// 43초과 375미만 => 44이상 375미만
		int x2 = random.nextInt(375 - 44) + 44;
	}
}
