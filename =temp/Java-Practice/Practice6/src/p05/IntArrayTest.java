package p05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
//		for(int num:arr) {
//			System.out.println(num);
//		}
		Arrays.stream(arr).forEach(n->System.out.println(n));
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
//		is.sum(); //->�ѹ� ��������� �ι� ��� ���� �ٽ� �����ؾ���
		
		int sumVal = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
	
		System.out.println(sumVal);
		System.out.println(count);
		
	}

}
