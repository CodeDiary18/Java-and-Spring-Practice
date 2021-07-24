package p09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws ClassNotFoundException,FileNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);//FileNotFoundException 발생
		Class c = Class.forName(className); //ClassNotFoundException 발생
		return c;
	}
	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		}catch (ClassNotFoundException e) {
//			System.out.println(e);
			e.printStackTrace();
		}catch (FileNotFoundException e) {
//			System.out.println(e);
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
