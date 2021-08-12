package p09;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");		
	}
	
	@Override
	public void turnOn() {
		System.out.println("Dektop turn on");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Desktop turn off");
	}
}
