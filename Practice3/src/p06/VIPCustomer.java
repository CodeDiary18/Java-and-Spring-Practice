package p06;

public class VIPCustomer extends Customer{
	double salesRatio;
	private int agentID;
	
	// super�� �̿��Ͽ� ���� Ŭ������ ������ ��������� ȣ��
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դ�	��";
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
