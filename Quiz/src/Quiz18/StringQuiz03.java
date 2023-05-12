package Quiz18;

public class StringQuiz03 {

	public static void main(String[] args) {

		//회문비교 -> "다시 합창 합시다"
		/*
    1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
    2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
    3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
    4. 문장은 공백을 포함하여 받을 수 있습니다.
    5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
       조건
       빌더의 reverse() 는 금지 입니다.
       reverse() 함수 한 줄로 쓰지 말라고..? ..뜯어서 직접 비교하라는 것

    6. 힌트)
		 * 공백은 없어져야 비교가 됩니다. 
		 * 회문은 첫글자와, 마지막글자 가 똑같습니다.
		 * 
		 */

		System.out.println( palindrome("다시 합창합시다"));
		System.out.println( palindrome("다 같은 것은 같다"));
		System.out.println( palindrome("아 좋다 좋아"));
		System.out.println( palindrome("다시다"));
		System.out.println( palindrome("이건 아니지"));
	}	

	public static String palindrome(String word) {

		word = word.replace(" ","");
		StringBuilder sb = new StringBuilder(word); //builder 에게 전해진 단어

		return sb.reverse().toString().equals(word) ? "회문" : "회문이 아님"; 

		//sb.reverse().toString(); //문자열로 바꿔준 것 => 점 찍고 문자열 기능 사용 가능
		//반환이 stringbuilder 타입. 변수에 저장을 안해도 바로 연달아 점을 찍어 기능 사용하다.
		//word.replace(" ","") 여기에 점 찍어서 연달아 또 기능이 사용가능하다.연쇄적으로 기능 사용 가능
		//반환을 보고 써야함. 위의 예시는 반환이 String임.

	}
	
	/*
	public static String palindrome(String word) {

		word = word.replace(" ",""); //공백제거

		for(int i = 0; i < word.length() / 2; i++) {

			char a = word.charAt(i); //앞에서 출발하는 커서. 시작문자

			char b = word.charAt(word.length() -i - 1); //끝문자.뒤에서 출발하는 커서. 시작값 i가 0이라서. (배열인덱스)

			if(a != b) {
				return "회문이 아닙니다";
			}
		} return "회문입니다";
	 */

}
