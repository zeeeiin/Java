package Day02;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//반복문과 조건문
		//짝수의 합을 구하는 반복문
		//입력받은수 + 증가할 수가 따로 있어야함
		
		//1~100까지 수 중에서 짝수의 합 => 100까지 반복 도중에 짝수일때만 누적
		/*
		int a = 1;
		int sum = 0; //누적할 변수는 밖에 만들어야한다.
		while(a<=100) {
			if(a % 2 == 0) {
				sum+= a;//조건문 안에서 a를 누적할 식을 써준다.
			}				
			a++; //1-100까지 돌어가는 반복문
		}		
		System.out.println("1~100까지 짝수의 합:" + sum);
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력>");
		int num = scan.nextInt();
		//입력받는 숫자만큼만 반복을 돌리겠다.
		
		int sum = 0; //누적할 변수(sum) 만들어줘야함
		int i = 1;
		while(i<=num) { //num까지 회전
								//num을 나누는게 아니라 i를 나눠야한다.
			if(i % 2 == 0) { //확인해볼 값 i가 짝수인지 확인해보고 싶은거니까 i를 2로 나눠봐야한다.
				sum += i;	//돌고돌아 짝수가 오면, 이 때 i의 값을 sum에 누적			
			}			
			
			i++;
		}
	
		System.out.println("1부터 " + num + "까지의 짝수의 합 : " + sum);
		
		
		
	}
}
