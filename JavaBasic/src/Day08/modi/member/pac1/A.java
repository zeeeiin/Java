package Day08.modi.member.pac1;

public class A {

	//사용
	A a = new A(); //public o
	A a2 = new A(1); //default o
	A a3 = new A("홍길동"); //private o 접근이 잘 되고 있는 것
	
		
	//생성자
	public A(){ //기본 생성자
		this.var1 = 1;
		this.var2 = 2;
		this.var3 = 3;
		
		method1();
		method2();
		method3();
		
	} 
	
	
	A(int i){}
	private A(String s){}
	
	
	//멤버변수와 메서드
	public int var1; //접근제어자 public 붙인 상태
	int var2;
	private int var3;
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
	
	
	
}	
