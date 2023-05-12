package Day02;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		//switch문장의 소괄호에는 변수나, 변수의 연산식 등이 들어갈 수 있다.
		//타입은 - 정수, 문자, 문자열 이어야한다.
		switch( a ) {		
		
		case 0:
		case 1: 
			System.out.println("1입니다");
			break; //switch문을 곧바로 탈출
		case 2: 
			System.out.println("2입니다");
			break;
		case 3: 
			System.out.println("3입니다");
			break;
		case 4: 
			System.out.println("4입니다");
			break;
			
		default:
			System.out.println("1~4가 아닙니다");
			break;
				
			
		
		}
		
		
		
		
		
		
		
		
	}
}
