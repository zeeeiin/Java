package Quiz19;

import java.util.*;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수(로또번호)
		 * >> set을 쓰면 금방 처리된다
		 * 
		 * 1. Random 객체를 이용해서 1~45까지의 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장하시오.
		 * 참고 - 6번만 반복시키면 안 됨..
		 */		
		
//		Random rd = new Random();
//		int num = rd.nextInt(46); //(45)+1
		
		Set<Integer> set = new HashSet<>();
		Random ran = new Random();		
		
		//int n = ran.nextInt(45)+1; //1~45. 45곱하고 1더해주기
		
		while(set.size() < 6) {
			int a = ran.nextInt(45)+1;
			set.add(a);
		}
		
		System.out.println(set.toString());
		
	}

}
