package Day10.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
	
//	Arrays arr = new Arrays();
//	String result = Arrays.toString(new int[3]);
//	sysou( result )
//	>> 배열의 모형이 나옴
// [ 요소 + 요소 + ...] 문자열붙여서 반환해주는 형태
//	MyArrays arr = new MyArrays(1,2,3);
	
	//비어있으면 랜덤한 유니코드값이 들어감
	
		char[] arr = {'a'};
		System.out.println(arr);
		
		System.out.println( MyArrays.printArray( new String[3]) );
		System.out.println( MyArrays.printArray( new char[3]) );
		System.out.println( MyArrays.printArray( new int[3]) );
		
		
	
		//클래스가 여러번 로드되더라도 static은 단 1번만 실행됨
		System.out.println( Init.price );
		System.out.println( Init.price );
		System.out.println( Init.price );
		System.out.println( Init.price );
		System.out.println( Init.price );
	
	}
}
