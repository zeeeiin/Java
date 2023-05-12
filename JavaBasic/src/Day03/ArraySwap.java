package Day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {
	
	public static void main(String[] args) {
		
//		int x = 5;
//		int y = 10;
//		int temp = 0;
//				
//		//y와 x의 자리를 옮기고 싶다면..
//		//변수를 이용해서 값을 바꾸는 방법
//		
////		x = y; //이렇게 하면 y에 뭘 넣어야하지? 하는 문제가 생김
////		y = ???
//		
//		temp = x; // temp = x = y = temp
//		x = y;
//		y = temp;
//		
//		System.out.println(x);
//		System.out.println(y);
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//두 수를 입력받아서, 두 수의 위치번째를 변경
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //0~9 사이의 값
		int b = scan.nextInt(); //0~9
		
		int temp = 0;
		temp = arr[a]; //입력받은 a값
		arr[a] = arr[b];
		arr[b] = temp; 
		//차례대로 계산한다고 생각하면 편하다.
		
		System.out.println(Arrays.toString(arr));
		
	}

}
