package p15;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		int age = 12;
		int charge;
		
		if(age<8) {
			charge = 1000;
			System.out.println("������ �Ƶ�");
		}
		else if(age<14) {
			charge = 2000;
			System.out.println("�ʵ��л�");
		}
		else if(age<20) {
			charge = 2500;
			System.out.println("��, ����л�");
		}
		else {
			charge = 3000;
			System.out.println("�Ϲ���");
		}
		System.out.println("����� : "+charge+"��");
	}
}
