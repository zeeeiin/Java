package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중 7의 배수만 가로로 출력.
		//   7 14....98 | 커서가 남는데 줄 바꿔주고 싶다면
		// system.out.println(); - 이거 자체가 그냥 줄바꿈이라 써주면 됨
		
				
		for(int a = 7; a<=100; a++) { //a+=7 도 가능한 방법
			if(a%7 == 0) {
				System.out.print(a + " ");
			}
		} 

		System.out.println();
		
		
		//2. 1~200까지 정수 중 9의 배수의 개수를 출력.
		
		int count = 0;
		//9의 배수인 조건 안에서만 계산해야하기 때문에 조건문이 필요.
		for(int a = 1; a<=200; a++) {
			if(a%9 == 0) {
				count++; //1씩 증가
			}
		}System.out.println(count); //출력은 반복 다 돌고 나서 한 번만 하면 된다.
		
		
		//3. 50~100사이의 두 수 사이의 합 (50,100포함)
		
		int sum = 0;
		
		for(int a = 50; a<=100; a++) {
			sum += a;
		} System.out.println("50-100까지의 합:" +sum);
	 
		
		
		//4. A~Z까지 가로로 붙여서 출력. A=65, Z=90
		//65가 캐릭터형이면 A로 출력된다는 의미
		String str = "";
		
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		System.out.println(str);
		System.out.println();
		
		
		
		//5. 입력받은 정수까지 팩토리얼 5팩토리얼 = 5*4*3*2*1 입력받은 수까지 곱해라.
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		System.out.print(a + "팩토리얼 = ");
		for(int b = 1; b<=a; a--) { 
			System.out.print(a + "*");		
		} 
		
		scan.close();
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println(">");
		int num =scan1.nextInt();
		
		int sum2 = 1;
		for (int i = 1; i <= num; i++) {
			sum2 *= i;
		} System.out.println(num + "!은" + sum2);
	}
}
