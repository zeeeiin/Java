package Day07.override;

public class Employee extends Person {
	//상속이 없는 경우
		
	String department;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
