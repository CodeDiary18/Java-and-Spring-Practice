package p10;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행한다.");
		System.out.println("자동차가 스스로 방향을 조작한다.");
	}

	@Override
	public void stop() {
		System.out.println("스스로 정지한다.");
	}
	
	@Override
	public void washCar() {
		System.out.println("자동세차");
	}
	
}
