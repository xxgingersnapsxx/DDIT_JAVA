package exercise5;

import java.util.Arrays;
import java.util.Random;

public class Exercise56 {
	public static void main(String[] args) {
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		Random random = new Random();

		for (int i = 0; i < ballArr.length; i++) {
			int temp = 0;
			int ranNum = random.nextInt(9);// 4
			temp = ballArr[i];
			ballArr[i] = ballArr[ranNum];
			ballArr[ranNum] = temp;
		}
		System.out.println(Arrays.toString(ballArr));
		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
		System.out.println(Arrays.toString(ball3));
	}
}

