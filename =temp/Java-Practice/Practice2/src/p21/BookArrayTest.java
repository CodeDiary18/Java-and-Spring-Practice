package p21;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}  
