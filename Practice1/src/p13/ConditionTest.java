package p13;
import java.util.Scanner;

public class ConditionTest {
	public static void main(String[] args) {
		int max;
		System.out.println("�Է� ���� �� �� �� ū ���� ����Ͻÿ�!");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է�1 : ");
		int x = scanner.nextInt();
		System.out.println("�Է�2 : ");
		int y = scanner.nextInt();
		
		max = (x>y)?x:y;
		System.out.println(max);
	}
}
