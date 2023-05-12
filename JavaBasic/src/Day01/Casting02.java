package Day01;

public class Casting02 {

	public static void main(String[] args) {
		
		//크기가 큰 타입을 작은 타입에 넣을 때는
		//(type) 캐스팅을 사용해서 명시적으로 변환해준다.
		int i = 70;
		char c = (char)i; //캐스팅이라고 부름
		short s = (short)i;
		
		System.out.println(c); //F
		System.out.println(s); //70
		
		
		float f = 3.14F;
		int k = (int)f;
		System.out.println(k);
		
		//주의할 점 - 타입변환시 값을 받을 수 없는 범위가 들어오면 잘려나간 값(쓰레기 trash)
		int a = 1000;
		byte b = (byte)a; // 바이트 크기로 자른다
		System.out.println(b); //-24
		
		//1000,
		
		//특이케이스 - 문자와 숫자간에도 명시적 형변환이 들어간다.
		char cc = 'A';
		short ss = (short)cc; //둘다 2바이트지만 타입이 달라서 명시적으로 넣어줘야한다.
		System.out.println(ss);
		
		
		
		
		
	}
}
