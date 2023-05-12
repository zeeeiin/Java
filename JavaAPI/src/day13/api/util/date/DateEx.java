package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		Date date = new Date(); //date 객체 생성
		System.out.println(date); //가장 기본이 되는 날짜 형식
		
		
		int year = date.getYear(); //반환은 정수. 1900년을 뺀 결과를 준다.(사용권장하진않음)
		System.out.println(year);
		
		
		//1970/1/1 0시 기준으로 밀리 세컨으로 변경
		long millis = date.getTime();
		System.out.println(millis);
		
		//현재시간 + 1초
		Date date2 = new Date( System.currentTimeMillis() + 1000);
		System.out.println(date2);
		
		long millis2 = date2.getTime();
		System.out.println(millis2 - millis); //시간차
		
		
		System.out.println("----------------------------------");
		
		//사람이 보기 편한 날짜로 변환(년 월 일 시 :분 :초)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss"); //날짜패턴 지정 가능
		
		//이렇게 넣으면 문자열로 반환된다
		String now = sdf.format(date);
		System.out.println(now);
		
		
		
		
	}

}
