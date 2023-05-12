package Day09.poly.basic;

/*
 * 하나의 자바파일에는 여러 클래스 선언이 된다.
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당 클래스만 public이면 된다.
 */

class A {}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class Basic {
	//멤버변수 5개를 각자 변수 (타입)에 저장
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b;
	A a2 = c;
	A a3 = d;
	A a4 = e;
	//줄여서쓰면
	A a5 = new B(); //B -> A로 변환
	
	//기본타입변수
	int x = 1;
	double y = x; //x는 더블타입에 저장될 수 있다 (o), int -> double 로 변환
	
	
	//Object 타입엔 모든 클래스가 저장 할 수 있다. -> 그만큼 단점도 있으니 적절히 선언해서 사용해야한다.
	Object o1 = a; //객체니까 자식
	Object o2 = "문자열";
	Object o3 = 1; 
	Object o4 = new B();
		
}
