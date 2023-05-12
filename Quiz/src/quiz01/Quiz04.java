package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(Month[] args) {
		
		//1.두 정수를 입력받고, 큰 수를 출력하면 된다.
		//단, 같은수라면 "같은 수 입니다" 출력.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 >>");
		int a = scan.nextInt();
		
		System.out.println("숫자를 입력하세요 >>");
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println("a");
		} else if(a == b) {
			System.out.println("같은 수 입니다");
		} else {
			System.out.println("b");
		}
		
			
	}
}
