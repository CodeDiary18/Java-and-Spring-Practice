package p10;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����Ѵ�.");
		System.out.println("����� �ڵ��� �����Ѵ�.");
	}

	@Override
	public void stop() {
		System.out.println("�극��ũ�� ��Ƽ� �����Ѵ�.");
	}
	
}
