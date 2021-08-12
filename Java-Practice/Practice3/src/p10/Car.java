package p10;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("½Ãµ¿À» ÄÒ´Ù!");
	}
	
	public void turnOff() {
		System.out.println("½Ãµ¿À» ²ö´Ù!");
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
