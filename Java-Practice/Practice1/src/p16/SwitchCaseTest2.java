package p16;

public class SwitchCaseTest2 {
	public static void main(String[] args) {
		String medal = "Gold";
		switch(medal) {
			case "Gold":
				System.out.println("금메달");
				break;
			case "Silver":
				System.out.println("은메달");
				break;
			case "Bronze":
				System.out.println("동메달");
				break;
			default:
				System.out.println("메달 X");
				break;
		}
	}
}
