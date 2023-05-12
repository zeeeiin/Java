package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		//백준 - 1차원배열 = 10818번
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); 
		int[] arr = new int[a]; //크기가 a인 배열 생성
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt(); //입력을 받아 배열에 넣어줘야함
			i++;
		}
		
		//최소, 최대 결정
		int min = arr[0];
		int max = arr[0]; //어차피 다 순서대로 돌면서 비교를 할 거라서!
		
		i = 0; //i 를 초기화 해줌
		while(i < arr.length) {
			
			if(min > arr[i]) {
				min = arr[i];  //이 다음 else if 붙이면 안 될거같은데 해보면 되는듯.
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(min + " " + max);
	}
}
