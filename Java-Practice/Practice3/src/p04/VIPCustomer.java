package p04;

public class VIPCustomer extends Customer{
	double salesRatio;
	private int agentID;
	
	// super�� �̿��Ͽ� ���� Ŭ������ ������ ��������� ȣ��
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
	
	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price *bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public int getAgentID() {
		return agentID;
	}
}
