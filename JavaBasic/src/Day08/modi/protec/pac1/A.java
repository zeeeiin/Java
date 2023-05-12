package Day08.modi.protec.pac1;

public class A {

	/*
	 * protected는 기본적으로 같은 패키지에서만 접근이 가능하다.
	 * 단, 패키지가 다르더라도 상속관계에서 super키워드 참조가 가능하다. (디폴트와 다른점)
	 * 패키지가 다르더라도 상속은 가능하다
	 * 
	 */
	
	//멤버변수
	protected boolean bool; //멤버변수 boolean타입 변수
	
	//생성자
	protected A() { //생성자
	//같은 패키지까지만 사용 가능
		
	}
	//메서드
	protected void method() {}
	
	
	
}
