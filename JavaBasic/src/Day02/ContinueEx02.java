package Day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력 >");

		int num = scan.nextInt();

		int sum = 0; //소수의 합을 누적할 변수

		int count = 0;//약수의 개수를 셀 변수
		//어떤 값을 시작하기 전에 초기화를 해줘야한다.


		x:for(int i = 1; i <= num; i++) { //소수들의 합. n제곱만큼 숫자가 커지면 컴퓨터가 힘들어함

			count = 0; //초기화

			for(int j = 1; j<=i; j++) {	//약수의 개수를 구할 것 //i가 100,000 이라면..
						 
				//적절한 시점 초기화

				if (i % j == 0) {//i를 j로 나눠서 나머지를 세야 함 
					count++;	//1,2 (약수)	  //이게 약수구하는 것
					//개수를 셀 거라 값을 누적할 변수를 위에 만들어줘야한다.
				} 	
				
				if(count > 2) continue x; // 약수 개수가 2개 초과라면 다음 수 확인.
				//엄청 빨라지는 건 아니지만 불필요한 것들을 줄여서 소수가 아닌 것들만 계산할 것.					
												
			}  //end for

			if(count == 2) { //소수를 sum에 누적한다. i는 소수 i를 판별한거니까. 여기서 합을 누적시켜주는 것.
				sum += i;	 //sum에 i를 누적해준다.	//안쪽반복문이 끝난 시점. 판별한 수의 개수				
			}					



		} System.out.println("입력한 수 중에서 소수의 합:" + sum);

	}

}


