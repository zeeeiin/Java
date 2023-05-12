package Day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	
	/*
	 * 은닉된 변수에 접근할 때, 미리 생성해놓은
	 * getter / setter를 사용한다
	 * 
	 * 
	 * setter 메서드
	 * 1. 값을 저장하는 용도의 메서드
	 * 2. 접근제어자는 public으로 선언하고
	 * 	  이름은 (set + 멤버변수) 명으로 지정.
	 * 밖에서 값을 전달받아서 private 변수에 저장?
	 */
	
	//값을 저장만 하는거니까 반환없이(void) , 값을 받아 저장해주는 거라 매개변수 있음
	public void setYear(int year) { //중간에 꼭 setYear 카멜표기법으로 대문자가 적혀있어야한다.
		
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력인데요?");
			return;
		} else {
			this.year = year;
		}				
	}
	
	/*
	 * getter 메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어는 public, 반환유형이 있고, 이름은 get + 멤버변수명
	 * 
	 */
	
	//접근제어자 반환유형 메서드명() {}
	public int getYear() { //매개변수는 상황에 따라..
		return year;
	}
	
//	
//	/*
//	 * 1. month, day, ssn 에 getter/setter 생성
//	 * 
//	 * month - 1~12월까지만 저장
//	 * day - 1~31일까지만 ㅈ장
//	 * ssn = 하이픈은 제거하고 13자리까지만 저장 가능 replace(), length()
//	 * 
//	 */
//	
//	
//	public void setMonth(int month) {
//		if(month > 12 || month < 1) {
//			System.out.println("잘못된 입력입니다");
//		} else {
//			this.month = month;
//		}
//	}	
//	
//	public int getMonth() {
//		return month;
//	}
//	
//	
//		
//	
//	public void setDay(int day) {
//		if(day >31 || day < 1) {
//			System.out.println("잘못된 입력입니다");
//		} else {
//		this.day = day;
//		}
//	}
//	
//	public int getDay() {
//		return day;
//	}
//	
//	
//	
//	
//	
//	public void setSsn(int sn) {
//		if(sn >31 || sn < 1) {
//			System.out.println("잘못된 입력입니다");
//		} else {
//		this.ssn = ssn;
//		}
//	}
//	
//	public String getSsn() {
//		return ssn;
//	}
//	
	
	
	
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입력입니다");			
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 날짜 입력입니다");			
		} else {
			this.day = day;
		}
	}
	
	
	public int getDay() {
		return day;
	}
	
	
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-",""); //.replae 첫번째인지 두번째인지 모르겠음...
//		ssn.replace("-", "");
		if(ssn.length() != 13) {//문자열 길이가 13이 아닌 경우
			System.out.println("주민번호는 13자리 입니다");
		} else {
			this.ssn = ssn;
		}
	}
	
	
	public String getSsn() {
		return ssn;
	}
	
	
	
	
	
	
	
	
}
