package day13.generic.good;

import day13.generic.bad.Person;

public class MainClass {
	
	public static void main(String[] args) {
		
		//ABC abc = new ABC();
		
		//여기서 타입 지정하기
		ABC<String> abc = new ABC<String>();
		//String을 사용하고 표기하는 abc클래스
		
		
		abc.setT("홍길동");
		String name = abc.getT();
		
		//import로 Person 넣어주기
		ABC<Person> abc2 = new ABC<>(); //생성자 꺽쇠는 생략 가능
		//person으로 지정해서 갖고 올 때도 person으로 가져오기
		
		abc2.setT( new Person());
		Person p = abc2.getT();
		
		
		ABC<Object> abc3 = new ABC<>(); //무엇이든지 담을 수 있는 모형
		
		//generic에서 안 되는 것 하나
		//제네릭타입은 원시타입 X
		//원시타입이 들어갈 수 없다
		//ABC<int> abc4 = new ABC<>();
		//정수타입을 쓰고 싶다면 int 가 아닌, Integer를 사용해야 한다.
		// generic => 다양한 타입 저장 - 다양한 타입 변환 / 형 안정성
		
		//////////////////////////////////////////////////////
		
		DEF<Integer, String> def = new DEF<>();
		
		
		
		
		
		
		
		
		
	}

}
