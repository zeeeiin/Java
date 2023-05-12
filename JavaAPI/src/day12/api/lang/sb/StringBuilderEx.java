package day12.api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//StringBuilder - 단일 스레드 환경에서 사용
		//StringBuffer - 멀티 스레드 환경에서 사용 
		
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		
		//차이점
//		str = str + "program";
//		sb.append("program");
		
		System.out.println( str + "program" );
		//문자열을 더해도 원본 문자는 변하지 않는걸 볼 수 있다.
		
		System.out.println(sb.append("program"));
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메서드
		//append() - 문자열 끝에 추가		
		sb.append("ming");
		System.out.println(sb);
		
		//insert() - 중간에 추가
		sb.insert(5, "study "); //5번째 인덱스에 이 문자열이 들어간다
		System.out.println(sb);
		
		
		//replace() - 문자열 변경
		sb.replace(5, 10, "book");// start, end, 바꾸고싶은 문자열
		System.out.println(sb);
		
		//delete() - 삭제
		sb.delete(5, 10); //5번째 이상 10번째 미만 삭제
		System.out.println(sb);
		
		sb.deleteCharAt(0); //해당 인덱스번째 삭제
		System.out.println(sb);
		
		//reverse() - 거꾸로
		sb.reverse();
		System.out.println(sb); //실행해보면 원본이 바뀜
		
		
		//toString() - 문자열로 형변환 (최종적으로 변경해줘야함)		
		String result = sb.toString(); //문자열로 변경된 결과값을 받을 수 있다
		System.out.println(result); //sb를 toString()으로 형변환. StringBuilder라서, 타입이 달라서 String으로 변환시켜줘야한다
		
		
//		if("gnimmargorp ava".equals(sb)) {
//			System.out.println("같음");
//		}
				
		
		
	}
}
