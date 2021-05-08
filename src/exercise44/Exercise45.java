package exercise44;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		// 1부터 100사이의 임의의 정수 생성
		Random random = new Random();
		int randomNum = random.nextInt(100) + 1;//1 ~ 100
		System.out.println(randomNum);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("1부터 100사이의 정수 중 하나를 선택하세요: ");
			int inputNum = scanner.nextInt();
			if (randomNum == inputNum) {
				System.out.println("정답입니다.");
				break;
			} else if (randomNum > inputNum) {
				System.out.println("정답은 더 큰 수입니다.");
			} else {
				System.out.println("정답은 더 작은 수입니다.");
			} 
		}
		scanner.close();
	}
}
