package Day10.final_.basic;

public class Person {
	
	//final 변수는 반드시 초기화를 한다.
	//1. 생성자를 통한 초기화
	//2. 직접 초기화
	public final String nation = "대한민국"; //빨간줄 => 초기화해줘야한다
	public final String ssn;  //"123123123"; 이렇게되면 모든 사람의 주민번호가 같으니까 ssn은 생성자를 활용할 것이다
	public final String name;
	
	
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}
	
	
	
}
