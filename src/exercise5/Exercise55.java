package exercise5;

public class Exercise55 {
	public static void main(String[] args) {
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2790;
		
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i] + "개");
			money = money % coinUnit[i];
			/*
			int a = money / coinUnit[i];
			int left = money - coinUnit[i]*a;
			System.out.println(coinUnit[i] + "원 : " + a + "개");
			money = left;
			if (i == 0) {
				System.out.println("500원 : "+a+"개");
			}else if (i == 1) {
				System.out.println("100원 : "+a+"개");
			} else if (i == 2) {
				System.out.println("50원 : "+a+"개");
			} else if (i == 3) {
				System.out.println("10원 : "+a+"개");
			}
			*/
		}
	}
}
