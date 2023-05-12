package Day07.override;
			//student 를 Person으로 확장하겠다
public class Student extends Person { //extends + 상속받고싶은 클래스이름 쓰기

	String studentId;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}
	
}
