package Day07.override;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println( s.info()); //오버라이딩 메소드
		
		Teacher t= new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "수학";
		System.out.println( t.info() );//오버라이딩 메소드
		
		Employee e = new Employee();
		e.age = 50;
		e.name = "장영실";
		e.department = "회계";
		System.out.println( e.info() ); //오버라이딩 메소드
		
		
		
		
	}

}
