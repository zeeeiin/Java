package day13.generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 그 값을 사용할 때, 알맞은 타입으로 반드시 혀변환을 해야 한다.
		 * 
		 * 잘못 형변환하면, 예외가 발생한다.
		 * 
		 */
		
		
		//ABC 객체 생성
		ABC abc = new ABC();
		abc.setObj("문자"); //문자, 숫자 다 저장 가능
//		abc.setObj(123);
		
//		Object name = abc.getObj(); //남이 저장한 거라면 무슨 타입인지.. 알 수가 없다		
//		Object name = (Integer)abc.getObj(); //정수인가해서 캐스팅해보니 에러남
		
		
		//String으로 캐스팅하면 사용 가능
		String name = (String)abc.getObj();
		System.out.println(name);
		
		ABC abc2 = new ABC();
		abc2.setObj( new Person() );		
		Person p = (Person)abc2.getObj();
		
	}

}
