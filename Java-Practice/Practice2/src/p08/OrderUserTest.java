package p08;

public class OrderUserTest {

	public static void main(String[] args) {
		OrderUser ou = new OrderUser("Tomas",180,78,37);
		ou.orderNum = "202011020003";
		ou.phoneNum = "01012341155";
		ou.address = "서울시 강남구";
		ou.date = "20201105";
		ou.time = "130505";
		ou.price = 35000;
		ou.menuNum = "004";
		ou.showInfo();
	}

}
