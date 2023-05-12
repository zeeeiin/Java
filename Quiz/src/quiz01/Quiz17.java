package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
//		int num1 = (int)(Math.random()+100 )+1; //1~100
//		int num2 = (int)(Math.random()+100 )+1; //반복을 돌아갈때 num1,2는 서로 만날 일이 없어서 그런 것
//		한 번 선언하고 누적할거면 밖에 만드는 거고
//		한 번 만들때마다 새로우려면 반복문 안에 있어야 한다.	
		
		Scanner scan = new Scanner(System.in);		
		
		int okCount = 0;
		int noCount = 0;
		
		
		while(true) {
		
			int num1 = (int)(Math.random()*100 )+1; //1~100
			int num2 = (int)(Math.random()*100 )+1; 
			int oper = (int)(Math.random()*2);
			
			System.out.println("-------------------------------");
			System.out.println(num1 + (oper == 0 ? "+" : "-") + num2 + " = ?"); //변수 + 문자열 ...
			System.out.println();
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int answer = scan.nextInt();
			
			int correct = oper == 0 ? num1 + num2 : num1 - num2; //실제정답 (랜덤으로 + - 는 아직 아님)
			//if else도 가능한데 너무 복잡하고 길어짐.
			
			if(answer == 0) { //가장 가까운 반복문 탈출이니까 여기 적어야함!!
				System.out.println("정답횟수:" + okCount);
				System.out.println("오답횟수:" + noCount);
				break;
			}
			
			if(answer == correct) { //정답 				
				System.out.println("정답입니다");
				okCount++;
			} else { //오답
				System.out.println("틀렸는데요?");
				noCount++;
			}			
			
		}

	}

}
