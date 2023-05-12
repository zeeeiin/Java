package Day03;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		int[] newArr = new int[arr.length  +1];
		
		int data = 100; //중간에 추가할 값
		int targetIndex = 2; //추가 할 위치(어느 위치에 넣을지 지정하는 것)
		
		//2번 위치에 100을 넣겠다는 것.> 10,20,100,30,40,50
		//사이즈가 6인 배열에서 먼저 arr배열을 옮겨오고, 30번째부터 뒤로 밀어서 100을 중간에 추가하는 방법.
		
		
		//newArr의 기존 배열값을 옮길 것
		for(int i = 0; i <arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		 System.out.println(Arrays.toString(newArr));
		
		//배열의 추가할 인덱스~ 마지막-1까지 옮겨담는 작업
		 //배열의 마지막부터 ~ 타겟 인덱스까지 옮겨담는 작업
		for(int i = newArr.length-1; i>targetIndex; i--) {
			newArr[i] = newArr[i-1];		
		}
		
		//인덱스번째에 데이터 추가
		newArr[targetIndex] = data;
		
		//arr을 newArr로 변경
		arr = newArr; //arr에 newArr을 담고 밑에서 삭제
		
		//이렇게 되면 new는 필요없기때문에 완전삭제
		newArr = null; //완전삭제
		
		//arr과 null은 같은 값이 될 수 없다.
		
		System.out.println(Arrays.toString(arr));
		
	}
}
