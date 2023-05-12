package Day06.inherit.bad;

public class Employee {
	//상속이 없는 경우
	
	String name;
	int age;
	String department;
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
