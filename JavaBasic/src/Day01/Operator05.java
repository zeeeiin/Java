package Day01;

public class Operator05 {

	public static void main(String[] args) {
		
		//프로그램에서 랜덤한 값을 발생시키는 기능
		System.out.println(Math.random());
		System.out.println(Math.random());
		//실행할 때 마다 1미만의 랜덤한 double값이 나온다
		
		//1~10까지 랜덤한 값
		double d = Math.random() * 10;
		int a = (int)d + 1; //01~10(실수부는 다 잘려나감) 
		// >> 1에서 10 사이의 랜덤한 수를 만들 수 있다
		// +1을 안했다면 0~9 사이
		System.out.println("1~10까지 랜덤수:" + a);
		
		//한 번에 적으면? = 위의 두 줄과 같은 의미
		int result = (int)Math.random() * 10 + 1;
					// ^얘가 먼저 실행됨^ 그 다음에 10 * 1 하니까 1만 나온 것
		System.out.println(result); //근데 이러면 결과가 1만 나옴
		
		int result2 = (int) (Math.random() * 10) + 1;
		//(int) 0<= x <10 양쪽 항에 1이 더해졌으니까 1부터 11까지로 범위가 바뀜
		//먼저 계산해달라고 소괄호를 넣어줘야한다.
		System.out.println(result2);
		
		//삼항연산식
		// 조건 ? 연산1 : 연산2
		
		String s = result2 % 2 == 0 ? "짝수 " : "홀수"; 
		//(result2가 2로 나눴을 때 0이니? 짝수면 짝수, 홀수면 홀수라고 실행 될 것.)
		//문자열이어서 String
		System.out.println(s);
		
		
		
		
		
		
		
		
	}
}
