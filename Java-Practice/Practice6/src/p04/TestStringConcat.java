package p04;

public class TestStringConcat {
	public static void main(String[] args) {
		//클래스 방식
		String s1 = "Hello";
		String s2 = "World";
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);
		
		//람다식 방식
		StringConcat concat2 = (s,v)->System.out.println(s+","+v);
		concat2.makeString(s1, s2);
		
		//익명 객체를 생성하는 람다식
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println( s1 + "," + s2 );
			}
		};
		concat3.makeString(s1, s2);
	}
}
