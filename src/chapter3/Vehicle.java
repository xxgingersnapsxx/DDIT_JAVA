package chapter3;

// 탈것
public abstract class Vehicle {
	public abstract void run();
	public final void start() {
		System.out.println("시동");
	}
}
