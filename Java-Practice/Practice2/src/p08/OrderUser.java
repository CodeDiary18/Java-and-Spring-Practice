package p08;

public class OrderUser {
	public String name;
	public int length;
	public int weight;
	public int age;
	
	public String orderNum;
	public String phoneNum;
	public String address;
	public String date;
	public String time;
	public int price;
	public String menuNum;
	
	public OrderUser() {}
	public OrderUser(String name,int length, int weight, int age) {
		this.name = name;
		this.length = length;
		this.weight = weight;
		this.age = age;
	}
	public void showInfo() {
		System.out.println("�ֹ� ���� ��ȣ : "+orderNum);
		System.out.println("�ֹ� �ڵ��� ��ȣ :"+phoneNum);
		System.out.println("�ֹ� �� �ּ� :"+address);
		System.out.println("�ֹ� ��¥ :"+date);
		System.out.println("�ֹ� �ð� :"+time);
		System.out.println("�ֹ� ���� :"+price);
		System.out.println("�޴� ��ȣ :"+menuNum);
	}
}
