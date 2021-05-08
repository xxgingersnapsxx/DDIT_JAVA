package exercise4;

public class Exercise403 {
	public static void main(String[] args) {
		int i = 2;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + i * j);
				j++;
			}
			i++;
		}
	}
}
