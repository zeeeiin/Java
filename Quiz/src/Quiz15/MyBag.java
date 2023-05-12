package Quiz15;

public class MyBag implements IBag { //static? 상속은 누구에게..?
	//배열 선언, 나 혼자 쓸거라서 private 붙여주기
	private String[] arr = new String[100];
	private	int index;
	
	@Override
	public void insert(String item) {		
		arr[index] = item;
		index++;				
	}		
		
//		for(int i = 0; i <= MyBag.length; i++) {
//			MyBag[i] = item;
//		}
	

	@Override
	public void print() { //null값은 빼고 돌리게하는 반복문으로 넣었어야함
		
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}		
		System.out.println();
	}

	
	@Override
	public int search(String item) {
		
		for(int i = 0; i < index; i++) { //index까지만 돌면 됨!
			if(arr[i].equals(item)) {
				return i; //찾으면 바로 끝낼 것..!
			} //이 경우엔 else는 안 써도 된다 왜냐면 여기서 else를 쓰면 시작하자마자 찾으면 끝나는거임.
		}			
		return -1 ; //없는 경우 -1 리턴
	}

	
	@Override
	public boolean delete(String item) {
		
		if(item == null) return false; //null이 뜨는 경우 이렇게 처리하면 됨
		
		for(int i = 0; i < index; i++) {			

			//찾은 경우의 조건
			if(arr[i].equals(item)) {
				//뒤의 아이템을 당기고 종료. 종료를 안하면 계속 탐색을 할 거라..
				for(int j = 1; j < index-1; j++) { //현재 내 위치에서 출발(만약 중간에 하나 찾았다면)
					arr[j] = arr[j+1];			  //뒤에서 당기기 시작하는 거니까 index-1 시켜야함
				}				
				arr[index-1] = null;
				index--;
				return true;				
			}			
		}		
		return false;
	}

}
