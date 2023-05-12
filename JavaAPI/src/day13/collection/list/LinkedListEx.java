package day13.collection.list;

import java.util.*;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		/*
		 * LinkedList
		 * => 순서o, 중복 o
		 * => 노드객체(양방향 연결리스트)
		 * 삽입,삭제는 ArrayList보다 좋으나, 탐색은 느리다.
		 * 자식이 무슨 타입이던 간에 리스트에 저장됐으면
		   리스트처럼 기능 사용 가능
		   근데 링크드 리스트는 사용할 수 있는게  더 생긴다
		   offer/ poll / peek 기능 쓸 수 있게 됨
		   Queue
		*/
		
		
		LinkedList<Integer> list = new LinkedList<>();
			
		//list와 기능은 동일하다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(3,10);//3번째 인덱스에 10 추가
		System.out.println(list.toString());
		
		
		//값 얻기 get()
		int n = list.get(3);
		System.out.println( n );
		
		//값 삭제 remove() 
		list.remove(3);
		System.out.println(list.toString());
		
		//기본적으로 여기까진 list와 기능 비슷함
		
		System.out.println("----------------------------------");
		
		//linkedlist는 queue의 기능을 구현하기 때문에 queue기능 사용 가능.
		
		//선입
		list.offer(10);
		list.offer(11);
		
		System.out.println(list.toString()); //뒤에 값을 추가한 걸 볼 수 있다.
		
		
		//어떤 값이 빠지는지 반환받을 수 있다
		int r = list.poll();
		System.out.println(r);
		System.out.println(list.toString());
		//offer로 밀어넣으면 poll했을 때 맨 앞에 있던게 빠진다.
		
		
	}

}
