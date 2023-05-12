package Day02;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i<= n; i++) { //1부터 n까지 증가한다.
			//공백 n-i=j
			for(int j = 1; j <= n-i; i++) { //n-i 값을 넣어준다.
				System.out.print(" ");
			}
			//별
			for(int j = 1; j<=i; j++) {//i값만큼 출력해줘야한다
				System.out.print("*");
		
			} 
			System.out.println();
				scan.close();
		}
	}
}