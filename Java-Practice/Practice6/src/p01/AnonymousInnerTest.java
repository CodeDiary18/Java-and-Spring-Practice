package p01;

class Outter2{
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
		@Override
		public void run() {
				//num = 200; //���� ��
				//i = 10; //���� ��
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	Runnable runnable = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable �� ������ �͸� Ŭ���� ����");
		}
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnerble = out.getRunnable(10);
		runnerble.run();
		
		out.runnable.run();
	}

}
