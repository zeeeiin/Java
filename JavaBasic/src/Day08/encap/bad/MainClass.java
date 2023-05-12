package Day08.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수가 public이면 누구나 사용할 수 있고, 잘못된 값이 저장될 수도 있다.
		MyDate me = new MyDate();
		
		me.day = 32;
		me.month = 100;
		me.year = 2022;
		me.ssn = "이게 뭐야";
		
		
		
	}
}
