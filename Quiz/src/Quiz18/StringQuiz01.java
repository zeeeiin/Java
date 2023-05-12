package Quiz18;

import java.util.Scanner;

public class StringQuiz01 {

	public static void main(String[] args) {

		/*
		 * 스캐너를 사용해 id를 입력받는다.
		 * 아이디는 공백을 포함해서 받을 수 있다. nextLine()
		 * 
		 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력받는다.
		 * 		5글자 이상이라면 "id가 등록되었습니다" 출력 후 종료
		 */


		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("id를 입력하세요 > ");
			String id = scan.nextLine(); //id에 공백도 들어갈 수 있다.
			
//			id.replace(" ", ""); //이렇게 쓴다고해서 원본 id는 바뀌는 게 아니란걸 기억하기.
			
			id = id.replace(" ", ""); //원본 문자의 공백을 제거해서 저장하겠다.
			
			if(id.length() >= 5) {
				System.out.println(id + "가 등록되었습니다.");
				break;
			} else {
				System.out.println("id는 5글자 이상입니다");
			}			
		}
	}
}
