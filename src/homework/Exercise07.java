package homework;

import java.util.Random;
import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		// 가위 바위 보 게임
		// 컴퓨터와 사람이 게임을 해서 결과 출력(랜덤 사용)
		// 출력 예) 사람: 바위
		//          
		//          사람: 바위
		//          컴퓨터: 보
		//          결과: 컴퓨터 승!
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보를 입력하세요: ");
		String player = scanner.next();
		String[] comArr = {"가위", "바위", "보"};
		int randomNum = new Random().nextInt(3);// 0부터 2까지
		String ai = comArr[randomNum];
		
		String result;
		if (player.equals(ai)) {
			result = "비겼습니다!";
		} else if (
			(player.equals("가위") && ai.equals("바위")) ||
			(player.equals("바위") && ai.equals("보")) ||
			(player.equals("보") && ai.equals("가위"))
			) {
			result = "인공지능 컴퓨터 승리!";
		} else {
			result = "게이머 승리!";
		}
		System.out.println("게이머: " + player);
		System.out.println("인공지능 컴퓨터: " + ai);
		System.out.println("결과: " + result);
		scanner.close();
	}
}