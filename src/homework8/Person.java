package homework8;

import java.util.Comparator;
import java.util.Objects;

import kim.chopper.MyArrays;

public class Person implements Comparable {
	private String name;
	private double height;
	
	public Person() {
	}
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "이름: " + name + ", 키: " + height + "㎝";
	}
	public static String getTallest(Person[] people) {
		int maxIndex = MyArrays.getMaximum(people);
		return people[maxIndex].name;
	}
	// compareTo()가 앞에 값이 뒤 값보다 크면 1을 반환
	// 작으면 -1을 반환
	// 같으면 0을 반환
	@Override
	public int compareTo(Object o) {
		Double heightD = height;
		if (heightD.compareTo(((Person) o).getHeight()) > 0) {
			return 1;
		} else if (heightD.compareTo(((Person) o).getHeight()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
}


