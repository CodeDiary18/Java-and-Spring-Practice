package p07;

public class Powder extends Material{
	@Override
	public void doPrinting() {
		System.out.println("Powder 재료로 출력");
	}
	public String toString() {
		return "재료는 powder"; 
	}
	
}
