package Day02;

public class MultiForEx01 {

	public static void main(String[] args) {
//		
//		
//		//바깥 9, 안쪽 9
//		for(int i = 1; i <=9; i++) { 
//			
//		System.out.println(i + "단");
//			
//			for(int j = 1; j <=9; j++) {
//				System.out.println(i + "-" + j); //제일 편한건 이렇게 출력해보는 것.
//				
//		
		//2~9단까지 구구단을 모두 출력하라.
		//세로로 출력하시오.
		
				
		for(int k = 2; k <=9; k++) {
			
			System.out.println("구구단:" + k + "단");
			
				for(int c = 1; c <= 9; c++) {
				
					System.out.println(k + "x" + c + "=" + (k*c));
					
				} System.out.println("----------------");
			
			}
		
		}
	
	}

