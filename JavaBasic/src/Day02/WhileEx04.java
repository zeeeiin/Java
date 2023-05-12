package Day02;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		
		/* <입력과 반복>
		 * 입력 받을 횟수를 지정
		 * 처음 5를 입력받으면
		 * 5번 입력받을 수 있도록 처리
		 * 
		 * 입력받은 값들의 합을 구하시오. 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in); //밖에서 한 번만 만들어지면 된다
		System.out.print("반복수>");
		int size = scan.nextInt();
				
		int sum = 0; //합계누적
		int a = 1;
		while(a <= size ) { //10번 반복 이 중괄호 안에서 입력을 받을 수 있다
			
			System.out.println(">");
			int x = scan.nextInt(); //x값에 대한 합계를 구해야함 합계 누적변수 밖에서 지정.
			sum += x;		
		
			a++; 
		}
		
		System.out.println("입력받은 수의 합계 : " + sum );
		
		
	}
}
