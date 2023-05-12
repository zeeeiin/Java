package Day07.this_;

public class Person {

	String name;
	int age;
	
	//name, age를 받아 초기화해주는걸 만들기
	
	Person(String name, int age){ //웬만하면 멤버변수랑 맞추기
		this.name = name;
		this.age = age;
//		System.out.println( this ); //주소값: 나 자신을 나타냄
		
	}
	
	Person(String name){
//		this.name = name;
//		this.age = 1;
//		System.out.println( this ); 
		this(name, 1);
	}
	
	Person(){
//		this.name = "이름없음";
//		this.age = 1;
//		System.out.println( this ); 
		this("이름없음");
	}
	
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
