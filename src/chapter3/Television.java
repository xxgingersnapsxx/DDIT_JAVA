package chapter3;

public class Television implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void search(String word) {
		System.out.println(word + "의 검색 결과입니다.");
	}

}
