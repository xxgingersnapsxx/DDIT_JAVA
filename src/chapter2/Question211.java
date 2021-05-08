package chapter2;

public class Question211 {
	public static void main(String[] args) {
		// 문제 3-6번에
		// byte a = 10; 추가
		
		char ch01 = '8';
		System.out.println(ch01 >= 'A' && ch01 <= 'Z');
		System.out.println(ch01 >= '0' && ch01 <= '9');
		char ch02 = 'a';
		//(ch02 >= 65 && ch02 <= 90) ?
		// "대문자" : (ch02 >= 97 && ch02 <= 122) ? "소문자":"문자아님";
	}
}
