package chapter4;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		try {
			String data1 = "100";
			String data2 = "200";
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.out.println("에러가 발생했어요.");
		} finally {
			System.out.println("무조건 실행");
		}
		
	}
}
