package chapter5;

public class Example55 {
	public static void main(String[] args) {
		int loopCount = 3000;
		// String 결합
		long start = System.currentTimeMillis();
		String str = "a";
		for (int i = 0; i < loopCount; i++) {
			str += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println("String 결합: " + (end - start) + "ms");
		
		// StringBuffer 결합
		long start1 = System.currentTimeMillis();
		StringBuffer sb1 = new StringBuffer("a");
		for (int i = 0; i < loopCount; i++) {
			sb1.append("a");
		}
		long end1 = System.currentTimeMillis();
		System.out.println("StringBuffer 결합: " + (end1 - start1) + "ms");

		// StringBuilder 결합
		long start2 = System.currentTimeMillis();
		StringBuilder sb2 = new StringBuilder("a");
		for (int i = 0; i < loopCount; i++) {
			sb2.append("a");
		}
		long end2 = System.currentTimeMillis();
		System.out.println("StringBuilder 결합: " + (end2 - start2) + "ms");
	}
}
