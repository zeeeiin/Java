package Day11.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		
		try {
			System.out.println(i / j);//에러가 발생할거같은 코드를 try 안에 넣어주기.
			
			//catch뒤에는 예외를 처리할 수 있는 예외의 클래스가 선언된다
			//Exception 은 모든 예외를 전부 처리할 수 있다.
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}				
		
		System.out.println("프로그램 정상종료");
		
		
		
		
	}
	
	
	
	
}
