package Day08.modi.member.pac2;

import Day08.modi.member.pac1.A;

public class C {

	//사용
	A a = new A(); //public o
	//퍼블릭만 다른 패키지에서 사용 가능
		
//	A a2 = new A(1); //default o
	//A a3 = new A("홍길동"); //private o 접근이 잘 되고 있는 것
	//나머지 두 개는 사용이 안 됨
		
		
	public C() {
		a.var1 = 1;
		//a.var2 = 2; //default x
		//a.var3 = 3; //private x
		
		a.method1();
		//a.method2(); //default x
		//a.method3(); //private x
			
		//패키지가 다르면 디폴트도 사용이 안 된다	
		
	}
		
}
