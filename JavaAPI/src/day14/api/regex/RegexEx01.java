package day14.api.regex;

public class RegexEx01 {

	public static void main(String[] args) {
		
		String info = "홍길동 | 30세 | 서울시 강남구 | 010-1234-5678";
		
		//전화번호 형식을 찾아 ***-****-**** 마킹 해주세요.
		
		//info.replaceAll(정규표현식, 치환 될 문자)
		
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";
		
		//특정 API에서 regex가 있다면, 정규표현식을 적용할 수 있다.
		String result = info.replaceAll( pattern, "***-****-****"); //원본문자를 바꾸는건 아님		
		System.out.println(result);
		
		
	}
	
}
