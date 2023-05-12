package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
	
		//1. 1000까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 count(개수)
		
		//2. 50~100까지의 합계
		
		int a = 1;
		//String b = "";
		int c = 0; //누적할 변수
				
		while (a<= 1000) {
			if(a % 4 == 0 && a % 8 != 0) {
				c++ ; //count : 하나씩 센다. 그래서 c++
			}			
			a++;
		} System.out.println(c);
		
		
		
		int num = 50 ;
		int sum1 = 0;
		
		while(num<=100) {			
				sum1 += num;
				num++;
			}
			System.out.println(sum1);
		} 
		
		
	}
		

