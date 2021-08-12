package p14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while ( (i = fis.read(bs)) != -1){
				/*for(byte b : bs){
					System.out.print((char)b);
				}*/
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "����Ʈ ����" );
			}
			/*while ( (i = fis.read(bs, 1, 9)) != -1){
				for(int k= 0; k<i; k++){
					System.out.print((char)bs[k]);
				}
				System.out.println(": " +i + "����Ʈ ����" );
			}*/
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("end");
	}
}
