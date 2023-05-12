package quiz01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자 중 절대 중복되지 않는 숫자를 추출.(ex. 1,2,7만!)
		 * 	  arr를 랜덤하게 10번 섞어준다. 
		 * 	  0~2번째 값을 새로운 배열로 옮겨 담아보세요.
		 * 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		for(int i = 0; i<=10; i++) { //반복 돌릴 것. i가 10번 회전하게
				
			int a = (int)(Math.random()*9); //랜덤한 인덱스를 2개 만들어야함. 0~8			
			int b = (int)(Math.random()*9);	//이렇게해야 0부터 8까지. 0~8		
			
//			System.out.println(a + "-" + b); //이게 인덱스번호
			
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
		}		
//		System.out.println(Arrays.toString(arr)); //중간에 확인해보면 랜덤하게 뜨는걸 확인할 수 있다.
		
		int[] newArr = new int[3]; //새로운 배열의 길이만큼 돌려주기 0,1,2 총 3개짜리
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i]; //새로운 배열에 담아주기
		}
		
		System.out.println(Arrays.toString(newArr));
		
	} 
}
