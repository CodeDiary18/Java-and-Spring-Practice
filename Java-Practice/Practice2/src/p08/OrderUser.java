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
		System.out.println("주문 접수 번호 : "+orderNum);
		System.out.println("주문 핸드폰 번호 :"+phoneNum);
		System.out.println("주문 집 주소 :"+address);
		System.out.println("주문 날짜 :"+date);
		System.out.println("주문 시간 :"+time);
		System.out.println("주문 가격 :"+price);
		System.out.println("메뉴 번호 :"+menuNum);
	}
}
