package Day09.poly.basic2;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
//		this.age = 1;  이것도 가능하지만 굳이? 싶은 것.
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 과목:" + subject;
	}
}
