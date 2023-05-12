package quiz01;

import java.util.Scanner;

public class Quiz11 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력받습니다.
		 * 2. 입력받은 수까지 약수의 합 (나누어 떨어지는 수)
		 * 
		 * 예시
		 * 입력수 10
		 * 출력 1+2+5+10 => 약수의 합 18
		 * 
		 */
	
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력수 ");
		int a = scan.nextInt();

		int b = 1;
		int sum = 0;
		
		while(b<=a) {

			if(a%b == 0 || a%b ==0) {	
				sum += b;
			} 				
			b++;			
		} 
		System.out.print("약수의 합 " + sum);

		scan.close();

	}

	}