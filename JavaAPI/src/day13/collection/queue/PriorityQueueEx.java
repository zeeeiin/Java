package day13.collection.queue;

import java.util.Queue;
import java.util.*;

public class PriorityQueueEx {

	public static void main(String[] args) {

		/*
		 * Priority (우선순위 큐)
			⇒ 정렬기능을 포함			
			집어넣을 때 마다 자동으로 그 값을 정렬			
			⇒ PriorityQueue클래스가 구현함		
		 */

		//우선순위 지정
		System.out.println("홍길동".compareTo("홍길자"));//홍길동이 사전적으로 앞에 위치 => 음수 (오름차ㅅ
		System.out.println("홍길자".compareTo("홍길동"));//홍길자가 사전적으로 뒤에 위치 => 양수
		
		//Integer도 상속받아서 compareTo 메서드를 갖고 있다
		//그래서 우선순위를 확인해서 대소비교가 가능. 근데 유저객체는 없음
		Queue<Integer> que = new PriorityQueue<>();//que인터페이스 구현;
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);

		System.out.println(que.toString());
		
		System.out.println(que.poll()); //1
		System.out.println(que.poll()); //3
		System.out.println(que.poll()); //4
		System.out.println(que.poll()); //5
		System.out.println(que.poll()); //6
		//1 3 4 5 6 순서로 뜸
		//우선 값을 갖고 있는 요소를 꺼내주는 역할
		//차순 순서로 정해져서 나온다고 생각하면 됨

		System.out.println(que.toString()); //출력해보면 비어있음
		
		System.out.println("--------------------------------------------------");
		
		//User 객체를 담을 수 있는 큐		
		//큐가 순서를 확인할 때 compareTo 메서드를 확인한다.
		//compareTo에 정의된 순서에 의해 우선순위를 정한다.
		//객체가 우선순위를 가지게 하려면
		//comparable 인터페이스를 상속받아서 compareTo 메서드를 오버라이딩해서 가지면 된다.
		
		Queue<User> queue = new PriorityQueue<>(); //큐 인터페이스 타입에 저장
		
		queue.offer( new User("홍길동", 10) ); //객체를 만들어 offer에 넣은 것
		queue.offer( new User("홍길자", 20) );
		queue.offer( new User("홍길순", 30) );
		queue.offer( new User("신사임당", 40) );
		//우선순위 객체에서 queue를 넣으려면 에러가 발생한다
		//객체에선 순서를 정할 수 없음.
		//User 객체의 멤버변수 값들의 순서를 확인해서 우선순위를 정할 수 있다.
		
		//System.out.println("가장먼저나온객체 이름:" + queue.poll().getName() );

		System.out.println(queue.toString());//주소값이 toString으로 대체돼서 나옴.이걸 해야 보임..
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());



	}	

}
