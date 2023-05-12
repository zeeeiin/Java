package Quiz19;

import java.util.*;

public class ListQuiz01 {

	public static void main(String[] args) {

		/* List 1번
		 * 1. list 에 1~20까지 값을 순서대로 저장
		 * 2. list에 값을 순서대로 출력.반복문을 돌려라..	
		 * 
		 */

		//		배열을 썼다면
		//		int[] arr = new int[20];
		//		arr[인덱스] = 1; 이런식으로 했겠지만 arraylist 쓸 것 (사용하는 구문이 바뀌는 것)
		//전부 제네릭으로 사용될 것..		

		//이 유형으로 많이 씀. 이 리스트 하나로 구현이 가능해서 이 형태로 많이 쓴다
		//맨 앞에 ArrayList로 써도 됨
		List <Integer> list  = new ArrayList<>();

		for(int i = 1; i <= 20; i++) { //원하는 값 넣을거니까 length 쓰지 않아도 됨.
			list.add(i);			
		} 

		//반복을 돌려서 출력 할 땐 for문으로..
		for(int i = 0; i < list.size(); i++) { //size로 리스트 크기 확인
			System.out.println(list.get(i)); //값을 꺼내겠다. get 사용하기			
		}



		/*
		 * List2번
		 * 1. User를 저장하는 list 생성
		 * 2. 3개의 각각 다른 User객체를 만들고 순서대로 저장
		 * 3. User객체 안에 홍길동이 있으면 해당 객체의 name, age를 출력하는 코드를 만드시오.
		 * 4. User객체 안에 홍길자가 있으면 해당 객체를 삭제(하는 코드 만드시오.)
		 * 3,4번은 다른 것
		 */

		//제네릭 타입에 리스트 넣으면 됨
		//리스트에 유저객체 넣을거라면 통째로 들어간 형태일 것
		//<User>라고 해야 유저 객체 사용 가능
		List<User> lists = new ArrayList<>(); //이렇게 만들고 나면 User 타입이 생성되어 쓸 수 있다

		User u1 = new User("홍길동", 10);
		User u2 = new User("홍길복", 20);
		User u3 = new User("홍길자", 30);

		lists.add(u1);
		lists.add(u2);
		lists.add(u3);

		System.out.println( lists.toString() ); //주소값 나옴

		//전체 반복이 돌아야함

		for(int i = 0; i < lists.size(); i++) {

			User u = lists.get(i); //리스트안에 들어있는 유저 객체를 꺼내는 것. 유저타입으로 받을 수 있어서 User u = 써주기
			//u 변수에 담은 것

			String name = u.getName(); //홍길동을 꺼냈다는 의미.유저에서 겟함수로 이름 꺼내기

			if(name.equals("홍길동")) {
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}

			/*
			//더 줄여서 쓰는 방법 (길어짐)
			User u = lists.get(i);
			if(u.get(i).getName().equals("홍길동"))  {//get(i)=>유저타입
				System.out.println(u.getName());
				System.out.println(u.getAge());
			}	
			 */
		}

		System.out.println("-----------------------------------------------------");

		//홍길자가 있으면 삭제
		for(int i = 0; i < lists.size(); i++) {

			User u = lists.get(i); //유저객체를 꺼냄
			if( u.getName().equals("홍길자")) { 
				lists.remove(i);
			}	

		}

		System.out.println(lists.toString());
		
	}


}
