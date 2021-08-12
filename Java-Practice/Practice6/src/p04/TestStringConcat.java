package p04;

public class TestStringConcat {
	public static void main(String[] args) {
		//Ŭ���� ���
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		//���ٽ� ���
		StringConcat concat2 = (s,v)->System.out.println(s+","+v);
		concat2.makeString(s1, s2);
		
		//�͸� ��ü�� �����ϴ� ���ٽ�
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println( s1 + "," + s2 );
			}
		};
		concat3.makeString(s1, s2);
	}
}
