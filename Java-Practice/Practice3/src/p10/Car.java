package p10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �Ҵ�!");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ����!");
	}
	public void washCar() {}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
