package Day02;

public class EnhanceForEx {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5,6,7};
		
		//향상된 포문 - 배열같은 연속된 타입을 돌리기에 적합하다.
		for( int a : arr ) {
			System.out.println(a);
		}

		System.out.println("----------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for ( String str : arr2) {
			System.out.println(str+ "요일");
		}
		
		System.out.println("----------------");
		
		//이 값들의 합계와, 평균(실수형)을 출력
		int[] score = {50,40,30,20,10};
		
		int sum = 0;
		
		for(int a : score) {
			sum += a;			
		}
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + (double)sum / score.length ); //배열의 길이로 표현.
		//한 쪽이 더블이면 된다. 더블로 캐스팅 해줘야함
		
	}

}
