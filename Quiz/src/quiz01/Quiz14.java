package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		/*
		 * 1. 가로, 세로길이를 입력받는다.
		 * 2. 가로, 세로길이만큼 사각형을 출력한다.
		 * 	  5,4를 받으면 가로 5, 세로 4
		 * 3. 단, 윤곽만 나오면 된다.
		 * 
		 * 힌트 : 1행, 마지막행, 1열, 마지막열만 출력하면 된다.
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가로>");
		int w = scan.nextInt();
		
		System.out.print("세로>");
		int h = scan.nextInt();
		
		
		//중앙만 공백으로 나오게..
		
		//행을 나타낼거니까 세로만큼 돌아야함(반복)		
		for(int i = 1; i <= h; i++) { //행
			
			for(int j = 1; j <= w; j++) { //열	
				
				if( i == 1 || i == h) { //첫 행과 마지막 행일때 (각각 가로, 세로 길이 값, i와 j 값)
						//i= 1~h까지인것					
					System.out.print("*");			//첫번째 행에서 가로로 출력 - 반복
													//전부 다 여기서 출력이 일어남
				} else { //첫행과 마지막 행이 아닌 경우			
					
					if(j ==1 || j == w) { //첫 열과 마지막 열
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
					
				}
				
				}
			//반복 후 줄바꿈
			System.out.println();
			}		
		}
	
	}
	

