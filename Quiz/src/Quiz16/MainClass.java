package Quiz16;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {


		/*
		 * updown 게임
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경.
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int num = (int)(Math.random()*100) + 1; //100만 쓰면 0~99니까 int로 캐스팅 해줘야한다.

		int count = 0;	//시도 횟수. 모든 경우에 시도횟수가 증가되게 해야하니까 아예 밖에 만들어주기.

		while(true) {

			try {				
				System.out.print("정답 입력 > "); //입력받고 조건 3가지 중에서 실행하고 다시 돌아가는 구조
				int answer = scan.nextInt();
				count++; //시도횟수 증가. 한 번의 입력은 한 번의 시도횟수다.

				if(num == answer) {	//정답					
					System.out.println("정답!");				
					System.out.println("시도횟수 : " + count + "회"); //시도횟수 출력.	
					break;				
				} else if(num > answer) { //정답이 입력보다 큰 경우
					System.out.println("더 큰 수를 입력하세요.");
				} else { //정답이 입력보다 작은 경우
					System.out.println("더 작은 수를 입력하세요.");
				} 
				
			} catch (Exception e) {
				System.out.println("정수만 입력하세요!");
				scan.nextLine();
				count++;
			}


		}

	}

}


