package p01;
class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public String toString() {
		return title + "," + author;
	}
}

public class BookTest {

	public static void main(String[] args) {
		Book book = new Book("���̾�","�츣�� �켼");
		System.out.println(book);
	}

}
