package p09;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원 on");
	}
	
	public void turnOff() {
		System.out.println("전원 off");
	}
}
