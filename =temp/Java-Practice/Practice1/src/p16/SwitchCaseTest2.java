package p16;

public class SwitchCaseTest2 {
	public static void main(String[] args) {
		String medal = "Gold";
		switch(medal) {
			case "Gold":
				System.out.println("�ݸ޴�");
				break;
			case "Silver":
				System.out.println("���޴�");
				break;
			case "Bronze":
				System.out.println("���޴�");
				break;
			default:
				System.out.println("�޴� X");
				break;
		}
	}
}
