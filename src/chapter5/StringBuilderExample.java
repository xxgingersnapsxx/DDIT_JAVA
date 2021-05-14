package chapter5;

public class StringBuilderExample {
	public static void main(String[] args) {
		int a = 10;
		Integer b = 10;
		/*
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * short -> Short
		 * byte -> Byte
		 * char -> Character
		 * boolean -> Boolean
		 */
		
		
		String str = "";
		for (int i = 1; i <= 100; i++) {
			str = str + i;
		}
		System.out.println(str);
		// StringBuilder로 변경
		StringBuilder builder = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			builder.append(i);
		}
		System.out.println(builder);
		
	}
}
