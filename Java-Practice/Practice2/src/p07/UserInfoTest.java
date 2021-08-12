package p07;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo userLee = new UserInfo();
		userLee.userId = "a5555";
		userLee.userPassWord = "zzz12345";
		userLee.userName = "Lee";
		userLee.phoneNumber = "0101235864";
		userLee.userAddress = "Seoul, Korea";
		
		System.out.println(userLee.showUserInfo());
		UserInfo userKim = new UserInfo("b5555","5454d5d","Kim");
		System.out.println(userKim.showUserInfo());
	}
}
