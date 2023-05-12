package Day11.trycatch;

public class RunTimeEx {

	public static void main(String[] args) {
		
		//실행 에러들
//		int[] arr = {1,2,3,4,5};		
//		System.out.println( arr[5] );//프로그램이 중단됨		
		
		//castException
//		String s = (String)new Object();
		
		
		//문자열 -> 숫자로 변경
		//NumberFormatException
		String str = "10a"; //문자열이라 숫자로 변경 불가능. 10이면 오히려 에
		int num = Integer.parseInt(str); //문자형을 받아 정수형으로 반환해줌
		
		//NullPointerException
//		String str = null; //어떤 객체의 값. 비어있는 상태인 null. 이 null변수에 점을 찍으면 에러발생한다
		str.charAt(0);
				
		System.out.println(111111111);
		
	}
	
	
}
