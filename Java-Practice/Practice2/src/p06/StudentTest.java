package p06;

public class StudentTest {

	public static void main(String[] args) {
		// Student studentLee = new Student();
		Student studentLee = new Student(1111,"LEE",5);
		String data = studentLee.showStudentInfo();
		System.out.println(data);
	}
}