package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		//배열 요소들 중 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20}; //54,32,14,20
		
		int i = 0;
		
		int sum = 0;
		
		while(i < arr.length ) {
			
			//arr의 i번째를 나눠야함
			if(arr[i]%2 == 0) {
				sum += arr[i];
			}
			
			i++;
		}
		
		System.out.println("결과 : " + sum);			
				
	}
}
