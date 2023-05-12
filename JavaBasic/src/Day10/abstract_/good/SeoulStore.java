package Day10.abstract_.good;

public class SeoulStore extends Store {
	//문법적으로 문제가 되는 이유와 해결법
	
	//1 추상 클래스로 만들기
//	public SeoulStore() {
//		super(); //이게 생략된 것
//	}
	
//	메서드 오버라이딩 하고싶으면 ctrl + space
		
	@Override
	public void apple() {
		System.out.println("서울지점 사과 500원");
	}@Override
	public void grape() {
		System.out.println("서울지점 포도 600원");
	}@Override
	public void melon() {
		System.out.println("서울지점 멜론 700원");
		
	}@Override
	public void orange() {
		System.out.println("서울지점 오렌지 800원");
		
	}	
	

}
