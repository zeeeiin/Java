package Day02;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //while문 안에 쓰면 이 스캐너 코드도 반복된다. 이런 선언문은 위에다 써야한다.
		
		while(true) {
			
			System.out.println("4 x 3 = ? > ");
			
			System.out.print("정답 > ");
			int answer = scan.nextInt(); //입력을 반복문 안에 써주기.
			
			if(answer == 12) { //정답
				System.out.println("정답!");;
				break;
				
			} else {
				System.out.println("오답인데요?");
			}
			
		}
		
		
	}
}
