package Day07.this_;

public class Employee extends Person {
	//상속이 없는 경우
		
	String department;
	
	//생성자 만들어주기
	Employee(String name, int age, String department){
		this.name = name;
		this.age = age; //상속받고 있기 때문에 이렇게 만들기!
		this.department = department;
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
