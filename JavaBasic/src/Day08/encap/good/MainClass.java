package Day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		//me.year = 2022; //private 변수라 마음대로 값 저장이 되지 않음
		me.setYear(2024);		
		
		int year = me.getYear();
		System.out.println(year);
		
		
		
		
		me.setYear(2022);
		me.setMonth(12);
		me.setDay(30);
		me.setSsn("123123-1231231");
		
		String ssn = me.getSsn();
		System.out.println(ssn);
		
		

	}
	
}
