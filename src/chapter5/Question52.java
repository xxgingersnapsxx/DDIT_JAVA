package chapter5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Question52 {
	public static void main(String[] args) {
		// 1.
		System.out.println(Pattern.matches("[a-z]{2,3}", "sss"));
		// 2.
		System.out.println(Pattern.matches("[a-zA-Z]{3}[0-9]+", "xyz32"));
		// 3.
		System.out.println(Pattern.matches("\\d{3}-[0-9]{4}-[0-9]{4}", "010-1233-4567"));
		// 4.
		System.out.println(Pattern.matches("[0-9]{6}-[1-4][0-9]{6}", "991122-2845736"));
		// 5.
//		System.out.println(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_.\\\\]*@[a-zA-Z0-9]{1,7}.[a-zA-Z0-9]{2,3}(.kr)?", "s_-327.4b\\@ddit.or.kr"));
		System.out.println(Pattern.matches("\\w(\\w|-|_|.|\\\\)*@[a-zA-Z0-9]{1,7}.[a-zA-Z0-9]{2,3}(.kr)?", "s_-327.4b\\@ddit.or.kr"));
	}
}
