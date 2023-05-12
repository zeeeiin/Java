package Day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue는 반복문을 건너뛰게 하는 탈출문
		//특정 조건과 같이 사용한다
		//for문에서는 증/감식으로 이동된다.
		
		/*
		for(int i = 1; i <=10; i++) {
			
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		
		//while문에서는 continue는 조건식으로 간다. 
		int i = 1;
		while(i <= 10) {
			
			if(i ==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
	}
}
