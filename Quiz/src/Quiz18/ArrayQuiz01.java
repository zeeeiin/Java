package Quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {
		
		//arr과 arr2는 길이가 1차이가 난다.
		//arr은 마라톤 참가
		//arr2는 마라톤을 완주자
		//완주하지 못한 사람을 리턴하는 메서드를 만드시오.
		
		String[] arr = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] arr2 = {"홍길동", "이순신", "신사임당"};		
		
		System.out.println(test(arr, arr2));
		
	}
	
	public static String test(String[] arr, String[] arr2) { //참가자, 완주자
		//정렬을 하고 시작 
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		//문자열은 정렬이 되면 사전등재순으로 정렬이 된다
		//System.out.println(arr);
		//System.out.println(arr2);
		
		for(int i = 0; i < arr2.length; i++) { //하나 작은 배열길이까지 돌아야함
			if( !arr[i].equals(arr2[i])) { //equals가 아니면 이니까 ! 붙여주기. >> == 비교 하면 안 됨!
				return arr[i]; //같이 않으면 그 사람이 범인!
			}
		}		
		return arr[arr.length - 1]; //참가자의 마지막이 범인?이다(정렬을 한번 했기 때문..)		
	}
}
