package Quiz13;

public abstract class Shape {

	//상수 생성
	public static final double PI = 3.14;
	private String name;
	//생성자
	public Shape(String name) {
		this.name = name;
	}
	
	//오버라이딩이 필요함. 추상메서드 선언
	public abstract double getArea(); //넓이 측정
	
	
	//name 에 대한 getter 만들기
	public String getName() {
		return "도형이름:" + name;
	}
}

