package Quiz12;

public class MyCart {

	//1. 모든 변수와 메서드에 접근제한자를 선언하세요.
	private int money; //잔고
	private Product[] cart = new Product[1]; //상품을 저장할 배열
	private int i = 0; //cart의 순서
	
	//2. MyCart의 생성자는 money만 받아서 초기화
	
	//public인지 빼야하는지 헷갈림
	public MyCart(int money) {
		this.money = money;
	}

	/*
	 * 3. buy(상품들의 부모타입) : void
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료
	 * 가진돈이 충분하면 물건의 가격을 money에 빼고  add(상품) 메서드를 호출
     */ 	
	
	public void buy(Product product) {
	
		if(this.money < product.getPrice()) {
			System.out.println("금액부족");
			return;
		} 
		this.money -= product.getPrice(); //물건 가격을 차감
		add(product); //상품 객체를 매개변수로 넘김
	}
		
	
	/*
	 * 4. add(상품들의 부모타입) : void
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옴겨주세요.
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	
	private void add(Product product) { //밖에서 호출 불가. 나만 쓸 수 있게 private으로 접근제어자 설정
		
		
		if(i >= cart.length) {//끝을 판단하는 방법=카트길이와 같을 때
			
			Product[] newArr = new Product[cart.length *2]; //새로운 Product 배열 생성
			
			for(int j = 0; j < cart.length; j++) {
				newArr[j] = cart[j]; //새로운 카트에 옮겨담는다
			}
			
			cart = newArr; //변경
			newArr = null; //초기화		
		}
				
		cart[i] = product; //객체를 담을 수 있는 배열
		i++;
		
		info();
	}
	
	
	
	/*
	 * 5.info()
	 * 장바구니 안에 담긴 물건의 목록(name)을 출력한다.
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력
	 
	 * 메인에서 buy메서드 실행해서 확인합니다.
	 * 
	 */

	public void info() { //외부에서도 사용해야하니까 public, 단순출력기능
		
		String str = ""; //목록을 붙여서(합계) 만들어야하니 문자열 생성
		int sum = 0; //가격 합계 sum
		
		for(int j = 0; j < i; j++) {
			
			//상품을 꺼내서 이름, 가격더하고 반복하는 형태.
			Product p = cart[j]; //프로덕트 타입에
						
			//지금은 캐스팅 필요가 없으니 그냥 쓰면 됨
			str += cart[j].getName() + " "; //누적해줄 것을 쓰기
			sum += cart[j].getPrice();		
		}
		System.out.println("목록[" + str + "]");
		System.out.println("총합[" + sum + "]");
	}
}
