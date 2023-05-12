package Day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		//updown 게임 - 1~100까지 나열된 값을 가장 빨리 찾는 방법?
		//절반씩 나눠서 찾아가기(50인지 확인) -> 계속 절반씩 확률을 줄여나가는 것.
		//이진탐색 = 반을 분할해서 찾아가는 방법.
		//조건 - 순서대로 정렬
		/*
		 * 1. 포인터(화살표/start,end)를 배열의 처음과 끝에 총 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간이 찾는 값인지 확인
		 * 4. 중간값이 찾는 값 보다 크다면, end를 중간값-1로 내린다.
		 * 5. 중간값이 찾는 값 보다 작다면, start를 중간값+1로 올린다.
		 * 
		 */

		int[] arr = {1,3,5,10,20,30,50,80,100}; //길이는 9이지만 인덱스는 8
		//정렬이 안 되어 있다면 array sort로 정렬해주기.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을값>");
		int find = scan.nextInt();
		
		int start = 0;
		int end = arr.length-1; //index 8
//		int count = 0; //회전수확인
		
		
		//반복문 밖에 중간값을 지정하면 매번 바꿔야해서 안 됨.
		while(start<=end) {	//회전의 조건	start가 end보다 작을때까지.
		//회전/탈출조건과 start를 직접 정해야해서 while문
			
//			count++; //한 바퀴 돌때마다 증가. 회전수 확인
			//회전수를 보려고 넣는거라 마지막에 안 넣어도 됨.
			
			//중간값
			int mid = (start + end) / 2;
			
			//중간값이 찾는 값일 경우
			if(arr[mid] == find) {
//				System.out.println("회전수:" + count); //회전수보려고 넣은것
				System.out.println("찾을 값은:" + mid + "번째 존재함");
				break;
			} //이 위치에 else넣어서 못 찾은 값을 지칭한다고 쓰게 되면,
			  //실제로 값을 찾았더라도 못 찾았다고 뜬다.
			  // if/else 중에 하나가 실행되는거라 넣으면 안 됨.
			
			//찾을 값이 중간에 있는것보다 큰 경우
			if(arr[mid] < find) { 
				start = mid + 1;
			} else {
				end = mid -1;
			}
		} //반복을 다 돌고 나서(탈출한 다음) 값을 못 찾았다고 표현하려면.
		
		if(start > end) {
			System.out.println("찾는 값은 없습니다.");
		}
		
		
		//위의 탐색기능과 같은 역할을 하는 것
		//이진탐색 - 찾은 위치를 알려준다. 찾을 값이 없다면 음수를 알려준다.
		System.out.println(Arrays.binarySearch(arr, 50));
		
		
		
		
		
		
		
		
	}
}
