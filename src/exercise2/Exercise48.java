package exercise2;

public class Exercise48 {
	public static void main(String[] args) {
		//1 + -2 + 3  + -4 ....총합이 100이상
		int sum = 0;
		int i = 1;
		while (true) {
			sum += (i % 2 == 0)? -i : i;
			if (sum >= 100) {
				break;
			}
			i++;
		}
		System.out.println(i);
	}
}
