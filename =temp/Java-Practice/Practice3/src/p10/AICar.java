package p10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("���� �����Ѵ�.");
		System.out.println("�ڵ����� ������ ������ �����Ѵ�.");
	}

	@Override
	public void stop() {
		System.out.println("������ �����Ѵ�.");
	}
	
	@Override
	public void washCar() {
		System.out.println("�ڵ�����");
	}
	
}
