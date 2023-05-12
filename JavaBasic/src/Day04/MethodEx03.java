package Day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return 이란
		 * 1. 메서드에서 리턴은 실행 결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 된다.
		 * 3. 반환값은 없을 수도 있다. 없는 경우엔 void로 선언한다.
		 * 무조건 반환이 있어야하는 건 아니다.
		 * 
		 * 4. void메서드도 return을 사용할 수 있다.
		 * - 값을 돌려주지는 못하고(반환X), 종료의 의미로 사용!
		 * 
		 */
		//() 소괄호 있는건 전부 다 메서드
		
//		add(1, 2;)//사실 원래 이 값을 굳이 변수에 쓸 필요가 없다면 바로 출력문에 넣으면 됨
//		>>이렇게 >> System.out.println(add(1, 2)); 이 결과값은 3
		
//		add(값 , 값);//메서드안에 메서드 호출구문을 넣을 수 있다
		int result = add( add(1, 2) , add(3, 5));
		System.out.println("결과:" + result);
		
		//System.out.println( sub() ); >> 에러
		//실행하고 끝이라 출력이 안 됨.
		//void형 메서드는 return이 없기 때문에 단순 호출(실행)만 가능
		sub();
		div(6, 2);
		
		noReturn("bye");
		noReturn("hello");
		
	} //main
	
	static int add (int a, int b) { //반환하는 메서드
		return a + b;
	}
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() {
		System.out.println("5 - 3 = 2");
	}
	
	
	//반환이 없고, 매개변수가 있는 모형
	static void div(int a, int b) { //안에서 변수 쓰고 버리는 것.
		System.out.println(a + "/" + b + "=" + (a/b));		
	}
	
	
	//
	static void noReturn(String s) { //매개변수로 문자열 하나 받음
		
		if(s.equals("hello")) { //문자열 비교는 == 로 하면 안된다. 절대로..
			System.out.println("메서드를 종료함다!");
			return;
		}		
		System.out.println("hello를 전달해야 할 걸요?");
	}
	
}
