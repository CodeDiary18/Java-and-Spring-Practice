package p06;

public class VIPCustomer extends Customer{
	double salesRatio;
	private int agentID;
	
	// super를 이용하여 상위 클래스의 생성자 명시적으로 호출
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + "입니	다";
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
