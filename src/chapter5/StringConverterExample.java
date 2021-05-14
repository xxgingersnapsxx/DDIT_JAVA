package chapter5;

public class StringConverterExample {
	public static void main(String[] args) {
		String data1 = "200";
		int intData1 = Integer.parseInt(data1);
		int intData2 = new Integer(data1);
		
		int data2 = 150;
//		String strData2 = data2 + "";
//		String strData2 = Integer.toString(data2);
		String strData2 = String.valueOf(data2);
	}
}
