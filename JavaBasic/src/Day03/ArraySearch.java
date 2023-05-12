package Day03;

public class ArraySearch {

	public static void main(String[] args) {
		
		//큰 값 찾기
		int[] arr = {54, 23, 12, 76, 99, 1, 2, 3};
		
		//배열의 값을 다 확인하고 가장 큰 값을 찾아내야한다. => 변수활용
		//큰 값을 저장하는 변수를 만들어야함
		
		int max = 0; //큰 값을 저장할 변수		
		int i = 0;
		while(i < arr.length) {
			
			//우선, 위에서 변수(max)를 만들고 조건을 만들어야함
			if(max < arr[i])  {   //현재 저장된 값보다 배열 요소가 클 떄
				max = arr[i]; //max 를 arr[i]로 저장하면 된다.
			}
			i++; //순서대로 어떤 변수와 배열의 값을 확인하고 비교해서 저장하게 하는 방식.
		}
		
		System.out.println("가장 큰 값:" + max);		
		
	}
}
