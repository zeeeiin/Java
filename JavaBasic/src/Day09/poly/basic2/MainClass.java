package Day09.poly.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		//각각의 객체 생성 (총 6개)
		Person p = new Person("이순신", 20);		
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("홍길자", 30, "345345");
		Teacher t1 = new Teacher("박찬호", 40, "야구");
		Teacher t2 = new Teacher("손흥민", 30, "축구");		
		Employee e1 = new Employee("강감찬", 50, "역사부");
		//상속관계를 가지지 않는다면 객체 종류별로 모아줘야 한다
		
		//Student[] arr = {s1, s2};
		//Teacher[] arr2 = {t1, t2};
		
		//부모타입배열이기 때문에 다 담을 수 있는 것!
		//부모타입을 활용한 배열의 다형성
		Person[] arr = {p, s1, s2, t1, t2, e1};
		
		//반복을 돌리게 되면...
		for(Person person : arr) {
			System.out.println(person.info());
		}
		
		System.out.println("===================================");
		//House 객체의 inHouse메서드를 실행
		
		House h = new House();
		h.inHouse(p);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		
		h.whoAreYou(p); //else 실행됨
		h.whoAreYou(t1); //선생이야! 실행됨
		h.whoAreYou(e1);
		h.whoAreYou(s1);
		
		method(); //아랫줄에 static이 없으면 호출이 안 된다. 이유는?
	}
	
	//메서드
	public static void method() {
		
	}

}
