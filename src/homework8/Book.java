package homework8;

import java.util.Objects;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = countOfBooks++;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	/** 연체료를 계산하는 추상메소드
	 * 
	 * @param lateDays 연체일자
	 * @return 연체요금
	 */
	public abstract int getLateFee(int lateDays);
	
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "관리번호 " + number + "번, 제목: " + title + ", 작가: " + author;
	}
	
}
