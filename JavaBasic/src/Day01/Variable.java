package Day01;

public class Variable {

	public static void main(String[] args) {
		
		/*
		 * 변수의 선언방법
		 * <데이터 타입> 이름;
		 * 
		 * int는 Integer의 약자로 정수를 저장하는 타입
		 */
		
		int num; //선언
		num = 10; //초기화
		
		System.out.println(num);
		
		//선언과 초기화를 동시에
		int num2 = 20;
		System.out.println(num2);
		
		//같은 이름으로 변수를 생성할 수 없음(고유함)
//		int num2 = 30;
		
		//초기화 하듯이 언제든지 값을 바꿀 수 있다
		num2 = 40;
		System.out.println(num2); //40
		num2 = 50;
		System.out.println(num2); //50
		
		//변수에는 다른 변수의 값, 또는 연산한 결과도 저장할 수 있다
		int result = num + num2;
		result = num;
		System.out.println(num + num2);
		
		//문자열을 저장
//		int s = "홍길동";
//		int는 정수만 저장 가능해서 이렇게 쓰면 안 되고
		
		//문자열을 저장 - String에 저장합니다
		String s = "홍길동"; //String 이라는 타입에 저장해 줄 수 있다.
		
		
		//?
		int result2 = num +20;
		result2 = 100;
		result2 = 10 + result2;
		
		//result2 ??? 110 :)
		
		
		
		
		
	}
}
