package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
//		arrays >> 전부 static 메서드로 만들어져있다 		
		
		int[] arr = {3,1,2,5,6,7};
		
		//정렬
		Arrays.sort(arr); //배열의 크기가 크더라도 빠르게 정렬해준다
		
		//배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		//탐색 - 차순정렬. 선행조건 : 정렬이 필수
		int result = Arrays.binarySearch(arr, 4); //배열명, 찾을값
		System.out.println(result); //음수가 나오면 없는 값.
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); //값에 대한 위치 반환
		
		
		//배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr); //깊은 복사(완전히 새로운 배열)
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr2));
		
		
		//배열크기지정복사
		int[] newArr3 = Arrays.copyOfRange(newArr2, 1, 3);
		System.out.println(Arrays.toString(newArr3));
		
		
		//배열의 원소비교
		if(Arrays.equals(newArr, arr)) {
			System.out.println("배열의 원소가 정확히 일치함");
		}	
		
		
	}

}
