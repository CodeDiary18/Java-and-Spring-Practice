package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject dance;
	
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		
		TestMain test = new TestMain();
		
		test.creatSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport(); //���� ��� ����
		System.out.println(report); // ���
		
	}
	
	//�׽�Ʈ ���� ����
	public void creatSubject(){
		
		korean = new Subject("����", Define.KOREAN);
		math = new Subject("����", Define.MATH);
		dance = new Subject("��۴�", Define.DANCE);
		
		dance.setGradeType(Define.PF_TYPE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
		
	}
	
	//�׽�Ʈ �л� ����
	public void createStudent(){
		
		Student student1 = new Student(211213, "������", korean  );
		Student student2 = new Student(212330, "������", math  );
		Student student3 = new Student(201518, "�Ż��Ӵ�", korean  );
		Student student4 = new Student(202360, "�̼���", korean  );
		Student student5 = new Student(201290, "ȫ�浿", math );
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);

		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		//�� �� ���
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		addScoreForStudent(student1, korean, 95); 
		addScoreForStudent(student1, math, 56);	
		
		addScoreForStudent(student2, korean, 95); 
		addScoreForStudent(student2, math, 95);	
		
		addScoreForStudent(student3, korean, 100); 
		addScoreForStudent(student3, math, 88);	
		
		addScoreForStudent(student4, korean, 89); 
		addScoreForStudent(student4, math, 95);	
		
		addScoreForStudent(student5, korean, 85); 
		addScoreForStudent(student5, math, 56);	
		
		addScoreForStudent(student1, dance, 95);	
		addScoreForStudent(student2, dance, 85); 
		addScoreForStudent(student3, dance, 55);	
		
	}

	//���� ���� �Է�
	public void addScoreForStudent(Student student, Subject subject, int point){
		
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
		
	}
}
