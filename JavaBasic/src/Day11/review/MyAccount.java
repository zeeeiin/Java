package Day11.review;

public class MyAccount extends Account implements Calculator {
	//나를 만들어서 cal에 저장해서 cal에서 쓸 수 있다
	
	//=> 값을 1개만 생성
	//객체들이 모두 동일한 값을 갖는 static
	//static - 변수.메서드에 들어감
	//static은 클래스.변수명 으로 바로 호출 가능 (이 경우에는 private이라 getter로)
	
	//private static final String bankName = "우리은행";
	private static final String bankName = "우리은행";
	//절대 값을 변경할 수 없는 final 
	
	//final 값의 변경 금지 / static 한개만 생성
	
	//생성자는 여러개가 가능하다 	
	MyAccount() {}
	
	MyAccount(String name) {
		super(name);
	}
	
	//오버라이드
	public void method01() {
		System.out.println("자식 클래스에서 오버라이드");
	}
	
	public void method02() {
		System.out.println("추상클래스에서 받은 추상 메서드 오버라이딩");
	}
	
	
	//오버로딩 (동일한 메서드를 여러개 만듦 - 매개변수 값만 변화)
	public void info(String name) {
		System.out.println("parameter를 name만 받음");
	}
	
	public void info(String name, String ssn) {
		System.out.println("parameter를 name, ssn 받음");
	}
	
	@Override
	public void add(int a) {
		
	}
	
	@Override
	public void sub(int a) {
		
	}
	
	public static String getBankName() {  //같은 static 멤버만 참고 가능..
		
		//만약 여기서 info 메서드를 쓰고 싶다면
		//객체로 생성해서 써야한다...
		
		
		return bankName;
	}

}
