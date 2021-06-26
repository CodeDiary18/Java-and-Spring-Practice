package p16;
//Java 14���� ���� �Ǵ� Switch Expression
public class SwitchCaseUpTest {
	public static void main(String[] args) {
		int month = 3;
		int day = switch(month) {
			case 1,3,5,7,8,10,12 ->{
				System.out.println("�� ���� 31��");
				yield 31;
			}
			case 4,6,9,11 ->{
				System.out.println("�� ���� 30��");
				yield 30;
			}
			case 2 ->{
				System.out.println("�� ���� 28��");
				yield 28;
			}
			default->{
				System.out.println("�������� �ʴ� ��");
				yield 0;
			}
		};
		System.out.println(month+"���� "+day+"���̴�.");
	}
}
