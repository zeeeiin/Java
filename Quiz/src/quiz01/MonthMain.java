package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class MonthMain {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 2023년도의 월과 일을 입력했는때 요일을 출력하는 메소드를 만드세요.
		 *		(Date클래스는 사용하지 않습니다.)
		 */
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 입력 >");
		int month = scan.nextInt();
		System.out.println("일 입력 >");
		int day = scan.nextInt();
		
		System.out.println("요일:"  );
				
		System.out.println("=============================");
		
		/*
		 * 2. 공백이 있는 문자열 2개를 입력 받고 
		 * 오름차순으로 정렬된 배열을 출력하는 메소드를 만드세요.
		 * 
		 */
		
		System.out.println("문자열 입력 >");
		String str1 = scan.next();	

	
		System.out.println("문자열 입력 >");
		String str2 = scan.nextLine();
			
		
	}
	}

