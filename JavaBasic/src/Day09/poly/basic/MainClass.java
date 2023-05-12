package Day09.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.method01(); //상속받은 것
		c.method02(); //오버라이드 된
		c.method03(); //내거
		
		System.out.println("===========다형성 적용(형변환)=============");
		
		//Parent처럼 사용된다. 단, 자식의 오버라이드 된 메서드가 실행된다.
		Parent p = c; //자식이 부모에게 저장됐을 때
		p.method01(); //현재타입만 생각해보면... 1,2번만 사용 가능
		p.method02(); //자식의 오버라이드 된 메서드가 실행됨.
		//p.method03();
	
		System.out.println(p); //parent 타입
		System.out.println(c); //child 타입
		System.out.println(p == c); //child로 생성된 자식은 원래의 객체를 유지함
		//일시적인 parent타입의 형변환인것.
		
		System.out.println("==========클래스 강제 형변환============");
		//원본이 child로 생성되었다면, 강제 형변환이 가능함
		
		Parent pp = new Child(); //한 줄로 써본것 child로 생성해서 부모님 타입에 저장했다
		System.out.println(pp); //child 원본. 출력해보면 chlid로 만들어졌단걸 확인할 수 있다
		
		Child cc = (Child)pp; //강제 형변환. child타입으로 다시 저장한 형태
		cc.method01();
		cc.method02();
		cc.method03(); //다시 나의 기능을 넣을 수 있는 것
		
		//주의할 점 => 다형성이 적용되었던 객체만 강제 형변환이 가능함.
		Object obj = new Object();		
//		Child ccc = (Child)obj; //runtime Exception Error 발생함
		//문법적으론 틀리지 않았지만 실행해보니 잘못된 게 드러남
		
		
		System.out.println("==========다형성의 또 다른 예시============");
		
		String str = "홍길동";
		Object o = str; //문자열을 부모 오브젝트에 담았다		
//		System.out.println(o); //현재 Object 타입		
		String result = (String) o; //ok
		
		
		
		
		
	}

}
