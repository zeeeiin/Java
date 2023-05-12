package Day04;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		//Queue - First In First Out (FIFO - 선입선출)
		
//		push();
//		System.out.println(Arrays.toString(arr));
		
		
//		int r = pop();
//		System.out.println("삭제된 데이터:" + r);
//		System.out.println(pop());
		
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		for(int i = 1; i <=5; i++) {
			pop();
			System.out.println(Arrays.toString(arr));			
		}
		
		
		
	}
	
	static int[] arr = {1,2,3}; 
	
	static void  push(int data) { 

		
		int[] temp = new int[arr.length+1];		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i]; 
		}		
		temp[temp.length - 1] = data; 	
		arr = temp;
		temp = null; 
	}
	
	
	//배열의 맨 앞요소부터 삭제되도록 처리. 어떤 기준으로 하냐에 따라 방법이 여러가지이다.
	static int pop() {
		
		if(arr.length > 0) { //0이하일 땐 돌아갈 수 없어서
		
			//1. 삭제할 데이터 백업
			int del = arr[0]; //0번째 데이터를 지울 것.			
			//2. arr - 1인 사본 배열 생성
			int[] temp = new int[arr.length -1];			
			//3. 배열의 1번째 요소부터 옮겨 담는다.
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1]; //1번째부터 마지막까지 복사해서 옮기는 것
			}			
			//4. 원본 배열을 temp로 변경한다.
			arr = temp;
			temp = null; //temp 삭제
			
			return del; //삭제된 데이터 반환
		}
		return 0;
	
	}
	
	
	
}
