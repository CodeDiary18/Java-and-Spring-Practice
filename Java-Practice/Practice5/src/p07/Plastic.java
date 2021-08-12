package p07;

public class Plastic extends Material {
	public String toString() {
		return "재료는 Plastic"; 
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력");
	}
}
