package Day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//삭제의 개념 - 배열은 삭제가 없다.
		//지운다는 개념자체가 없음 그냥 0이 되는것.(구멍뚫림 - 값이 수정되는 개념)
		//뒤에있는걸 앞으로 당겨야함
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(arr.length);		
		
		//원본배열의 사이즈보다 하나 작은 사이즈로 만들어야함. 
		int[] newArr = new int[arr.length -1];  //삭제한 후 복사할 새로운 배열
		
		int index = 5; //삭제할 위치		
		for(int i = index; i < arr.length-1; i++) { 
			arr[i] = arr[i+1];
		}
		 System.out.println(Arrays.toString(arr));
		
		 
		 //새로운 배열에, 기존배열을 옮겨 담는 작업을 하면 된다.
		 for(int i = 0; i < newArr.length; i++) {
			 newArr[i] = arr[i];
		 }
		 
		 //기존 arr는 지울 것.
		 arr = null;
		 
		 System.out.println(Arrays.toString(newArr));
		 
	}
}
