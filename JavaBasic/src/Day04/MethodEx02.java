package Day04;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수(parameter)
		 * 메서드가 전달받는 매개값
		 * 여러 개 받을 수도 있고, 받지 않을 수도 있다.
		 * 
		 */
		
		//사용할 땐 ()안을 신경쓰고 기억해야한다
		//하지만 매개변수가 있다면 ()에 맞는 값을, 전달할 값을 완성한다는 의미
		//호출 구문에서는 전달할 값을 ()안에 넣어줘야하고, 정확히 매개변수를 맞춰 적어줘야한다.
		//10을 전달하고 싶다면 calSum(10);
		int result = calSum(10);
		System.out.println("결과:" + result);
		
		int result2 = calSum(100);
		System.out.println("결과:" + result2);
		
		int result3 = calSum2(1,2); //매개변수가 2개니까 ()안에 변수 2개 넣어주기
		System.out.println("결과:" + result3);
				
		String result4  = calSum3(5,"가");
		System.out.println("결과:" + result4);
		
		
	} //main . 여기가 메인의 끝
	
	//정수 반환할 것.
	//1~매개변수까지의 합계를 구하는 메서드
	static int calSum(int a) { //()안에 뭘 받을지 결정해서 적기. ()안에 변수 선언. 타입을 꼭 적어줘야한다.
		
		int sum = 0;
		for(int i = 1; i <= a; i++) { //반복하는 회전수를 매개변수로... a만큼만 회전시키겠다
			sum+= i;
		}		
		return sum; //일단 return 0;이라고 맞추고 나중에 변경하기.
	}
	
	
	//매개변수를 2개 받는 경우
	static int calSum2(int a, int b) { //,로 변수 2개 나열하면 된다. 개수 제한 없이 가능
		
//		int result = a + b; //두 매개변수의 합을 반환한다.(둘의 합계를 구하고싶다면 이렇게)
//		return result;
		
		return a+b; //타입만 맞으면 오케이
	}
	
	
	//간단한 실습 - 정수, 문자열을 전달받는 String calSum3() 생성해보기 (반환은 문자열로) 반환과 매개변수는 따로따로가능
	
	static String calSum3(int c, String s) { //돌려주는 값이 String 이니까 앞에 적어주면 됨
	//a횟수만큼 s를 반복시켜서 합치는 작업을 할 것. a:반복할횟수
		
		String str = ""; //문자열 합계라서 추가한 것.
		for(int i = 1; i <= c; i++) {
			str += s; //문자열을 합치겠다
		}	
		return str;
	}
		
}
	
	
	
	
	
	
