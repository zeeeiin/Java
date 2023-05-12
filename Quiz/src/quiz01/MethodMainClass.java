package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class MethodMainClass {

	public static void main(Month[] args) {

		System.out.println(input());
		
		
		
		
		
				
	}

	//method1
		static int input() {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력 > ");
			int num = scan.nextInt();
			
			return num;		
		}	
		
		//method2
		static int add(int a, int b) {
				
			int result = a + b;
			return result;		
		}
		
		//method3
		static void result(int result) {
			System.out.println(result);
		}
}
