package exercise3;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까?(수도: 1, 수도아님: 0) ");
		int capital = scanner.nextInt();
		System.out.print("총 인구는?(단위: 만) ");
		int population = scanner.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		int salary = scanner.nextInt();
		String result = ((capital == 1 && population >= 100) || salary >= 50) ? "이 도시는 메트로폴리스입니다.":"이 도시는 메트로폴리스가 아닙니다.";
		System.out.println(result);
		scanner.close();
	}
}
