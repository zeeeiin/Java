package Day08.encap.bad;

public class MyDate {
	
	//접근제어자가 없는 경우
	//변수가 public으로 열려있는 경우
	public int year;
	public int month;
	public int day;
	public String ssn; //주민번호
	
	public void info() {
		System.out.println("생일:" + year + "년" + month + "월" + day + "일");
		System.out.println("주민번호:" + ssn);
	}
	
	
}
