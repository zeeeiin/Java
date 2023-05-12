package day12.api.lang.wrapper;

public class BoxingEx {

	public static void main(String[] args) {
		
		int a = 100;
		double b = 3.14;
		char c = 'A';
		boolean d = false;
		
		//boxing : 기본타입을 => 클래스형으로 변환
		Integer v1 = new Integer(a);
		Double v2 = new Double(b);
		Character v3 = new Character(c);
		Boolean v4 = new Boolean(d);
		//v1~4 타입으로 타입이 바뀜!
		
		System.out.println(v1);
		
		Object[] arr = {v1, v2, v3, v4}; //객체가 되어야 들어갈 수 있다.
		
		
		//unboxing : 클래스형  => 기본형으로 변환
		
		int result1 = v1.intValue();
		double result2 = v2.doubleValue();
		char result3 = v3.charValue();
		boolean reult4 = v4.booleanValue();
		
		
		
	
		
	}
}
