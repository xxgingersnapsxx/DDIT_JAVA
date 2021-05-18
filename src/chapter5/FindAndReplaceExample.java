package chapter5;

public class FindAndReplaceExample {
	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발될 수 있다."
				+ " 자바 언어는 자바스크립트와 다르다."
				+ " 자신감을 갖고 프로그래밍을 공부하면 "
				+ " 자바 뿐만 아니라 다른 프로그래밍 언어도"
				+ " 자신만의 방식으로 해결할 수 있다.";
		int index = str.indexOf("자바");
		if (index == -1) {
			System.out.println("자바 문자열이 포함되어 있지 않습니다.");
		} else {
			System.out.println("자바 문자열이 포함되어 있습니다.");
			str = str.replaceAll("(자[가-힣]+)", "-$1");
			System.out.println(str);
		}
	}
}
