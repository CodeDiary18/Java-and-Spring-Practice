package p09;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100,"Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 80);
		
		
		Student studentKim = new Student(101,"Kim");
		studentKim.setKoreaSubject("����", 58);
		studentKim.setMathSubject("����", 88);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}

}
