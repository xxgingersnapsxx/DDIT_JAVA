package chapter3;

public class Calculator {
	String add(String num1, String num2) {
		return num1 + num2;
	}
	// 1. add
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// 2. substract
	int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	// 3. multiply
	long multiply(int num1, int num2) {
		return (long) num1 * num2;
	}
	
	// 4. divide
	double divide(int num1, int num2) {
		return (int) ((double) num1 / num2 * 10 + 0.5) / 10.0;
	}
	
}











