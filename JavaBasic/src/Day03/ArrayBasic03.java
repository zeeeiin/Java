package Day03;

public class ArrayBasic03 {

	public static void main(String[] args) {
		
		//크기가 100인 배열에 1~100까지의 수를 저장.
		//배열은 크기가 고정되어 있다.
		
		int[] arr = new int[100];
		
		for(int i = 0; i< arr.length; i++) { //0번째부터 배열의 길이 미만이다.
			arr[i] = i+1;				//i번째에 이 값을 넣어준다는 의미.
			
		}	//System.out.println();
		
		
		////배열 요소의 문자열 합////
		String str = ""; //나열하듯이 출력하기 위해 string 활용
		for(int i = 0; i <arr.length; i++) {
			//문자열에 배열요소를 붙이고 공백을 붙일 것...
			str += arr[i] + " "; //이 배열값을 문자열에 더해서 한방에 출력하겠다
		}	System.out.println(str); //문자열을 한번에 출력하기위해 이렇게 쓰는 것.
		
		
	}
}
