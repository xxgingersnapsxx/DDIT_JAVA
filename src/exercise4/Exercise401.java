package exercise4;

public class Exercise401 {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(x > 10 && x < 20);
		char ch = ' ';
		System.out.println(ch == ' ' && ch != '\t');
		System.out.println(ch == 'x' || ch == 'X');
		System.out.println(ch >= '0' && ch <= '9');
		System.out.println(ch >= 'A' && ch <= 'Z');
		boolean powerOn = false;
		System.out.println(!powerOn);
		String str = "yes";
		System.out.println(str == "yes");
		System.out.println(str.equals("yes"));
	}
}


