package Day06.str_ex;

public class MainClass {

	
	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("=================");
		//같은 파일에서 선언한 홍길동은 같은 객체를 참조하게 된다.
		System.out.println(str1 == str2);
		//직접 생성명령을 내리거나 다른 클래스에서 넘어온 String은 다른 주소를 나타내게 된다. 
		System.out.println(str1 == str3); 
		//문자열 동등비교시는 == 대신에 equals()메서드를 사용해서 비교해야한다.
		
		//null safety	안정성이 없어서 에러를 발생시킬 수 있다
		if(str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		if(str1 != null && str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}		
//		str1 = null;
//		null.equals(str3);
		
		
	
		
		
		
		
		
		
		
		
		
	}
}
