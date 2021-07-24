package p10;

public class PasswordTest {
	private String password;
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password) throws PasswordException{
		if(password == null){
			throw new PasswordException("��й�ȣ�� null �� �� �����ϴ�");
		}
		else if( password.length() < 5){
			throw new PasswordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
		}
		else if (password.matches("[a-zA-Z]+")){
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		this.password = password;
	}
	
	public static void main(String[] args) {
		PasswordTest test = new PasswordTest();
		String password = null;
		try {
			test.setPassword(password);
			System.out.println("���� ����1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcd";
		try {
			test.setPassword(password);
			System.out.println("���� ����2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcde";
		try {
			test.setPassword(password);
			System.out.println("���� ����3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
		password = "abcde#1";
		try {
			test.setPassword(password);
			System.out.println("���� ����4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}