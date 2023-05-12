package Day01;

public class Casting01 {

	public static void main(String[] args) {
		
	
	//작은 타입을 큰 타입에 넣을 때는 자동형변환이 일어난다.
	byte a = 10; //정수형 변수 byte 선언..ㄷㄷ
	
	short s = a; //자동으로 형변환이 일어난것 byte -> short로 자동형변환
	int i = a; //byte -> int 자동형변환
	long l = a; //byte -> long 자동형변환
	System.out.println(l);
	
	//문자와 숫자간에도 유효함
	char c = '가'; 
	int j = c; //char -> int 정수형으로 형변환
	System.out.println(j);
	
	int k = 1000;
	double d = k; //int -> double 형변환
	System.out.println(d);
	
	}
}