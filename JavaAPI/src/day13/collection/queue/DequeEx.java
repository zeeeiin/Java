package day13.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		
		//Deque에 넣어도 값은 같다
//		ArrayDeque<Integer> que = new ArrayDeque<>();
		Deque<Integer> que = new ArrayDeque<>();
		
		
		//offer라도 뒤에서 들어간다.
		//뒤에서 추가
		que.offerLast(1);
		que.offerLast(2);
		que.offerLast(3);
		que.offerLast(4);
		
		System.out.println(que.toString());
		
		
		//앞에서 꺼내기 (뒤에서 꺼낸거라..)
		int n = que.pollFirst();
		System.out.println("반한된 원소:" + n);
		//list와는 다름
		//꺼내는 동시에 자동으로 원소를 삭제하고 보여준다
		
		que.pollFirst();
		que.pollFirst();
		que.pollFirst();

		System.out.println(que.toString());
		
		System.out.println("--------------------------------------------------");
		
		//앞에서 추가
		que.offerFirst(1); //poll Last로 꺼내야함
		que.offerFirst(1); 
		que.offerFirst(1); 
		que.offerFirst(1); 
		
		System.out.println(que.toString());
		
		//뒤에서 꺼내기
		que.pollLast();
		System.out.println(que.toString());
		//현재  que 상태 => [4,3,2]
		
		
		//[4,3,2]
		//앞 혹은 뒤에서 list의 get처럼 앞에서 or 뒤에서 값을 확인만하기
		System.out.println(que.peekFirst());
		System.out.println(que.peekFirst());
		//피크로 값만 확인
		//4만 나옴. 실제로 지우는게 아니라 값만 꺼내주는 것.
		
		//큐는 변함이 없음
		System.out.println(que.toString());
		
		
		
		
		
		
	}
	
	
}
