package Day11.inter.basic;

public interface Inter1 {

	//public static final.자동 상수취급이 들어가기때문에 a에 빨간줄이 생김
	int A = 10; //바로 값을 초기화해줘야한다.
	
	//메서드를 선언하면 자동으로 추상메서드가 된다.
	void method01();
		
	
	//인터페이스에는 static, default 메서드 선언이 가능하다
	public static void method3() {
		System.out.println("스테틱 메서드");
	}
	
	public default void method4() { //일반메서드를 디폴트로 선언할 수 있다
		System.out.println("디폴트 메서드");
	}
	
	
}
