package Day04;

public class MethodEx07 {

	public static void main(String[] args) {
		
		//메서드의 연쇄호출 (동기적 방식)
		//메서드 안에서 메서드를 호출할 수 있는가?(선언이 아닌 호출)
		//메서드안에서는 메서드를 호출이 가능하다.(생성X 호출-사용이 가능하다)
		
//		test01();
		
		//메서드의 재귀
		recursive(1);
		
		System.out.println(fac(5));
		
	}
	
	static void test01() { 
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	
	
	static void test02() {
		System.out.println("2번 메서드 실행");

		System.out.println("2번 메서드 종료");
	}
	
	
	static void recursive(int a) {
		//함수의 재귀는 반드시 탈출의 조건이 있어야 한다.
		if(a == 10) {
			return; //함수의 종료
		}
		System.out.println(a + "호출");
		
		a++; //한 번 호출될때마다 a를 증가 시킨다 a전달값
		
		recursive(a); //나 자신을 호출		
	}
	
	
	static int fac(int a) { //a가 5라면...
			
		if(a ==1) {
			return 1;
		}
		return a * fac(a-1);
	}
	
	
	
}
