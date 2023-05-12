package Quiz10;

public class User {
	
	private String name;
	private int age;
	private int rrn;
	
	//기본 생성자(ctrl+space)
	public User() {}

	//생성자
	public User (String name, int rrn, int age) { //private 인지 public인지 헷갈림
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
//		System.out.println("이름:" + name + " 번호:" + rrn + " 나이:" + age);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRrn() {
		return rrn;
	}

	public void setRrn(int rrn) {
		this.rrn = rrn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
