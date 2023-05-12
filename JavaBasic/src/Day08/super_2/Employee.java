package Day08.super_2;

public class Employee extends Person {
	//상속이 없는 경우
		
	String department;
	
	//생성자 만들어주기
	Employee(String name, int age, String department){
		super(name, age);
		this.department = department;
	}
	
	
	String info() {
		return super.info() + ", 부서:" + department;
	}
	
}
