package Day03;

import java.util.Arrays;
import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; 
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++ ) {
			temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
