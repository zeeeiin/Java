package day14.api.ramda.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//car의 run을 사용할 때마다 매번 다른 기능으로 사용해야한다면 => 익명 클래스를 사용할 수 있다.
//		Car car = new Car() {
//			
//			@Override
//			public void run() {
//				System.out.println("익명객체로 생성된 car");
//			}
//		};
//		
//		car.run();
//		
//		Car car2 = new Car() {
//			
//			@Override
//			public void run() {
//				System.out.println("다른 내용의 익명객체로 생성된 car 생성");
//			}
//		};
//		
//		car2.run();
		
		
		//익명객체 표현 문법 => 람다 표현형식으로 사용이 가능
		Person p = new Person();
		p.greeting( new Say01() { //()안에 say01를 구현하는 익명 객체를 바로 만들어서 넣을 있다.
			
			@Override
			public void hello() {
				System.out.println("hello 기능!");
			}
		}); //실행은 person 이 가지고 있는 greeting이 대신 실행해준 것.
		
		//Say01이 가지고 있는 hello()를 전달하는 모형
		p.greeting( () -> { System.out.println("ramda hello!"); }); //()안에 함수명(hello) 생략 가능. 바로 소괄호 등장.
		
		
		//1문법 - 사용할 문장이 1줄이라면 {} 생략 가능
		p.greeting( () -> System.out.println("람다 헬로우!") );
		
	
//		p.greeting( new Say02() { //함수적 인터페이스 모형으로 만든 것.
//			
//			@Override
//			public String hello(String a, int b) {  //result가 hello로 들어와서 리턴으로.
//				//프로그래머가 작성한 내용
//				return a + b; //문자열로 반환. 리턴의 결과는 result로 들어간 것
//			}
//		}); //이건 아직 람다식이 아닌 것..;
		
		
		//2문법 - 람다의 매개변수는 타입이 생략될 수 있다. (String a, int b)
		//3문법 - 프로그램 코드가 한 줄이라면 return도 생략 가능하다.
//		p.greeting( (a, b) -> { //hello 함수내용이 여기(괄호 안)로 들어오는 것.
//			return a+b;
//		});		
		p.greeting( (a, b) -> a+b ); //return이 자동으로 Person의 say02 result로 돌아간다.
		
		
		//greeting의 3번째 메서드에 전달되는 값이 짝수인지 홀수인지 판별하는 람다식을 써보시오.
		p.greeting( (a) -> a % 2 == 0 ? true : false );		
		
//		p.greeting( (a) -> {
//			
//			boolean result = false;
//			if(a % 2 == 0) {
//				result = true;
//			} else {
//				result = false;
//			}
//			return result;
//			});
			
	}
}
