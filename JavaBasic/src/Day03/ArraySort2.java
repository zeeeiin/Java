package Day03;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		
		//버블정렬 - 가장 느린 정렬
		//바로 붙어있는 다음값과 비교해서 뒤로 보낸다.
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		//5,1,23,43,100,40,200 - 1회전 후
		//1,5,23,43,40,100,200 - 2회전 후
		//1,5,23,40,43,100,200 - 3회전 후 - 정렬완성
		
		//회전수를 반복문으로 나타낼 수 있다가 중요한 것.
		
		//바깥 반복문 = 회전수
		//안쪽 반복문
		//총 회전은 6번		
		//첫번째에선 회전수가 6번이었고, 두 번째 에서는 5번 비교, 세 번째에서는 4번 비교 .....
		//중첩반복문의 회전수
		
		for(int i = 0; i< arr.length-1; i++) { //0~5. 6회전. i = 회전수
						//바깥 회전수부터 결정. 안쪽 회전때문에 배열길이 미만으로 설정.
			
			for(int j = 0; j < arr.length-i-1; j++) {//j의 5,6번 인덱스가 마지막에 비교되어야 함.
										  //j는 5(직전)까지만 돌면 된다. 6까지 돌게되면 에러.
				System.out.println(i + "-" + j);
				
				if(arr[j] >arr[j+1]) { //내 다음값과 비교하는 식이 들어가야한다.
										//큰 친구를 뒤로 보내야하는 조건식
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}	
		
		System.out.println(Arrays.toString(arr));
		
		//아주 유용한 기능
		Arrays.sort(arr); //가장 빠른 퀵정렬 (오름차순 정렬)
		
		System.out.println(Arrays.toString(arr));
		
	}
}
