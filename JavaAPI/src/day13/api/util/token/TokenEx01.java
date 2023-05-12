package day13.api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {

		//빠른 문자열 분리
		//split() 특정 기준으로 분리
		//toCharArray() 한글자씩 분리


		//token - 다양하게 한 번에 잘라서 사용이 가능함. 구분자로 나눌 것

		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";

		StringTokenizer token1 = new StringTokenizer(str1);


		//토큰의 개수 확인
		int cnt = token1.countTokens();
		System.out.println("나눠진 문자열 개수:" + cnt);

		//다음 토큰의 여부확인
		System.out.println(token1.hasMoreTokens());

		while(token1.hasMoreTokens() != false) { //false가 아니라면(true라면) 반복문 실행하겠다
			
			//다음 토큰의 확인
			System.out.println(token1.nextToken());//반환이 문자
		}


		System.out.println("=================================");
		
		//다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		// / 기준으로 자르겠다
		StringTokenizer token2 = new StringTokenizer(str2, "-/.");

		while(token2.hasMoreTokens() != false) {
			System.out.println(token2.nextToken());
		}
		
		
		System.out.println("----------------------------------");
		
		//구분자를 토큰에 포함시킴
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);

		for(int i = 1; token3.hasMoreTokens(); i++) { //위의 while문과 같음
			
			System.out.println(token3.nextToken()); 
			//구분자도 토큰에 포함시켜 잘라주는 모형. / 도 토큰으로 남아있는 것
		}
		
	}
}
