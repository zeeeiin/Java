package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(Month[] args) {
		
		/*
		//정수 2개를 받아서 합을 출력하는 문장
		//반환도 없고 매개변수도 없는 메서드 show()로 변형하고 출력
		System.out.println("[두 수의 합을 구합니다]"); //이걸 메소드로 나눠야함
		
		
		//하나만 메서드로 만들어서 두 번 호출하면 됨
		//반환은 있고, 매개변수는 없는 메서드 input()
		Scanner scan = new Scanner(System.in);		
		System.out.println("정수입력>");
		int num1 = scan.nextInt();
		
		System.out.println("정수입력>");
		int num2 = scan.nextInt();
		
		//두 수의 합을 리턴하는 메서드 add()		
		int result = num1 + num2;
		
		//결과를 받아서 출력해주는 메서드
		//매개변수로 result를 받아서 둔순히 출력하는 메서드 print
		System.out.println("두 수의 합:" + result);
		*/
		
		show();
		
		int num1 = input();
		int num2 = input();
		
		int result = add(num1,num2); //num1,2도 정수니까 변수로 들어가도 됨.
		
		print(result);
		
		
	}
	
	//show
	
	static void show() {
		System.out.println("[두 수의 합을 구합니다]");
	}
	
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력>");
		int num = scan.nextInt();
		
		return num;
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static void print(int result) {
		System.out.println("두 수의 합:" + result);
	} 
	
	
}
