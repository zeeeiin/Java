package Day10.abstract_.good;

public class MainClass {
	
	public static void main(String[] args) {
		//오버라이딩이 들어간 상태		
		
		/*  < 오버라이딩을 더 안전하게 해준다 >
		 * 1. 추상메서드를 사용하면 오버라이딩이 강제화 되어서
		 * 	  프로그래머의 오버라이딩 실수를 줄일 수 있다.
		 * 2. 객체의 추상화 == 다형성의 사용
		 * 	  => 추상클래스는 객체로 생성이 안 되기 때문에 
 				 생성해서 부모타입으로 구체화하여 사용한다.
		 * 	  대신 부모타입은 추상클래스.
		 */
		
		
		//Store s1 = new Store(); (x)
		
		SeoulStore s1 = new SeoulStore(); // >>맨앞을 부모타입인 Store로 바꿔도 정상실행됨
		//자식으로 만들어서 추상클래스 타입으로 만들어도 그대로 똑같이 실행됨
		//Store s1 = new SeoulStore(); 대신 오버라이딩 된 애들이 우선 실행된다
		s1.apple();
		s1.grape();
		s1.orange();
		s1.melon();
		s1.newMenu();
		System.out.println(s1.getName());
		
		System.out.println("=====================");
		
		
//		BusanStore s2 = new BusanStore();
		Store s2 = new BusanStore();
		
		s2.apple();
		s2.grape();
		s2.melon();
		s2.orange();
		s2.newMenu();
		System.out.println(s2.getName());
	
	}

}
