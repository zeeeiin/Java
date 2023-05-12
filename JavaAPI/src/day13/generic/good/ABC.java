package day13.generic.good;

public class ABC<T> { //클래스에 전달된 매개변수 타입 T
	
	//클래스 or 인터페이스의 매개변수 <>
	//매개변수로 쓰고 싶은 문자열을 넣으면 된다.
	//T는 아직 미정, 객체를 생성할 당시에 결정한다.

	private T t; //뭔진 모르겠지만 일단 타입으로 쓰겠다
	
	//T에 대한 get/set
	public void setT(T t) { //매개변수는 T타입
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
	
	
}
