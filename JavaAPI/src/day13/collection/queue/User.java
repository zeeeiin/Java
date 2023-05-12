package day13.collection.queue;

public class User implements Comparable <User> { //유저와 유저간의 비교가 들어가야해서.
	//CompareTo 메서드가 T타입을 기본적으로 받는데 User로 바뀌면서 User객체를 외부에서 받아줄 수 있다
	
	private String name;
	private int age;
	
	//생성자
	public User() {		
	}

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public int compareTo(User o) { //다른 유저와의 대소비교를 해야해서 생성. T타입에 User받을 수 있으니 바꿔주기
		//내거(this name)와 매개변수로 들어오는 User객체의 멤버변수 값의 비교
		//내거가 앞에 있다면 -1이 나오고, 사전적으로 뒤에 있다면 양수가 나온다.
		//똑같으면 0이 나옴
		
		//return this.name.compareTo(o.getName()); //오름차순. String이 대신 비교
		//return o.getName().compareTo(this.name); //내림차순(양수가 나옴) 다른 사람이 나보다 뒤에 있다면 양수ㅜ
	
		//정수에선 compare메서드로 비교
		//return Integer.compare(this.age, o.getAge() ); //나이 오름차순
		//얘가 compareTo를 호출시킨다.비교해서 음수,0,양수 중 나올 것
		
		
		return Integer.compare(o.getAge(),this.age  ); //나이 내림차순
	
	}

	
}
