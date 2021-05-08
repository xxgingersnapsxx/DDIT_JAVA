package homework;

import java.util.Random;

public class Exercise08 {
	public static void main(String[] args) {
		/*
		 * 참조타입 과제 2번
		 * 주사위를 던져서 각 면이 나오는 횟수를
		 * 출력하는 프로그램을 만들어 보자.
		 * 주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는
		 * 난수 발생기가 대신한다.
		 * 난수 발생기를 10,000번 호출하여
		 * 각 면이 나타나는 횟수를 계산하여 배열에 저장한다.
		 * 확률 이론에 의하면 주사위의 각각의 면들이
		 * 거의 동일한 횟수로 나와야 한다. 
		 */
		/*
		int[] num = new int[6];
		System.out.println("---------");
		System.out.println("면\t 빈도");
		System.out.println("---------");
		
		for (int i = 0; i < 10000; i++) {
			int random = (int)(Math.random()*6) +1;
			
			if (random == 1) {
				num[0]++;
			} else if(random == 2) {
				num[1]++;
			} else if(random == 3) {
				num[2]++;
			} else if(random == 4) {
				num[3]++;
			} else if(random == 5) {
				num[4]++;
			} else if(random == 6) {
				num[5]++;
			}
		}
		System.out.println("1\t"+num[0]);
		System.out.println("2\t"+num[1]);
		System.out.println("3\t"+num[2]);
		System.out.println("4\t"+num[3]);
		System.out.println("5\t"+num[4]);
		System.out.println("6\t"+num[5]);
		*/
		
		int[] dice = new int[6];
		System.out.println("------------");
		System.out.println("면\t빈도");
		System.out.println("------------");
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			dice[random.nextInt(dice.length)]++;
		}
		for (int i = 0; i < dice.length; i++) {
			System.out.println((i + 1) + "\t"+ dice[i]);
		}
	}
}