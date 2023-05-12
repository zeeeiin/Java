package Day10.abstract_.good;

public abstract class Store {

	/*
	 * 1. 자식에서 메서드에 abstract를 붙이면 추상메서드가 된다.
	 *    (오버라이딩을 강제화 하고 싶을 때 쓴다) 
	 *    
	 * 2. 추상메서드는 몸체가 없는 메서드 선언이다.
	 * 3. 추상메서드를 쓰고 싶다면, 추상클래스가 되어야한다.
	 * 4. 추상클래스도 메서드, 생성자, 변수 전부 다 가질 수 있다.
	 */
	
	public abstract void apple();	
	public abstract void grape();
	public abstract void orange();
	public abstract void melon();
	
	private String name = "네네치킨"; //일반 변수
	
	public Store() { //일반생성자
		System.out.println("추상클래스 생성자 호출");
	}
	
	public void newMenu() {  //일반 메서드도 가질 수 있다.
		System.out.println("본점만 가지고 있는 신메뉴");
	} //여기까진 오버라이딩 강제 없음
	
	//name의 getter
	public String getName() { //상속이 내려감.
		return name;
	}
	
	
	
}
