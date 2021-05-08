package chapter2;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		// 3. 6명의 7과목의 점수(정수)를 저장할 수 있는 변수 score를
		// 선언 및 생성하여라.
		// 단, names와 subjects의 길이를 이용하여라.
		String[] names = new String[6];
		names[0] = "안예솔";
		names[1] = "이인환";
		names[2] = "정재헌";
		names[3] = "이웅희";
		names[4] = "임성민";
		names[5] = "김수정";
		String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		//							6				7
		int[][] scores = new int[names.length][subjects.length];
		Random random = new Random();
		// scores의 모든 요소에 0 ~ 100 사이의 임의의 정수 값을 저장하여라.
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = random.nextInt(101);
			}
		}
	}
}







