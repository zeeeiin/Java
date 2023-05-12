package Day08.modi.protec.pac1;

public class B {
	//접근이 가능한지 보려는 것
	
	A a = new A(); //현재 사용 가능한 생성자
	//같은 패키지라서 가능한 것
	
	
	//생성자 생성
	public B() {
		a.bool = true;
		a.method();
	}
}
