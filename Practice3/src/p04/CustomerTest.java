package p04;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		int pricelee = customerLee.calcPrice(1000);
		System.out.println("���� : " + pricelee);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "������");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		int pricekim = customerKim.calcPrice(1000);
		System.out.println("���� : " + pricekim);
		
		Customer vc = new VIPCustomer(12345,"no-name");
		vc.calcPrice(1000);
		System.out.println(vc.calcPrice(1000));
	}

}
