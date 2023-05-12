package Day04;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드는 생성과 호출이 있다
		 * 메서드는 메서드안에서 생성 할 수 없다
		 * 
		 */
		
//		calSum(); //메서드 호출
		
		System.out.println("1~10까지 합:" + calSum());
		System.out.println("1~10까지 합:" + calSum());
		System.out.println("1~10까지 합:" + calSum());
		
		int result = calSum(); //메서드 호출
		System.out.println("1~10까지 합:" + result);
		
		String result2 = calSum2(); //반환을 받는 것
		System.out.println(result2);
		
//		
//		//1~10까지 합을 만든다
//		int sum = 0;
//		for(int i = 1; i <=10; i++) {
//				sum+= i;
//		}
	} //main <- 이 부분이 main이 끝나는 지점

	//반환 유형 이름()
	static int calSum() { //호출할 때는 딱 여기만 보면 됨/지금은static을 붙여줘야한다.
		
		//여기에다 적기
		//1~10까지의 합
		int sum = 0;
		for(int i = 1; i <=10; i++) {
				sum+= i;
//	전부 다 이 안에서 사용가능
//		return 0; //짝궁임
		}
		return sum; // 합계를 반환
		
	}
	
	//문자열 반환
	static String calSum2() { //static 붙여주기
		
		//A~Z문자열합
		String str = ""; //문자열 변수 만들어주기
		for(char c = 'A'; c <= 'Z'; c++ ) {
			str+= c;
		}
		return str; //일단은 null이라고 써주고 나중에 바꿔주기
				//최종적으로 return값에 넣어주면 완성
	}
	

}
