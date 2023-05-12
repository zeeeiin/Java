package Day10.static_.singleton;

public class Singleton { //밖에 만들었는데
	//팩토리메서드, 인터페이스패턴, 추상팩토리패턴, 빌더패턴, 퍼사드 패턴 등...	
	
	//싱글톤 - 객체가 1개만 생성되도록 클래스를 설계하는 패턴
	
	//1. 나 자신의 객체를 1개 생성
	private static Singleton instance = new Singleton(); //싱글톤이라는 타입의 멤버변수, 바로 초기화해준 상태
	//외부에서 접근 불가능하게 private 붙여주기
	//인스턴스에 직접(바로) 접근 불가능
	//여기 또 만든 형태라 계속 반복되다보니 에러가 나는 것->static 붙여주면 됨
	
	//2. 객체를 직접생성할 수 없도록 생성자를 private 선언한다.
	private Singleton() {
		
	}
	
	//3. 외부에서 객체생성을 요구할 때, getter를 통해서 instance 반환시킴
	//getter 메서드 만들고
	//싱글톤으로 반환해야 해서 타입도 싱글톤
	public static Singleton getInstance() { //밖에서 부를 수 있게 static 붙여주기->클래스명으로 인스턴스 부를 수 있음
		return instance;//이 상태론 밖에서 getInstance를 부를 수 없음.
	}

	
	//////////////////////////////////////////////////////////
	
	private String domain = "www.aaa.com";
	
	public String getDomain() {
		return domain;
	}
	
	
	
	

}
