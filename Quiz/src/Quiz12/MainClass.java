package Quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
		//메인에는 각각의 객체들이 필요하다
		Radio r = new Radio(); //300, sony
		Computer c = new Computer();
		Tv t = new Tv();
		
		//카트도 있어야하기에 만들어주기.
		MyCart cart = new MyCart(2000);
	
		cart.buy(t);
		cart.buy(c);
		cart.buy(r);

		
		cart.info();
		
//		r.setPrice();
//		System.out.println(r.getName());
//		System.out.println(r.getPrice());
		
		
				
	}

}
