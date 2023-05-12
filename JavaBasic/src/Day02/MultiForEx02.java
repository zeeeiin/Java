package Day02;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		//회전수가 변경되는 중첩반복문
		//i값에 따라서 j의 값을 변경
		//1-1
		//2-1 i가 2일때는 2바퀴
		//2-2
		//3-1 i가 3일때는 3바퀴
		//3-2
		//3-3
		
		for(int i = 1; i<=10; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.println(i + "-" + j);
			}
			
		}
		
		//별 출력하기
		/*
		 * 
		 ** 
		 *** 
		 **** 
		 *****
		 */
	
		//행
		for(int i = 1; i<=5; i++) {
			//출력
			for(int j = 1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 	*  앞부분은 공백으로 찍어주는 것.
		   ***  별 모양을 찍어주는 것.
		  ***** 
		 *******
		*********
		*/
		
		
		int star = 5;
		
		for(int i = 1; i <= star; i++) {
			//공백을 찍어주는 반복문
			for(int j = 1; j<= star-i; j++) { //공백이 찍힌 것.
				System.out.print(" ");
			} //별출력 : 2배 -1
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
				
			System.out.println(); //출력 후 줄바꿈 할 수 있게 넣어주기.
		}
		
		
	}
}
