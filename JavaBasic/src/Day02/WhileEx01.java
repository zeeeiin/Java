package Day02;

public class WhileEx01 {

	public static void main(String[] args) {
		
		
		int a = 1; //제어변수: 반복문의 조건을 제어할 변수
		int sum = 0; //값을 누적할 변수
					//누적할 변수는 바깥에서 선언해야 한다. 이 부분은 잘못된 코드 
		
		while(a <= 10) { //10바퀴 돌릴 수 있다 ex.100이라면 100바퀴..
			
			sum += a; //sum = sum +a;
			
			//System.out.println("헛!");
//			System.out.println(a);
			
			
			//누적합 : 1부터 10까지의 합
			//sum 변수에 a를 누적하겠다.
			
			a++; //제어변수를 증가해서 언젠가는 조건이 false가 되도록 만든다.
			//맨 마지막에 써줘야한다.
		}
		
			System.out.println("1-10까지의 합:" + sum);
		
	}
}
