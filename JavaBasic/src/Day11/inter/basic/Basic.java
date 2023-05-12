package Day11.inter.basic;

public class Basic implements Inter1, Inter2 { //이렇게 상속받기(구현한다). 콤마찍고 나열하기
	//인터페이스를 상속받을 때는 implements 키워드를 쓴다.
	//인터페이스에 있는 추상메서드는 반드시 오버라이딩 되어야 한다.
	//인터페이스는 다중 상속이 된다.
	//원래는 Basic 도 extends Object인 상태
	
	@Override
	public void method01() {
		System.out.println("재정의된 1번 메서드 사용");		
	}

	@Override
	public void method02() {
		System.out.println("재정의된 2번 메서드 사용");
	} 
	
	public void method03() {
		System.out.println("나의 3번 메서드 사용");
	}
	

}
