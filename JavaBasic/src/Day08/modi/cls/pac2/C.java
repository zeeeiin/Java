package Day08.modi.cls.pac2;

import Day08.modi.cls.pac1.*; //이렇게 가져와도 사용이 안 됨

public class C {

	//A a = new A(); //패키지가 다르니까 사용이 안 됨
	//default 는 같은 패키지에서만 사용(접근)이 된다
	B b = new B(); //public 클래스

}
