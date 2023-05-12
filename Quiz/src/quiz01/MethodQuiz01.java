package quiz01;

public class MethodQuiz01 {
	
	public static void main(String[] args) {
		
		method01(); //단순 호출만 가능
		
		String r1 = method02("가");
		System.out.println(r1);
		//return = 어떤 값을 돌려받을 수 있다
		
		double r2 = method03(1, 2, 3.0);
		System.out.println(r2);
		
		String r3 = method04(3);
		System.out.println(r3);
		
		method05("나", 3);
		
		
		int r4 = maxNum(1,2);
		System.out.println(r4);
		
		int r5 = abs(5);
		System.out.println(r5);	
		
		//
		String result = java(5);
		System.out.println(result);		
		
		
	} //main
	
	//method1	
	static void method01() {	
		System.out.println("안녕하세요");
	}
	

	//method2
	static String method02(String s) { //위에서 메서드를 호출할 때 String s를 주는게 아니라 값을 줘야한다.
		return s;
	}
	
	
	//method3
	static double method03(int a, int b, double c) {
		return a + b + c;
	}
	
	
	//method4
	static String method04(int a) {
		
//		String str = "";
//		if(a % 2 == 0) {//짝
//			str = "짝수";
//		} else { //홀
//			str ="홀수";
//		}
		
//		if(a % 2  == 0) {
//			return "짝수";
//		} else {
//			return "홀수";
//		}	
		return a%2 == 0 ? "짝수" : "홀수";
	}
	
 
	//method5
	static void method05(String string, int b) {

		for(int i = 1; i<=b; i++) {			
			System.out.print(string);
		}
		System.out.println();
	}	
	
	
	//maxNum
	static int maxNum(int a, int b) {
		if(a>b) {
			return a;
		} else {
			return b;
		}				
	}

	
	//abs
	static int abs(int a) {
		return a > 0 ? a : -a;
	}

	
	static String java(int a) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			
			if(i % 2 == 1) {
				str += "자";
			} else {
				str += "바";
			}			
			
		}
		return str;
		
	}
	
	
}