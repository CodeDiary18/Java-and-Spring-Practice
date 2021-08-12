package p06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter printer = new ThreeDPrinter();
		
		printer.setMaterial(powder);
		
		Powder p = (Powder)printer.getMaterial();
	}

}
