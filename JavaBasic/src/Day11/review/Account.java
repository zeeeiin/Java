package Day11.review;

public abstract class Account {
	
	private String name;
	
	public Account() {
	}
	
	public Account(String name) {
		this.name = name;
	}
	
	
	public void method01() {
		
	}
	
	
	//추상메서드 - {}를 가지지 않음
	public abstract void method02();

	//getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
