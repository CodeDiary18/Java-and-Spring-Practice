package p15;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A'); // ���� �ϳ� ���
			char buf[] = {'B','C','D','E','F','G'};
		
			fw.write(buf); //���� �迭 ���
			fw.write("�ȳ��ϼ���. �� �����׿�"); //String ���
			fw.write(buf, 1, 2); //���� �迭�� �Ϻ� ���
			fw.write("65"); //���ڸ� �״�� ���
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
