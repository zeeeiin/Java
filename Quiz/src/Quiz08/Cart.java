package Quiz08;

public class Cart {
	
	//멤버변수에도 배열선언이 가능하다
	String[] cart = new String[1]; //현재 카트 크기는 1
	int money; //금액
	int i = 0; //cart의 순서
		
	//3가지 상품
	int tv;
	int com;
	int radio;
	
	//카트의 기능
	void buy(String product) { //물품을 사는 기능
		System.out.println("재정의 하세요"); //자식에서 재정의 해야함..?!
	}

	void add(String product) { //물품 추가
		System.out.println("재정의 하세요");
	}
	
	void info() { //출력 메서드
		System.out.println("재정의 하세요");
	}
	
	
	
}
