package Quiz22;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 가격 형식을 전부 찾아서 순서대로 출력해보시오. 
		 * 패턴은 1개면 됩니다.
		 */
				
		String str = "안녕하세요? 점심은 4,500원 인데요. 커피가 무려 1600원 이에요. 디저트는 무려 14000원이나 한답니다.";
		
		String pattern = "[0-9,]+원"; //숫자는 1개 이상, 콤마는 0개 이상. [0-9,]+  \\d+,*\\d+ 두가지 다 됨.
		
		Matcher m = Pattern.compile(pattern).matcher(str);
			
		while(m.find()) { //if로 하면 가격이 하나만 나와서 반복을 따로 돌려줘야함
			
			System.out.println(m.group());
		}
		
		
		
	}
}
