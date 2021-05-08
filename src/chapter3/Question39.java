package chapter3;

import java.util.Random;

public class Question39 {
	public static void main(String[] args) {
		// 6. 
		int distance = doubleDice();
		// 7.
		System.out.println(distance);
	}
	static int doubleDice() {
		Random random = new Random();
		// 1.
		int firstDice = random.nextInt(6) + 1;// 1 ~ 6까지 랜덤
		// 2.
		int secondDice = random.nextInt(6) + 1;
		// 3.
		int result = firstDice + secondDice;
		System.out.println(firstDice + ", " + secondDice);
		// 4.
		if (firstDice == secondDice) {
			result += doubleDice();
		}
		// 5.
		return result;
	}
}





