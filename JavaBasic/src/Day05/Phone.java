package Day05;

public class Phone {

	String model;
	String color;
	int price;
	
	//생성자를 프로그래머가 직접 생성하게 되면, JVM이 기본생성자를 자동생성하지 않는다.
	//생성자는 반환유형이 없다. 변수아래에 생성. 클래스랑 이름만 똑같다.
	//멤버변수를 초기화하는 용도로 보통 사용한다
	Phone() { //생성자랑 메서드 구별해야함.
		System.out.println("생성자 호출!");
		model = "갤럭시";
		color = "검정색";
		price = 100000;
	}
	
//	Phone(){  이렇게 똑같이 만들 순 없다		
//	}
	
	//생성자는 여러개 선언할 수 있다.
	//단, 매개변수의 종류 or 개수가 달라야한다.
	Phone(String a) { //위의 Phone과 아예 이렇게 다르면 사용가능
		model = a; //외부에서 받은 string a를 model 에 지정
		color = "핑크색";
		price = 200000;
	}
	
	Phone(String a, String b){ //모델과 색상 받을 것
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int b) { //모델, 가격
		model = a;
		color = "하얀색";
		price = b;
		//매개변수가 2개지만 타입이 다른 경우.
	}
	
	Phone(String a, String b, int c){
		model = a;
		color = b;
		price = c;	
		
	}
	
	
	
	void info() { //메서드. 출력만 해주는 메서드 생성
		System.out.println("====폰의 정보====");
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);		
	}
	

	
	
}
