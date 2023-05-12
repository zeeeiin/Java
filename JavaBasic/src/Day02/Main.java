package Day02;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if(2<=a && 2<=b && 2<=c) {
			if(a<=10000 && b<=10000 && c <= 10000) {

			System.out.println((a+b)%c);
			System.out.println((a%c)+(b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c)*(b%c)%c);
			}
		}

	}
}


//Scanner scan = new Scanner(System.in);	
//
//int y = scan.nextInt();
//
//int a = 543;
//
//if(a<y) {
//	
//	System.out.println(y-a);
//	
//}
//Scanner scan = new Scanner(System.in);	
//
//String id = scan.next();
//String str = "joonas";
//
//if(id == str) {				
//	System.out.println(str+"??!");
//}
//}
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
//	
//	}
//}

//int size = scan.nextInt();
//
//int a = 1;		
//		
//while(a<=size) {
//	int x = scan.nextInt();
//	int y = scan.nextInt(); //AB만 더해주면 되는거라 sum도 필요 없다
//	
//	System.out.println("Case #" + a +  ": " + (x + y) );
//	//Case #1:2
//	
//	a++;