package Day10.final_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍길동");
		//p1.nation = "미국";
		System.out.println(p1.ssn);
		
		Person p2 = new Person("234234", "이순신");
		System.out.println(p2.ssn);
		//한 번 값이 들어가면 바꿀 수는 없지만 객체 별로 값이 들어가면 각각 다르게 출력됨 
		
		
		//상수이 사용은 static처럼 사용 가능
		System.out.println(Constant.O2);
	}
}
