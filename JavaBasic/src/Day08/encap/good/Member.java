package Day08.encap.good;

public class Member {

	//단순히 값을 저장하기 위한 클래스 Data Transform Object
	
	private String name;
	private int age;
	private String id;
	private String pw;
	private String addr;
	private String zipCode;
	private String ssn;
	
	
	//getter / setter 14개를 만들어야함
	
	//자동완성기능
	//alt + shift + s
	//또는
	//source 탭
		
	public Member() {		
	}
	
	//매개변수를 받는 생성자도 자동완성!
	public Member(String name, int age, String id, String pw, String addr, String zipCode, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		this.addr = addr;
		this.zipCode = zipCode;
		this.ssn = ssn;
	}
	
	
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	
	
	
	
	
}
