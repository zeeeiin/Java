package Day01;

import java.util.Scanner;

public class DTR {
	
	 public static void main(String[] args) {
		
		 //변수, 데이터타입, 형변환..
		double x = 3.14;
//		int y = x; //더블을 정수형에 넣고싶을 때 작은타입으로 깎아야 함
		//Casting
//		int y = (int)x;
		
		
//		System.out.println(Math.random()); //0~1미만까지의 랜덤값
//		Math.random(); * 100 //0부터 100미만까지
		int ran = (int)(Math.random() *100) +1; //1<a<101 까지의 수를 구할 수 있다.
		
//		입력 받을 때		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
//		연산자		
//		전위연산 ++a; a가 먼저 1 증가되고 변수에 저장		
//		후위연산 a++; 마지막에 실행됨. 먼저 a
		
//		&&  양쪽 항 기준 둘다 트루여야 true 
//		|| 둘 중 하나만 true 여도 true
		
//		대입 연산자
		a += 1;		
		
//		3항 연산식 if else 구문을 짧게 쓰는 형식
//		조건식 ? 연산식 1(조건식이 참이면 실행) : 연산식 2(거짓이면 실행)
		
//		제어문
//		if 뒤에 else if 를 또 달아서 추가로 조건 검사 가능
//		조건에 부합되면 거기만 실행
//		if 조건이 거짓이면 else if 의 조건을 검사하고 실행을 결정
//		여러 조건 중 하나만 실행되니 조건을 잘 만들어야 한다
//		조건을 다 만족하지 않으면...
//		else 문
		
		
		
		
		
		
		
		
		
		
		 
	}

}
