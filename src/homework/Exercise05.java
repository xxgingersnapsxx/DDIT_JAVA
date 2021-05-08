package homework;

public class Exercise05 {
	public static void main(String[] args) {
		int[] numArr = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > max) {
				max = numArr[i];
			}
			if (numArr[i] < min) {
				min = numArr[i];
			}
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
}
