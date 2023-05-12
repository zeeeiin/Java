package Day03;

public class ArrayBasic02 {

	public static void main(String[] args) {
		/*
		//배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10
		
		//배열의 길이가 긴 경우 반복문으로 결과를 출력해줄 것
		
		int a = 0; //1이 아닌 0(인덱스번호)로 설정해줘야한다.
		while(a < arr.length) { 	//배열이 9번 인덱스까지 있기 때문에 9라고 적어야한다.
					  				//하지만 나중에 배열 값이 증가하면 또 번거로워지니
					  				//arr.length -1 (=9) 라고 해놓으면 된다.
									//length 미만까지 돌게 하면 된다.
			
			System.out.println("배열의" + a + "인덱스:" + arr[a]); //a번째 arr[a] 라고 생각해도 이렇게 넣으면 에러남
			//0번째 인덱스로 시작하고 마지막은 9번째 인덱스
			
			a++;			
		}
*/
		
		//배열값들의 합(index가 아닌 배열값들의 합)
		
		int[] arr3 = {1,2,3};
		
		int b = 0;
		
		int sum = 0;
		
		while(b< arr3.length) {
			sum += arr3[b]; //배열의 요소들의 합	 sum = sum +arr3[b]
			b++;
		}
			System.out.println("배열요소의 합:" + sum);
		
		
	}

}
