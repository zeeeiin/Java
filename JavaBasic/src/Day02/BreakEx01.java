package Day02;

public class BreakEx01 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) { //10바퀴 돌아가게 설정
			
			
			System.out.println(i);
//			break; //조건없이 브레이크 설정하면 바로 종료. 조건과 함께 사용한다.
//			if(i == 5) break; //5일 때 종료. 회전은 그대로 남아있기 때문 
							 //5까지 돌고 5일때 출력하기 전에 빠져나온 것
		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를 때 사용한다.
		 * - 자바에서는 while(true) 문장을 많이 사용한다.
		 * - 특정 조건에서 탈출하는 형식으로 사용한다.
		 * 
		 */
			
			
		int a = 1;	//변수를 만들어줘야한다.
		while(true) { //특정조건과 함께 탈출하게 만들고 싶다. 
			System.out.println(a);
			
			if(a == 15) {
				System.out.println("그만!");
				break; //15번 끝났을 때 탈출 시키고 싶다면 조건과 함께 break 문장을 써주면 된다.
			}
			
			a++;
			
		}
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}
}
