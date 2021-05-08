package chapter2;

public class Exercise38 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float formula = 5 / 9F * (fahrenheit - 32);
		float celcius = (int)(formula * 100 + 0.5) / 100f;
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
	}
}
