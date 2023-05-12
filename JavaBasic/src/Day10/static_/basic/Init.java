package Day10.static_.basic;

public class Init {
	
	public static int price; //여기와 아래 둘 다 static을 붙여야한다
	
	//int price;
	//int price = 1000; 이렇게 둘 다 가능하다
	
	//price 변수를 사용할 때 따로 들어가지 않고 메인에서 바로 호출 가능
	
	static {
		System.out.println("단 한 번 실행됨");
		price = 1000; //여기서 값 지정
	}

}
