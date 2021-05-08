package chapter3;

public class Question38 {
	public static void main(String[] args) {
		// 7.
		System.out.println(MyAdd.add(1000));
		// 8.
		MyAdd myAdd = new MyAdd();
		System.out.println(myAdd.add(100, 200));
		// 9.
		System.out.println(myAdd.add(2000, 300000L));
		// 10.
		System.out.println(myAdd.add('1', 100f));
	}
}

class MyAdd {
	// 1.
	static int a = 20;
	// 2.
	int b= 15;
	// 3.
	static int add(int num) {
		return a + num;
	}
	// 4.
	int add(int num1, int num2) {
		return num1 + num2;
	}
	// 5.
	long add(int num1, long num2) {
		return num1 + num2;
	}
	// 6.
	float add(char num1, float num2) {
		return num1 + num2;
	}
}







