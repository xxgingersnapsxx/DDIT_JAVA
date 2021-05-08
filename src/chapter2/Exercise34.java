package chapter2;

public class Exercise34 {
	public static void main(String[] args) {
		int apples = 123;
		int bucket = 10;
		int numOfBucket = apples / bucket + (apples % bucket > 0 ? 1 : 0);
		System.out.println(numOfBucket);
	}
}
