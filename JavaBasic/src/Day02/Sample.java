package Day02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int b = 1; b<=a; b++) {
			
			for(int c = 1; c<=a; c++) {
				System.out.print("");
			} for(int d = 1; d<=b; d++) {
				System.out.print("*");
			}
		
				System.out.println();
		
				scan.close();
		}
	}
}
