package Day02;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		//입력받은 정수가 소수인지 For문으로 판별
		//(소수의 특징은 약수의 개수가 2개다)
		// x=10; - x의 약수의 개수를 세면 소수인지 알 수 있다
		//소수는 항상 약수가 2개일 것이다.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수입력>");
		int num = scan.nextInt();
		
		int count = 0; //합계변수(카운트변수)
		
		//입력받은 수까지 for문으로 돌리고 싶다.
		for(int i = 1; i <= num; i++) {
			
			if(num%i == 0) { //약수. 입력받은 num을 i로 나눈 게 약수인 것
 				count++;
			}
		}
		
		System.out.println( count == 2 ? num + "은 소수" : num + "은 소수가 아님");
		//삼항 연산식으로 적어본 것.
		
		
		
	}
}
