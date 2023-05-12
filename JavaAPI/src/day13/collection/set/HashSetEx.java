package day13.collection.set;

import java.util.Set;

import java.util.*;

public class HashSetEx {
	
	public static void main(String[] args) {
		
		/*
		 * 리스트와 완전히 반대이다 (순서 x, 중복 x)
			인덱스 기준으로 조회하는 메서드가 없다			
			동일한 값을 저장하면, 들어가지 않는다			
			set계열 순회할 때는 향상된 for문, 반복자 개념을 사용해야 한다.
			
			HashSet 클래스 ( Hash 알고리즘 이용 )			
			TreeSet 클래스 ( Set + 정렬/ Tree 구조 )
		 * 
		 * 
		 */
		
	//	HashSet<String> set = new HashSet<>();		
		Set<String> set = new HashSet<>();
		
		
		//add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java"); //중복 사용하지 않는다. X		
		
		//
		System.out.println(set.toString());
		//집어 넣을 때랑 값을 뺄 때는 랜덤하게 지정된다
		
		//값을 빼보고 싶은데 get 함수가 없음
		
		//크기
		System.out.println("크기:" + set.size());
		
		//삭제(값)
		set.remove("python"); //정확히 일치하는 값으로 지울 수 있다
		//removeAll - 어떤 리스트나 set 을 넣으면 그 안에 있는걸 전부 삭제해주는 기능
		
		System.out.println(set.toString());
		
		//순회 = >내부적으로 반복자(Iterator)의 개념을 사용해서 회전
		//인덱스 요소가 없는 애들을 하나씩 반복해서 확인
		for(String s : set ) { //순서대로 회전 가능
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------------");
		
		//set=>iterator 타입(반복자)으로 변경
		Iterator<String> iter = set.iterator(); //구조를 Iterator String타입으로 바꿔준다.(반환받을 수 있다)
		//이런 구조형태로 set값을 반환받을 수 있다
	
		System.out.println( iter.next() ); //전진
		
		//다음을 갖고있는지 없는지 확인해주는 작업
		while(iter.hasNext()) { //다음이 있다면 true
			System.out.println(iter.next());
		}
		
		
		
	}

}
