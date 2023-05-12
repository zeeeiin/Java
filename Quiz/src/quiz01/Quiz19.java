package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {

		//금액의 동전 - 
		//어떤 금액 x가 주어졌을 때, 큰 금액부터 거슬러서 몇 개가 나와야 하는지 출력하시오.

		int[] arr = {1000, 500, 100, 50, 10};
		
		Scanner scan = new Scanner(System.in);	
		System.out.println("금액>");		
		
//		int x = 17780;		
//		System.out.println(arr[0] + "원:" + x/arr[0]);
//		x %= arr[0];
//		System.out.println(arr[1] + "원:" + x/arr[1]);
//		x %= arr[1];
//		System.out.println(arr[2] + "원:" + x/arr[2]);
//		x %= arr[2];
//		System.out.println(arr[3] + "원:" + x/arr[3]);
//		x %= arr[3];
//		System.out.println(arr[4] + "원:" + x/arr[4]);
//		x %= arr[4];		
		
		int x = scan.nextInt();		
		int i = 0;
		
		while(i < arr.length) {
		
			System.out.println(arr[i] + "원:" + x/arr[i]); 
			x = x % arr[i]; //나머지 저장
			// 이렇게 하면 몫의 값에 해당하는동전 개수가 나옴
			// 위에만 붙이는건지 다 붙이는건지는 해봐야함;
			i++;
		}
	}
}
