package day12.api.lang.wrapper;

public class AutoBoxingEx {
	
	public static void main(String[] args) {
		//Autoboxing : 기본타입 - 클래스형간의 자동형변환
//		int a = 100;
//		Integer val1 = a;
//		인티저형이 있다면 바로 정수를 저장할 수 있다.
		
		Integer val1 = 100;
		int b = val1;
		
		Double val2 = 3.14;
		double c = val2;
		
		
		//래퍼클래스의 특별한 기능들
		//형변환
		//문자열 => 기본형으로 변환
		
		int result1 = Integer.parseInt("10"); //바꾸고싶은 문자열값 넣기
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
			
		System.out.println( result1 + result2 + result3 );
		
		
		//숫자간 대소비교 / 문자열에선 compareTo 였음
		//매개값으로 정수를 받는 compare 인티저만의 기능
//		Integer.compare(3, 5); 
		System.out.println(Integer.compare(3, 5));//앞의 값이 뒤의 값보다 작으면 음수
		System.out.println(Integer.compare(5, 3));//앞의 값이 뒤의 값보다 크면 양수
		
		
		
		
	}

}
