package Day04;

import java.util.Arrays;

public class MethodEx05 {
	
	public static void main(String[] args) {
		
		//배열의 한계점 -> 크기가 정적이다.(고정) but 나중엔 다양하게 변함
		//Stack - Last In First Out ( LIFO )

		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		
//		pop(); //pop은 삭제된 데이터도 받을 수 있다
//		pop();
		int r = pop(); //삭제된 데이터도 확인이 가능함
		System.out.println("삭제된 데이터:" + r);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	static int[] arr = {1,2,3}; //여기에 선언한 이유. 만들어진 곳이 클래스임. 그래서 사용 가능한 배열.
	
	
	//push -> 특정요소를 마지막에 추가해주는 기능
	static void  push(int data) { //반환은 필요없어서 void, 정수받을 것.
		//1. 배열의 크기를 +1한 새로운 배열 단듦.
		int[] temp = new int[arr.length+1];
		//2. arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i]; //복사
		}		
		
		//3. 마지막에 추가 - int data를 마지막에 추가해 주는 것.
		temp[temp.length - 1] = data; //항상 배열의 마지막은 length-1 	
	
		//4. 원본배열을 temp로 변경
		arr = temp;
		temp = null; //temp는 지움
	}
	
		
	//pop -> 특정요소를 마지막에서 삭제 ( 반환 - 삭제된 데이터)
	static int pop() {
		
		if(arr.length > 0) { //배열의 길이보다 클 때만 삭제할 수 있음.
			//1. 삭제할 데이터를 백업 (지우고나면 알 수없기 때문)
			int del = arr[arr.length-1]; //이게 마지막 데이터
			//2. 사이즈는 arr보다 -1 인 사본 배열 생성
			int[] temp = new int[arr.length-1]; 
			//3. 원본 배열을 사본으로 복사(맨 마지막 데이터만 제외)
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i]; //복사 
			}
			//4. 사본 배열을 원본 배열로 변경
			arr = temp;
			temp = null; //temp 삭제
	
			return del; //삭제된 데이터 반환
		}
		
		return 0;
	
	}
	
	
	
	

}
