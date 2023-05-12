package Day01;

public class Operator03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if뒤에 소괄호가 true면 if중괄호 실행
		//false라면 else문 실행
		if(x != 10 & ++y ==21) {
			//&는 둘 다 참이어야함. x가 10이랑 같지 않냐.(F) 
			//++y ==21 둘 다 true여야 하는데 하나가 false이기 때문에 결과는 false.
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
						
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		if(x == 10 | ++y ==21) { //t | f = t
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");			
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		System.out.println("--------------------");
		
		x = 10;
		y = 20;
		
		if(x != 10 && ++y ==21) { //f && 실행X = false.
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
						
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		if(x == 10 || ++y ==21) { 
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");			
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		
		
		
		
		
	}
	
	
	
}
