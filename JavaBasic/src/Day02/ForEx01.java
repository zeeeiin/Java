package Day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0; //합계변수. 밖에 만들어주기
		
		for(int a = 1; a <= 10; a++) {
			sum += a;
		}
		
		System.out.println("합계:" + sum);
		System.out.println("-------------------------------");
		
		
		for(int a= 10; a>=1 ; a--) {
			System.out.println(a);
		}
		
		
		
	}
}
