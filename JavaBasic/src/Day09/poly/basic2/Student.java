package Day09.poly.basic2;
			//student 를 Person으로 확장하겠다
public class Student extends Person { //extends + 상속받고싶은 클래스이름 쓰기

	String studentId;
	
	Student(String name, int age, String studentId){
		super(name, age);	
		this.studentId = studentId;				
	}
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
	
}
