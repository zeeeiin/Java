package Day09.poly.basic2;

public class House {
	
//	private Student[] student = new Student[100]; //변수
////	private String str = "홍길동";
//	private Employee[] employee = new Employee[100];
//	private Teacher[] teacher = new Teacher[100];
//	private int index1;
//	private int index2;
//	private int index3;
//	
//	public void inhouse(Student s) { //student를 받겠다, s를 배열에 저장하겠다
//		student[index1] = s;
//		index1++;
//	}
//	
//	public void inhouse(Teacher t) { //student를 받겠다, s를 배열에 저장하겠다
//		teacher[index2] = t;
//		index2++;
//	}
//	
//	public void inhouse(Employee e) { //student를 받겠다, s를 배열에 저장하겠다
//		employee[index2] = e;
//		index3++;
//	}
//	
	
	//
	private Person[] person = new Person[100];
	private int index;
	public void inHouse(Person p) { //매개변수에 person(부모타입)만 선언해도 전달이 된다
		person[index] = p;
		index++;
	}
	
	//h.inHouse의 정보값들을 전달받을 것
	public void whoAreYou(Person p) {
		
		if(p instanceof Student) {//student ->true
			System.out.println("너는 학생이야!");
			
			//student 타입이니까 student 타입으로 캐스팅이 가능하다
			Student s = (Student)p;
			
		} else if(p instanceof Teacher) {
			System.out.println("너는 선생이야!");
		} else if(p instanceof Employee) {
			System.out.println("너는 직원이야!");
		} else {
			System.out.println("너는 그냥 사람이야!");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	//추가 >> 배열 안에 들어있는 객체의 타입에 맞추어 출력.
//	public void printHouse() {
//		//반복문 돌려서 주소값 먼저 찍어볼 것
//		for(int i = 0; i < index; i++) { //인덱스까지만 돌아야 null값을 피할 수 있다
//			System.out.println(person[i].info());
//			
//			//생각하는 대상이 person의 i번째
//			if(person[i] instanceof Student) { //person[i]이 변수
//			
//			}
//		}	
//	}
	
	
	
	
	
	
	
	
}
