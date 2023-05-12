package Day07.this_;
			//student 를 Person으로 확장하겠다
public class Student extends Person { //extends + 상속받고싶은 클래스이름 쓰기

	String studentId;
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;				
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
}
