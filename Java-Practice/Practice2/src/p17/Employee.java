package p17;

public class Employee {
	private static int serialNum = 1000;
	
	public static int getSerialNum() {
		int i = 0;
		//employeeName = "Lee"; 이렇게는 사용 불가
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
}
