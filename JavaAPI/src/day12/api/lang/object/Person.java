package day12.api.lang.object;

public class Person extends Object implements Cloneable {//복사를 할 수 있다는 의미
	
	//모든 클래스는 Object를 상속받는다.
	
	private String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	//getter setter 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	//메서드 오버라이드 가능! alt shift s
	@Override
	public boolean equals(Object obj) {
		
		//객체의 멤버변수 name값이 간다면 true 반환함
		
		if(obj instanceof Person) {
			Person p = (Person)obj; //캐스팅을 person으로 해서
			
			if(p.getName() != null) {
				if(p.getName().equals(this.name)) { 
					return true;
				}
			}
			
			
		}
		
		return false;		
		
		//return super.equals(obj); //무조건 부모의 메소드를 호출하게 불러내는 오버라이드..
	}

	
	/*
	@Override //멤버변수가 여러개라면 그걸 전부 다 찍어준다
	public String toString() {
		return "Person [name=" + name + "]";
	}
	*/
	
	@Override
	public String toString() { //멤버변수를 문자열로 더해서 출력해준다
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
	@Override
	protected void finalize() throws Throwable {
//		super.finalize();
		
		//객체가 사라지는 시점에서 자동으로 실행
		System.out.println(this.name + "님이 소멸되었습니다");
	} //자바에선 사라지는 시점을 감지할 수 있는 방법이 없음
	  
	

	/*
	 * 객체 복사 메서드 
	 * clone()을 오버라이드 하면, 외부에서 사용이 가능해진다.
	 * 클래스는 Cloneable 인터페이스를 상속받아야한다. 
	 */
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}




	
	
	
	
	

}
