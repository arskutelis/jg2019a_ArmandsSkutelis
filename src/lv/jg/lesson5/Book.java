package lv.jg.lesson5;

import java.util.Objects;

//Ok
public class Book {
	private String author;
	private String title;
	private int pageCount;

	public Book(String author, String title, int pageCount) {
		this.author = author;
		this.title = title;
		this.pageCount = pageCount;
	}

	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getPageCount() {
		return pageCount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Book that = (Book) o;
		return Objects.equals(author, that.author) && Objects.equals(title, that.title)
				&& Objects.equals(pageCount, that.pageCount);
	}
	//šim te nav jābūt - dzēst
//public String toString() {
//	return getClass().getName() + "@"
//			+Integer.toHexString(hashCode());
//}

	@Override
	public String toString() {
		return "Book {" + " author: " + author + " , title: " + title + " , page count: " + pageCount + "}";
	}
}
