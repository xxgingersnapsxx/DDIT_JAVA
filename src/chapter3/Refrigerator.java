package chapter3;

public class Refrigerator implements RemoteControl, Searchable {

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public void setVolume(int volume) {
		
	}

	@Override
	public void search(String word) {
		System.out.println(word + "의 검색 결과입니다.");
	}

}
