package day12.api.lang.object;

import java.io.PrintStream;

public class MainClass {


	public static void main(String[] args) {

		Person p = new Person("홍길동");
		Person p2 = new Person("홍길동");



		//equals - 결과가 바뀌게도 사용이 가능
		//객체의 name변수가 같다면 true변환하도록 오버라이딩.(성공!)
		boolean result = p.equals(p2);		
		System.out.println( result );


		//toString - 주소값을 문자열로 반환(출력해주는 기능)
		//toString메서드는 멤버변수 값을 출력하도록 오버라이딩 많이 사용된다.
		System.out.println(p.toString());


		//Person clonePeople = (Person)p.clone();
		//person으로 캐스팅 해줘도 빨간줄이 생김 => try로 감싸주기

		try {

			//새로운 Person객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();			

			System.out.println(clonePeople.getName());//복사된개체

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		
		//객체의 주소를 해시알고리즘을 통해 변경한 값을 반환
		int x = p.hashCode();
		System.out.println(x); //객체주소값을 중복되지 않는 숫자값으로 반환해줌

		//이렇게 쓰일 수 있단 걸 알아두기
		//PrintStream ps = System.out; //상수 사용을 하면 PrintStream 타입으로 반환.
		//ps.println("출력"); //ps에 .찍어보면 print 출력기능 메서드가 많음
		
		
		
	}
}
