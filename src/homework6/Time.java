package homework6;

public class Time {
	// field
	private int hour;
	private int minute;
	private int second;
	// constructor
	public Time() {
	}
	public Time(int hour, int minute, int second) {
		if (hour >= 0 && hour < 24) {
			this.hour = hour;
		}
		if (minute >= 0 && minute < 60) {
			this.minute = minute;
		}
		if (second >= 0 && second < 60) {
			this.second = second;
		}
	}
	// method
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
}
