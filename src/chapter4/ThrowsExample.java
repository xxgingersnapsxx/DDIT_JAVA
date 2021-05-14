package chapter4;

public class ThrowsExample {
	public static void main(String[] args) {
		findClass();
	}
	
	public static void findClass() {
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
