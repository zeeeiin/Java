package Day02;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		//조건이 false 여도 무조건 1번은 실행한다.
		//2번째 부터는 while문과 완전히 동일하다.
		int a = 1;
		
		do {
			System.out.println(a);
			a++;
		} while (a <= 10 ); 
	}
}
