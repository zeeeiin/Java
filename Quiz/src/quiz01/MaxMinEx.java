package quiz01;

import java.util.Scanner;

public class MaxMinEx {

	public static void main(Month[] args) {
	
			Scanner scan = new Scanner(System.in);
			
			int[] arr = new int[9];
			
			int index1 = 0;
			int index2 = 0;
			
			int max = 0;
			int min = arr[0];
			
			for(int i = 0; i < arr.length; i++) {
			
				arr[i] = scan.nextInt(); //자연수 입력			
				
				if(max < arr[i]) {
					max = arr[i];
					index1 = i+1;
				} 
				
				if(min > arr[i+1]) {
					min = arr[i+1];
					index2 = i+1;
				}
			} 
			
			System.out.println("최댓값:"+ max + ", " + index1 + "번째" );
			System.out.println("최소값:"+ min + ", " + index2 + "번째" );
				
		}
	
	}	
