package chapter3;

import java.util.Scanner;

public class Question35 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNum = scanner.nextInt();
		String operator = scanner.next();
		int secondNum = scanner.nextInt();
		Calculator calculator = new Calculator();
		String result = "";
		switch (operator) {
		case "+":
			int add = calculator.add(firstNum, secondNum);
			result = calculator.add(firstNum, secondNum) + "";
			break;
		case "-":
			result = calculator.substract(firstNum, secondNum) + "";
			break;
		case "*":
			result = calculator.multiply(firstNum, secondNum) + "";
			break;
		case "/":
			result = calculator.divide(firstNum, secondNum) + "";
			break;
		default:
			result = "연산종료";
			break;
		}
		
		calculator.add(10, 20);
		
		System.out.println(result);
		scanner.close();
	}
}





