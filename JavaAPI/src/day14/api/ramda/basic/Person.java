package day14.api.ramda.basic;

public class Person {
	
	//일반클래스 - 고차함수를 가지고 있는 클래스
						//Say01을 매개변수로 받는다. greeting은 대신 실행하는 것.
	public void greeting(Say01 say01) { //()안에 함수적 인터페이스를 넣을 것.
		say01.hello(); //대신 실행(이미 만들어져 있음)
	}
	

	public void greeting(Say02 say02) {
				
		String result = say02.hello("greeting이 전달한 문자열", 1); //아직 hello메서드에 대한 내용은 정해지지않았음. 람다식으로 내가 정해야함.
		System.out.println("greeting return:" + result );
	}
	
	
	public void greeting(Say03 say03) {
	
		boolean result = say03.bye(3); //3이라는 값을 여기다 넣은 것.
		System.out.println(result);
	}
	
	
	
}
