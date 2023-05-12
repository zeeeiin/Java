package StudyQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Day {


	/*
	 * 1. 2023년도의 월과 일을 입력했는때 요일을 출력하는 메소드를 만드세요.
	 *		(Date클래스는 사용하지 않습니다.)
	 */

	//필드선언
	int cen;
	int year;
	int month;
	int day;


	//기본 생성자
	Day(){}

	String[] s = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

	Scanner scan = new Scanner(System.in);

	//입력과 요일계산
	public void dayday() {

		System.out.println("월 입력 >");
		int month = scan.nextInt();
		System.out.println("일 입력 >");
		int day = scan.nextInt();

		//1,2월의 경우 지난 년도로 곱해줘야 함
		if( month < 3) {

			cen = (20*21)/4; //연도 코드
			year = (22*5)/4; 
			day = day-1;

		} else {
			cen = (20*21)/4; 
			year = (23*5)/4; 			
			day = day-1;
		}

		switch (month) {
		case 1:
			month = 36;
			break;
		case 2:
			month = 39;
			break;
		case 3:
			month = 10;
			break;
		case 4:
			month = 13;
			break;
		case 5:
			month = 15;
			break;
		case 6:
			month = 18;
			break;
		case 7:
			month = 20;
			break;
		case 8:
			month = 23;
			break;
		case 9:
			month = 26;
			break;
		case 10:
			month = 28;
			break;
		case 11:
			month = 31;
			break;
		case 12:
			month = 33;
			break;
		default:
			break;
		}

		int result = (cen + year + month + day) % 7;

		System.out.println("요일 : " + s[result]);
	}



	/*
	 * 2. 공백이 있는 문자열 2개를 입력 받고 
	 * 오름차순으로 정렬된 배열을 출력하는 메소드를 만드세요.
	 * 
	 */


	public void str() {
		System.out.println("문자열 입력 >");
		String str1 = scan.nextLine();	

		System.out.println("문자열 입력 >");
		String str2 = scan.nextLine();

		String str3 = str1 + str2;			
		String[] arr = str3.split(" ");		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}
}
