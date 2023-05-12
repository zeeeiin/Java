package Day07.this_;

public class MainClass {
	
	public static void main(String[] args) {
		
		//실행될 수 있는 객체 3개를 만들 것.
		
		Person p1 = new Person("홍길동", 20);
		
		Person p2 = new Person("이순신");
		
		Person p3 = new Person();
		
		
		System.out.println(p1.info());
		System.out.println(p2.info());
		System.out.println(p3.info());
		
	}

}
