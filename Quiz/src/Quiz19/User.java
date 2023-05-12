package Quiz19;

public class User {
	
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

}
