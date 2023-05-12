package Day01;

public class DataType {

	public static void main(String[] args) {
		
		//정수형 타입
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647; //21억까지 저장이 된다. 21억 이상이면 문자열로 표현해야함
		int c1 = -2147483648;
		
		long d = 123123123123123123L; //int로 판별이 돼서 이렇게 빨간줄이..! L을 붙여줘야함
		
		//2진수, 8진수, 16진수로 저장된다
		int bin = 010; // 8진수는 앞에 0을 붙인다. 이건 8진수 10을 저장한 것. 이건 8임
		System.out.println("8진수 010은:" + bin+ "입니당!");
		
		int bin2 = 0b111; //2진수는 앞에 01b를 붙임
		System.out.println("2진수 111은:" + bin2);
		
		int hexa = 0xA9;
		System.out.println("16진수 A9는:" + hexa);
		
		System.out.println("----------------------------");
		
		//실수형타입
		float f1 = 3.14F; //F 이거 플롯이야!
		double d1 = 3.14;
		
		System.out.println(f1);
		System.out.println(d1);
		
		
		float f2 = 3.14159214783F; //7자리까지 유효함
		double d2 = 3.14159214783; //15자리까지 유효함
		
		System.out.println(f2);
		System.out.println(d2); 
		
		System.out.println("----------------------------");
		
		//true, false만 저장가능함
		boolean boo11 = true;
		boolean boo12 = false;
		
		System.out.println(boo11);
		System.out.println(boo12);
	
		
		
		
	}
}
