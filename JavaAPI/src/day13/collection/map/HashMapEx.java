package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Map인터페이스를 구현하는 클래스 HashMap
		
		//key에 대한 타입과 value에 대한 타입을 지정
		//탐색이 빠르다.
		
		//HashMap<Integer, String> map = new HashMap<>();
		//hashmap으로 생성해서 map 인터페이스에 넣는걸 많이 쓴다. 위아래 같음
		Map<Integer, String> map = new HashMap<>();
		
		
		//맵에 값을 저장 put(키, 값)	
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		
		//문자열로 맵의 결과 출력(배열기반이 아님)
		System.out.println( map.toString() );
		System.out.println( map.size() );
		
		//맵에 동일한 키를 저장하면? 값이 변경된다
		map.put(4, "강감찬");
		System.out.println( map.toString() );
		//값이 추가되지 않고 바로 수정된다.
		
		
		//맵의 값을 얻기 get(키) : 값을 반환
		String item = map.get(3);
		System.out.println("3번 키에 대한 값:" + item);
		
		
		//key의 유무 확인 containsKey(키)		
		if( map.containsKey(3)) {
			System.out.println("3번 키가 존재함");
		}
		
		
		//맵의 삭제 remove (키)
		map.remove(4);
		System.out.println(map.toString());
		
		
		//맵의 순회
		Set<Entry<Integer, String>> entrySet = map.entrySet(); //맵 => set으로 변경
		//set의 < > map에 있는 엔트리를 다 넣어주는 것
		//엔트리를 꺼내서 다 셋에 넣어주는 형태
		
		
		//entry엔 키와 값을 꺼낼 수 있는 기능이 있다		
		for(Entry<Integer, String> entry : entrySet) {			
			System.out.println( entry.getKey() );
			System.out.println( entry.getValue() );			
		}
		
		System.out.println("--------------------------------------------");
		
		//방법 2 키만 꺼내는 케이스.
		//key만 꺼내서 set으로 저장해주는 것.
		Set<Integer> set = map.keySet(); //set타입의 integer로 반환해주기
		System.out.println( set.toString() );
		
		for(int key : set) { //key만 꺼내서 set에다 저장
			System.out.println(key);
			System.out.println(map.get(key)); //map의 get함수에게 key 전달해주는 것
		}
	
		System.out.println("--------------------------------------------");
		
		//맴에 객체를 담는 유형
		Map<Integer, Object> map2 = new HashMap<>();
		//키는 정수형으로 하는데 값은 뭐든 다 받게 하고 싶은 경우 Object로!
		
	}	
}
