package Day01;

public class Casting03 {

	public static void main(String[] args) {
		
		
		char c = 'C'; // 67
		int i = 2;
		
		//1. 서로 다른 타입의 연산에서
		//큰 타입에 맞추어서 자동 형변환된다.
		char cc = (char) (c + i); // c+i=int 라서 좌항에 넣을 수 없는 것. char이 int보다 작기때문
		//큰 타입에 맞춘다  = 늘린다 => int 형이 나온다
		System.out.println(cc);
		int ii = c + i; 
		System.out.println(ii);
		 
		//2. int형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		
		short s1 = 100;
		byte b = 10;
		short s2 = (short)(s1 + b); //결과는 int
		System.out.println(s2);
		
		//char + char = int
		
		
		
		
		
		
	}
}
