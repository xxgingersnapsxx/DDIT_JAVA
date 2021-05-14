package chapter5;

public class StringExample {
	public static void main(String[] args) {
		String a = "a";
		String b = "a";
		System.out.println(a.equals(b));
		
		String aa = new String("a");
		String bb = new String("a");
		System.out.println(aa.equals(bb));
	}
}
