package Day08.modi.protec.pac2;

import Day08.modi.protec.pac1.A;

public class D extends A { //상속이 된 것!

	//protected는 상속관계에서 super를 통한 접근이 가능하다.
	public D() {		
		super();//상속이라 super가 생략된것
		
		super.bool = true;
		super.method();
		//super로 부모가 가진 것들을 사용할 수있다
	}
	
	//override 됨
	protected void method() { //protected라서 A클래스에 있는 걸 override 된 것
		
	}
	
}
