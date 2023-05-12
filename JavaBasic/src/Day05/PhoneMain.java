package Day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone(); //Phone객체 생성
//		new Phone(); //이렇게도 쓸 수는 있음		
		black.info();		
		
		Phone pink = new Phone("아이폰14");
		//생성자 매개변수를 통해 객체를 만든 것 
		pink.info();
		
		Phone red = new Phone("iPhone", "빨강");
		red.info();
		
		
		Phone white = new Phone("ZFlip", 500000);
		white.info();
	
		//model, color, price를 
		//매개변수로 받아서 초기화하는 생성자를 만들어봅시다.
		//여기가 아닌 Phone 클래스에서 만들어야함
		//객체생성도 하시오.
		
		Phone Blue = new Phone("iPhone", "Blue", 700000);
		Blue.info();
		
		
	}
}
