package p14;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) { //����
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber + "�� ������ �°��� " + passengerCount + "���̰�, ������ "
				+ money + "�� �Դϴ�");
	}
}
