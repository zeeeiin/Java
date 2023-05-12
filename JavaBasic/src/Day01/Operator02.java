package Day01;

public class Operator02 {

	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 / 3; //2
		int j = 7 % 3; //1
		int k = 7 * 3; //21
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		//비교연산 <, <=, ==, >=, >, !=
		System.out.println(i == j); //f
		System.out.println(i >= j); //t
		System.out.println(i < j); //f
		System.out.println(i != j); //t != 같지 않니?
		System.out.println(21 != k); //f 같지 않아야 true가 나올 것.
		System.out.println(k % 2 != 0); //0이 아니라는 건 홀수라는 의미. t - 홀수
		System.out.println(k % 2 == 1); //t - 홀수
		
		//비트연산자 - 참고용
		int a = 5; //0000 0101 (2)
		int b = 3; //0000 0011 (2)
		
		System.out.println(a & b); //두 자리수별로 비트가 1이면 1, 아니면 0 = 0000 0001
		System.out.println(a | b); //두 비트중 하나만 1이어도 1, 아니면 0 = 0000 0111
		System.out.println(a ^ b); //같으면 0, 다르면 1.
		
		//비트쉬프트 - 참고용
		int h = 100;
		System.out.println(h << 2); //h 왼쪽으로 2칸 가라
		
		
	}
}
