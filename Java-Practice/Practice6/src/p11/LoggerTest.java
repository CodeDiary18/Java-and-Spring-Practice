package p11;

public class LoggerTest {
	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getLogger();
		myLogger.log("log test");
	}
}
