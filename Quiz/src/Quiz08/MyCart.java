package Quiz08;

public class MyCart extends Cart {
	
	//1. 생성자 만들기. 생성자는 money를 전달받고 money값 초기화
	// 	 tv = 300, com = 400, radio = 500;으로 초기화하기
	
	MyCart(int money) {
		this.money = money; // 멤버변수 money = 지역변수 money
		this.tv = 300; //전부 왼쪽은 상속받은 값
		this.com = 400;
		this.radio = 500;
	}
	
	//2. buy(), add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * 
	 * buy(상품명) 기능
	 * 매개변수가 tv, com, radio라면  
	 * 금액에서 해당상품가격을 차감하고, add()메서드를 실행한다.
	 * 단, 올바르지 않은 상품이거나, 금액이 부족할 경우에 적절한 처리를 해주세요.
	 * 
	 */
	
	void buy(String product) { //매개로 전달받은게 3가지 상품이 아니라면 잘못된 상품
		//swtich 나 if 구문으로!
		
//		if( this.money < 300) { //남은 금액이 300원보다 적다면
//			System.out.println("충전금액이 부족합니다.");
//			return; //함수종료
//		} >>다른 경우가 안될수도 있어서 보류			
		
//		if(product.equals("tv") || product.equals("com") || product.equals("radio")) {
//			
//			switch (product) {
//			
//		} else { //올바른 상품이 아닌 경우
//			System.out.println("올바른 상품이 아닙니다");			
//			return; //함수 종료
//		}
		
		switch (product) {
		
		case "tv" :
			
			if(this.money < 300) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료. 리턴 꼭 넣어줘야하는 케이스
			} else {
				this.money -= 300;
			}			
			break;
			
		case "com" :
			if(this.money < 400) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 400;
			}
			break;
			
		case "radio" :
			if(this.money < 500) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= 500;
			} 
			break;
			
		default : //3개가 다 아닌 경우
			System.out.println("올바른 상품이 아닙니다.");
			return;		
		}
		
		add(product); //물품을 담는 함수로 전달
	}
	
	
	
	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아준다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트 배열로 옮겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출한다.
	 */
	
	
	//i가 length와 같아지는 순간 = 꽉 차는 순간!
	void add(String product) { //물품 추가
		
		if(i >= cart.length) { //기존 배열이 꽉 찬경우.
			
			//2배인 배열 생성하기
			String[] newCart = new String[cart.length * 2];
			
			//기본 배열의 값을 복사
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i];
			}
			//기존배열을 변경
			cart = newCart;
			newCart = null; //삭제	
		}		
		cart[i] = product; //배열 위에서 옮긴 후 이 값이 들어가는 것.
		i++;		
	}
	
	/*
	 * info()는
	 * 카트배열에 담긴 물건 목록만 (null 제외) 출력해주세요.
	 * arrays.toString 안 됨! 왜냐면 빈 공간은 null로 나오기 때문.
	 * 
	 */
	
	void info() {
		//break문도 가능
		
		String str = "["; //대괄호 문자열 붙이기
		for(int j = 0; j < i; j++) { //반복 조건 -> i까지. i는
//			System.out.print(cart[j] + " ");
			str += cart[j] + " "; //j번째 문자열을 공백과 함께 붙인다.
		}
		str +="]";
		System.out.print(str);
	}
		
	

	
	
		
	


	

}
