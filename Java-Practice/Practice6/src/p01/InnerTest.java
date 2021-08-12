package p01;


class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass(); 
	}
	
	class InClass{
		int iNum = 100;
		
		//static int sInNum = 500; -> ����
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(�ܺ� Ŭ������ instance ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ static ����)");
			System.out.println("InClass inNum = " + iNum + "(���� Ŭ������ instance ����)");
		}
	}
	public void usingClass(){
		inClass.inTest(); //���� Ŭ���� ������ ����Ͽ� �޼��� ȣ���ϱ�
	}
	
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		
		void inTest(){ //���� Ŭ������ �Ϲ� �޼���
			//num += 10; // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			System.out.println("InStaticClass inNum = " + iNum + "(���� Ŭ������ instance ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������	static ���� ���)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ static ���� ���)");
		}
		static void sTest(){ // ���� Ŭ������ static �޼���
			//num += 10; // �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����.
			//inNum += 10; // ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ static ���� ���)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(���� Ŭ������ static ���� ���)");
		}
	}
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("�ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ��");
		outClass.usingClass(); // ���� Ŭ���� ��� ȣ��
		System.out.println();
		
		OutClass.InClass inClass = outClass.new InClass(); // �ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ����
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inClass.inTest();
		
		
		//�ܺ� Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ����
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �޼��� ȣ��");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("���� ���� Ŭ������ ����ƽ �޼ҵ� ȣ��");
		OutClass.InStaticClass.sTest();
	}

}
