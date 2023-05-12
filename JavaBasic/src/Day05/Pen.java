package Day05;

//설계도(틀)로 사용 할 클래스는 메인이 없다.
public class Pen {

	//클래스 속성(값)을 나타낼 때 멤버변수(field)를 사용한다.
	int price;
	String ink;
	String company;
	
	//클래스 안에 기능을 나타낼 때, 메서드라고 부른다.
	void write() { //매개변수와 반환없음
		System.out.println(ink + "색상 글씨를 씁니다");		
	}
	
	void info() {
		System.out.println("=========펜의 정보========");
		System.out.println("가격:" + price);
		System.out.println("색상:" + ink);
		System.out.println("제조사:" + company);
	}
	
	
}

