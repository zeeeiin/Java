package Day03;

import java.util.Arrays;

public class ArrayMatrix {
	
	public static void main(String[] args) {
		
		//다차원배열 - 매트릭스
		//배열안에 배열이 저장되는 형태
		//int[][] 배열안에 배열이 들어간다는 형태 > 대괄호 2개라서 2차원배열
		
		int[] arr0 = {1,2,3}; //1차원배열
//		int[][] arr = {10,20,30}; //중괄호 안 각각의 자리에 배열이 들어감
		
		int[] kor = {10,20,30};
		int[] math = {40,50,60};
		int[] eng = {70,80,90};
		
//		int[][] arr = {배열, 배열, 배열}; 
		int[][] arr = {kor, math, eng}; //바로 변수를 넣을 수 있다
		//arr의 0번째 인덱스는 kor
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0])); //kor배열
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		//2차원 배열의 사용
		System.out.println(arr[0][0]); // 0번째의 친구의 0번째를 보여줘 라고 하는 것.
		
		arr[0][0] = 100;
		System.out.println( arr[0][0]);
		System.out.println( arr[2][2]);
		
		
		//2차원 배열을 한번에 생성하고, 초기화하는 방법
		int[] [] arr2 = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90} //배열안에 배열이 또 만들어져 들어가는 형태
		};
		
		//2차원 배열의 크기만 지정하는 방법
		int[] []arr3 = new int[3][4]; //3행 4열의 배열이 만들어진다. 대신에 값은 없다.
		
		//2차원 배열의 모형을 한번에 보는 방법
		System.out.println(Arrays.deepToString(arr3));
		
		//2차원 배열의 순회 > 처음부터끝까지 다 도는 것!
		int x = 1;
		
		for(int i = 0; i < arr3.length; i++) { //0,1,2 라서 3바퀴 돌 것.
			
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = x++; // 12345678~~
			}
		}
		//결과
		System.out.println(Arrays.deepToString(arr3));
		
		
	}

}
