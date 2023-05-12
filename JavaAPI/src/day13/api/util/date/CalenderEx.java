package day13.api.util.date;

import java.util.Calendar;

public class CalenderEx {
	
	public static void main(String[] args) {
		
//		Calendar cal = new Calender(); //이렇게 생성 불가
		
		//static메서드를 사용해 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		
//		System.out.println(Calendar.YEAR); //1
//		System.out.println(Calendar.MONTH); //2
//		System.out.println(Calendar.DATE); //5
				
		int year = cal.get(Calendar.YEAR);
		System.out.println(year); //년
		
		int month = cal.get(Calendar.MONTH); //month는 하나 항상 작게 나와서 +1 해줘야한다
		System.out.println(month + 1);//월 = 1작게 나옴
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); //일
		
		int hour = cal.get( Calendar.HOUR ); //시
		int min = cal.get( Calendar.MINUTE ); //분
		int second = cal.get( Calendar.SECOND ); //초
		
		
		
		
		
		//상수형태로 월,요일,시간 등이 다 존재해서 사용 가능하다.
		//System.out.println(Calendar.YEAR); //근데 이렇게 쓰면 안 되고...
		
		//getter 함수 메서드 써야함
		
		//int year = cal.get(1); //현재 년도를 알 수 있게 1로 넣기
		//System.out.println(year);
		
		
		

		
		
		
	}

}
