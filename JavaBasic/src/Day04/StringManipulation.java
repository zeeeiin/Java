package Day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열 다루기
		//문자열은 사실 배열이다.
		//문자열은 인덱스(번호)가 있다.
		
		String str = "안녕하세요~ 영어로하면 하이!";
		//System.out.println(str[0]); 안 됨
		
		//문자열을 다루는 다양한 메서드를 제공
		
		//문자열을 한글자 자르기 charAt
		char c = str.charAt(5);
		System.out.println(c);
		
		//문자열의 위치확인 indexOf - 없다면 -1을 반환시켜준다.
		int idx = str.indexOf("오");
		System.out.println("문자의 위치:" + idx); //가장 처음 발견된 위치를 찾아준다.
				
		//lastIndexOf
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은위치:" + idx2);
		
		//문자열 변환 toUpperCase, toLowerCase > 대문자, 소문자
		String s = "abcDEF";
		
		String result = s.toUpperCase();
		System.out.println(result); //대문자로
		
		String result2 = s.toLowerCase();
		System.out.println(result2); //소문자로
		System.out.println(s); //원본 문자열은그대로 유지❤
		
		System.out.println("===========================");
		
		//문자열 변경 replace
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); //a -> x로 변경. 전부 다 변경하는 것
		System.out.println(s);//원본 문자열은그대로 유지❤
				
		String result4 = s.replaceFirst("a", "x");
		System.out.println(result4); // a-> x로 변경, 첫번째만 바뀜
		
		System.out.println("===========================");
		//공백제거 trim
		str = "  010-1111-2222  ";
		String result5 = str.trim(); //공백을 제거해서 반환. 매개변수는 없고 반환이 되는 형태.
		System.out.println(result5);
		
		str = " 안녕 하세요? 오늘은 4월 19일 입니다  ";
		str = str.replace(" ", ""); //공백을 전부 제거해서 원본문자열에 저장		
		System.out.println(str);
		
		System.out.println("===========================");
		//문자열 자르기(중요함)
		//substring(특정 위치에서 자르기) - index 기준으로 자름
		str = "010-1111-2222";	
		String result6 = str.substring(9); //8번째 인덱스를 자르겠다-> 잘라서 새로운 문자열로 반환시킨다.
		System.out.println(result6);	   //인덱스 번째 미만 절삭
		
		//str은 변함 없음
		String result7 = str.substring(4, 8); // 4<= x < 8 인덱스 추출
		System.out.println(result7); //설정한 인덱스까지 절삭하고 반환.
		
		System.out.println(str); //원본은 변함없음.
		
		//split - 특정 문자를 기준으로 자름(제대로 사용하려면 정규표현을 알아야함)
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2));
		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println( Arrays.toString(arr3));
		
		System.out.println("===========================");
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열길이:" + len);
		
		//문자열의 비교 equals() **매우 중요** 
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕")) { //문자열이 포함되어있으면 true, or false.
			System.out.println("녕이 포함되어 있음");
		}
	
		
		
		
	}
}
