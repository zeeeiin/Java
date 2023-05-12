package Quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {

	public static void main(String[] args) {
		
		String str = "123123-1231231 GS25(치킨마요) 4,400원";
		String str2 = "123123-1231232 GS25(주부18단) 5,000원";
		
		String Pattern1 = "\\d{6}-\\d{7}"; //123~~  
		String Pattern2 = "[A-Za-z]+25"; //GS25; 라고 써도 됨
		String Pattern3 = "\\(+[가-힣0-9]+\\)"; //메뉴 
		//소괄호가 하위식을 나타냄. 어떤 이유로 잘 안나올 수도 있는데 이런 경우
		String Pattern4 = "[0-9,]+원"; //가격 // \\d+, \\d+원
		
		List<String> list = Arrays.asList(str, str2);
		
		//향상된 for문으로 돌리기		
		for(String s : list ) { //패턴 4개가 하나의 문자열 s에 대해 생겨야 한다.
			
			//패턴 컴파일 시키고 매처타입으로.
			Matcher m1 = Pattern.compile(Pattern1).matcher(s);
			Matcher m2 = Pattern.compile(Pattern2).matcher(s);
			Matcher m3 = Pattern.compile(Pattern3).matcher(s);
			Matcher m4 = Pattern.compile(Pattern4).matcher(s);
			
			//여기서 조건 지정. if구문을 4번 써도 되긴 함. 만약 쓸거라면.. || 조건은 조심해야함
			if( m1.find() && m2.find() && m3.find() && m4.find() ) { //4가지 조건을 다 찾은 경우에만 실행될 것.
				System.out.println(m1.group());
				System.out.println(m2.group());
				System.out.println(m3.group());
				System.out.println(m4.group());
			}
			
			System.out.println("----------------------------");
			
		}
	}
}
