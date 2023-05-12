package Day10.abstract_.bad;

public class Store { //부모클래스
	
	//추상메서드가 없다면?
	//자식 클래스에서 반드시 오버라이딩을 했어야 했는데,
	//깜빡하고 하지 않은 경우 잘못된 메서드 실행이 될 수 있다.
	
	public void melon() { //melon이 override가 필요한 메서드라면
		System.out.println("각 지점에서 가격을 책정하세요");
	}

	public void orange() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	
	public void grape() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
		
	public void  apple() {
		System.out.println("각 지점에서 가격을 책정하세요");
	}
	
	
}
