package Day03;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		//배열 (변수의 집합인 동시에 데이터 타입)
		int[] arr;
		
		//배열의 생성
		arr = new int[5];
		
		//배열의 초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
		//배열의 모형
		System.out.println(arr); //주소값
		
		//배열의 모형을 문자열로 출력
		System.out.println(Arrays.toString(arr));
		//실제 배열에 담긴 값을 출력
		
		
		//배열의 값의 변경
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이
		System.out.println("배열의 길이:" + arr.length);
		
		//배열을 선언하는 다양한 방법
		//1st
		int[] arr2 = new int[3]; //아직 값이 안 들은 형태
		
//		2nd  묘하게 복잡해보여서 첫번째 방법이 나음.
		int[] arr3 = new int[] {1,2,3};
		
		//3rd 바로 값을 넣어주는 방식.
		int[] arr4 = {1,2,3};
		
		//배열은 초기값을 지정하지 않으면 기본값으로 자동초기화
		//int = 0, double = 0.0, String = null
		System.out.println(Arrays.toString(arr2)); 
		
		
	}
}
