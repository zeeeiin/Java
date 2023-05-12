package Day11.inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method01(); //override
		b.method02(); //override
		b.method03(); //나의 메서드
		
		System.out.println("==========================");
		
		//인터페이스도 데이터타입이 될 수 있다.
		//Basic은 인터페이스를 상속받고 있는 중이기 때문에 이렇게 Inter에 저장 가능!
		
		Inter1 i1= new Basic();
		i1.method01();
		//Inter에 저장했기때문에 Inter기능밖에 사용 못 한다.
		
		System.out.println("==========================");
		
		//Inter2 처럼만 사용된다
		Inter2 i2 = new Basic();
		i2.method02();
		
		//객체를 생성해서 인터페이스 타입에 담게 되는데, 이 때 인터페이스 기능을 사용하게 된다
		
		
		System.out.println("==========================");
		
		//위의 예시처럼 Inter에 저장하면 자동으로 형변환이 된다
		//인터페이스에서도 클래스 캐스팅을 사용할 수 있다.
		Basic bb = (Basic)i2; //다시 원래대로 돌아가고 싶으면 이렇게!!
		bb.method01(); //다시 나의 Basic기능들 사용 가능하게 된다.
		bb.method02();
		bb.method03();
		
		
		//static 메서드의 사용 => 클래스명.메서드명
		Inter1.method3();
		
		//default 메서드의 사용 - default 메서드는 상속이 내려옴. 
		//인터페이스에 미리 만들어진 몸체를 가지고 있는 메서드
		bb.method4();
		
		
		
		
		
		
		
	}

}
