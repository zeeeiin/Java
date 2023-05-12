package Day08.super_2;

public class MainClass {
	
	public static void main(String[] args) {
		
		//실행될 수 있는 객체 3개를 만들 것.
		
		Student s = new Student("홍길동", 20, "123123");
		
		System.out.println( s.info());
		System.out.println( s.equals(s)); //object 상속받은 기능
		
	}

}
