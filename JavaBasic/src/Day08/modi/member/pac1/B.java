package Day08.modi.member.pac1;

public class B {

	//사용
	A a = new A(); //public o
	A a2 = new A(1); //default o
		
//	A a3 = new A("홍길동"); //private 	
//	프라이빗은 외부에서 사용 안 됨. 
		
	public B() { //A의 기능을 확인해보고 싶다면
			
		a.var1 = 1;
		a.var2 = 2;
		//a.var3 = 3;
		
		a.method1();
		a.method2();
		//a.method3();
			
	}
		
}
