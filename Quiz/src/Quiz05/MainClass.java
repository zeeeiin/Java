package Quiz05;

public class MainClass {

	public static void main(String[] args) {
		/* 요구사항
		 * Calculator를 부모클래스로 선언하세요.
		 * Calculator를 상속받는 Computer클래스 생성 합니다.
		 * 
		 * Calculator의 멤버변수 result, pi를 선언하세요
		 * Calculator의 메서드
		 * add(int) : void - result에 값을 누적시키는 기능
		 * sub(int) : void - result에 값을 차감시키는 기능
		 * circle(int) : int - pi를 이용해서 원의 넓이를 구하는 기능
		 * ------------------------------------------------------------------
		 * Computer 클래스의 메서드
		 * circle()메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
		 * rect(double) : double - 정사각형의 넓이 를 리턴
		 * rect(double, double) : double - 직사각형의 넓이 를 리턴
		 * rect(double, double, double) : double - 직육면체의 넓이 를 리턴
		 * 
		 * 
		 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
		 */
		

		Calculator cal = new Calculator();
//		cal.circle(3); //이 값은 반환이 있을거라서 그냥 출력문으로 바로 넣기
		System.out.println( cal.circle(3) );
		
		
		Computer com = new Computer();
		System.out.println( com.circle(3) );
		
		System.out.println( com.rect(2.0));
		System.out.println( com.rect(2, 3));
		System.out.println( com.rect(1, 2, 3));
		
		
	}
}
