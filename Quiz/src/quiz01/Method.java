package quiz01;

import java.util.Scanner;

public class Method {
	
//	public static void main(String[] args) {
		
	
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