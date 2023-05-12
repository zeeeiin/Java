package Day01;

public class Operator01 {

	public static void main(String[] args) {
		
		//부호연산자 +, -
		int i = -3;
		int j = -i; // j=3
		
		//증감연산자 ++, --
		int k = 1;
		int h = ++k; //나 자신을 바로 즉시 증가시킴 /전위연산 - 먼저 값을 증가시키고, 마지막에 대입한다
		
		
		System.out.println(h); //증가시킨다음 h에 대입하면 2
		
		System.out.println("k는:" + k);
		System.out.println("h는:" + h);
		
		
		int x = 1;
		int y = x++; //후위연산 - 대입을 먼저하고, 나 자신을 증가시킴
		//먼저 1을 y에 대입하고 증가해서 2
		
		System.out.println("x는:" + x);
		System.out.println("y는:" + y);
		
		//일반적인 표현
		x = 1;
		x++;
		++x;
		//보통 뒤에 많이 붙인다.
		
		System.out.println(x);
		
		
		x = 1;
		System.out.println(++x);
		System.out.println(x++);
		//x는 3
		
		//~ 연산자 값을 바꿔주는 반전 연산자
		byte b = 10; //0000 1010
		System.out.println(~b); //1111 0101 반대로 값을 바꿔주었기 때문 - 맨 앞자리 1은 음수
		System.out.println(~b + 1); //값을 반대로 바꾸고(-10) 10의 보수인 -10이 나온다

		System.out.println("-------------------");
		
		
		//! 논리연산자 - 부정의 의미 반대인 조건을 찾을 때 쓴다.
		boolean bool = !true;
		System.out.println(bool);
		System.out.println(!bool);
		
		
		
		
	}
	
}
