package quiz01;

import java.util.Arrays;


public class MethodQuiz03 {
	
	public static void main(String[] args) {
		
		char[] arr = {'a', 'b', 'c', 'd', 'e'}; //배열이 여기 있어야함
		String result = method6(arr); //배열의 변수명으로 호출. 변수로 출력이 된다.
		System.out.println(result); 
				
		int[] arr2 = {1, 2, 3, 4, 5}; 
		int result2 = method7(arr2);
		System.out.println(result2);		
		
		String[] arr3 = method8("가", "나");
		System.out.println(Arrays.toString(arr3));
		
	}
	
	
 	//method6
	static String method6(char[] arr) {
		
		String str = ""; //문자열로 변수 만들기
		for(int i = 0; i < arr.length; i++) {
			str += arr[i]; 
		}
		return str;
	}
	
	
	
	//method7
	static int method7(int[] arr2) {
		int sum = 0;		//배열의 값을 받을 수 있는 변수.
		for(int a : arr2) { //향상된 for문 써보기. 뒤에 배열 이름이 들어가고 순서대로 배열값을 a에 빼준다.
			sum += a;
		}
		return sum;
	}
	
	
	//method8	
	static String[] method8(String string, String string2) {
		
		String[] arr = {string, string2}; 	//두 개를 배열로 합쳐서 반환한 것.		
		return arr;
		
//		return new String[] {a, b};
	}
	
	
	
}
