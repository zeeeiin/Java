package Day01;

public class DataType2 {

	public static void main(String[] args) {
		
		//단일문자를 저장하는 char = 2byte
		char c1 = 'A'; //한글자만 나타내서 홑따옴표로
		char c2 = 65;
		
		//아스키코드 - 미국에서 문자들에 숫자값을 붙임 (1byte)
		//유니코드 - 전세계 문자에 숫자값을 붙임. 표준 문자 체계 (2byte-부호없는 비트체계)
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032; //유니코드 10진수
		char c5 = '\uAC00'; //유니코드
		System.out.println(c3 + "-" + c4 + "-" + c5); //이것도 문자열 붙은것
		
		
		//문자열을 저장할 수 있는 String
		String s1 = "가가가가가 "; //공백도 문자열이다. 공백도 아스키코드 있음.
		String s2 = "나나나나나";
		
		//문자를 붙일때 + 를 사용하면 된다.
		System.out.println(s1 + s2); 
		
		//문자와 다른값에 + 연산을 하면?
		System.out.println(100 + 100); //200
		System.out.println("100" + 100); //100100
		//문자열에 다른값이 붙으면 문자열이 된다.
		
		System.out.println(100 + 100 + "100"); //숫자와 문자 다 붙어도 순서대로 더하면 된다.
		
	
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //75  char + int = int (문자열은 예외)
		
	}
}
