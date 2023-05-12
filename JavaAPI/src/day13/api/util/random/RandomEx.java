package day13.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
//		double d = Math.random();
		Random r = new Random(); //객체 생성
		
		double d = r.nextDouble(); //0이상 ~1미만
		System.out.println(d);
		
		int x = r.nextInt(); //정수범위의 랜덤값이 무제한으로 나온다
		System.out.println(x);
		
		int y = r.nextInt(10); //0이상 10 미만
		System.out.println(y);
				
	}
}
