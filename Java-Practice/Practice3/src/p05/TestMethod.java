package p05;

public class TestMethod {
	int num;
	void aaa() {
		System.out.println("aaa() ȣ��");
	}
	public static void main(String[] args) {
		TestMethod a1 = new TestMethod();
		a1.aaa();
		
		TestMethod a2 = new TestMethod();
		a2.aaa();
	}

}
