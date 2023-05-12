package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 3개를 입력받습니다.
		 * 
		 * 가장 큰 값, 중간 값, 작은 값을 구분해서 출력.
		 * (조건 - 같은 수는 없다) 
		 * 
		 * 입력
		 * 15, 30, 7 -> max:30, mid:15, min:7 
		 * 
		 * 힌트
		 * a가 가장 클 때의 조건(a>b && a>c)
		 * 
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int a = scan.nextInt();
		
		System.out.print(">");
		int b = scan.nextInt();
		
		System.out.print(">");
		int c = scan.nextInt();
		
		
			if(a>b && a>c) {
				System.out.println("max:" + a);
						
			} else if(a<b && b>c) {
						System.out.println("max:" + b );
					} else { // (c>a && c>b)
						System.out.println("max:" + c );
					}
			
				if(a<b && a>c) {
				System.out.println("mid:" + a);
				
				} else if (a<b && b<c) {
						System.out.println("mid:" + b );
					} else  { //(c>a && c<b)
						System.out.println("mid:" + c );
					}
				 
				if(a<b && c>a) {
				System.out.println("min:" + a);
					} else if(b<a && b<c) {
						System.out.println("min:" + b );			
					} else  { //if(c<a && c<b)
						System.out.println("min:" + c );
					} 
					
					System.out.println();
			}	
				
		}	
	
	
