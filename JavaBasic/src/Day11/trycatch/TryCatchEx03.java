package Day11.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		//next 문자열, nextInt 정수, nextDouble 실수, nextLine 한 줄을 받아주는 형태
		
		System.out.print("정수>");
		int num = scan.nextInt(); //12엔터 - 엔터 앞까지만 값을 받음 		
		
		scan.nextLine(); //엔터를 소비
		
		System.out.print("문자열>");
		String info = scan.nextLine(); //xxx엔터 - 엔터를 포함해서 받음
		
		System.out.println(num);
		System.out.println(info);
		
		*/
		
		
		while(true) {
			
			
			try {
			System.out.println(">"); //문자엔터값...의 반복 에러가 생긴 것
			int num = scan.nextInt(); //문자 엔터값을 정상적으로 처리를 못해서..
			//문자로 들어오는 값을 정수로 치환하는 것. 
			//입력이 들어오면 개행문자 앞까지만 결과를 받는거라 결과는 잘 나온다.
			
			System.out.println(num);
			
			//그런데 만약 정수가 아닌 문자를 입력하면 문자를 정수로 변환하는 과정에서 에러가 발생한다
			
			} catch(Exception e ) {
				System.out.println("숫자로 입력하실래요?");
				//이렇게하면 무한 루프가 돌아버리는 현상이 발생한다.
				
				scan.nextLine();//해결방법이 바로 이 것!
				//처리가 안 된 문자 + 엔터값을 대신 처리해준다.
				
			}
		}
		
		
		
		
		
		
		
		
	}

}
