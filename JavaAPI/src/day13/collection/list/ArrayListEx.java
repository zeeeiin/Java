package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 * => 배열기반
		 * => 
		 */
		
		//ArrayList<String> list = new ArrayList<>(); 이렇게 써도 됨. 둘 다 같음		
		List<String> list = new ArrayList<>(); //자식생성해서 리스트 인터페이스에 담는 방식.자주 씀.
		
		//list 추가 add() 기능 - 값이 끝에 들어가는 것
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");
		
		
		//문자열로 확인(반환)
		System.out.println( list.toString() );
		
		
		//길이 확인 size()*** - 배열에서는 length였는데 list에서는 size로 확인 가능하다
		System.out.println( "리스트의 길이:" + list.size() );
		
		
		//중간에 값 추가 add()***
		list.add(0, "0번째 추가");
		System.out.println( list.toString() ); //배열기반
		
		
		//값의 확인 get()*** - get으로 뺀다고 수정하거나 삭제하는게 아니다
		String n = list.get(3); //()안에 index 넣어줘야함. String 반환으로 받으면
		System.out.println(n); //중간에 확인한 값이 삭제되는 게 아니라 그대로 남아있는 상태에서 확인하는 것.
		
		
		//값의 수정 set()
		list.set(4, "홍순자");
		System.out.println( list.toString() );
		
		
		//값의 제거 remove()
		list.remove(0);
		list.remove("신사임당");
		System.out.println( list.toString() );
		
		
		//contains() - 값이 있는지 없는지 확인(여부)
		if(list.contains("홍길동")) {
			System.out.println( "홍길동이 있음" );			
		}
		
		
		//빈 리스트의 확인 isEmpty()
		if( list.isEmpty() ) {
			System.out.println("리스트가 비어있음");
		} else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		
		//전부삭제 clear()
		list.clear();
		System.out.println(list.toString()); //모든 요소를 다 삭제함
		
		
		System.out.println("-------------------------------------------");
		
		//제네릭 <?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭 < ? extends String > = String과 String의 자식들이 들어갈 수 있다는 의미 
		//제네릭 < ? super String > = String타입이 될 수 있다면 전달 가능		
		
//		list.addAll(list) //컬렉션타입이면서 string과 string을 상속받는 자식들이 전달될 수 있다는 의미
		
		//배열을 빠르게 list형태로 전환하는 기능(원하는 값 찾기 빠름)
		List<String> list2 = Arrays.asList("a","b","c","d"); 
		System.out.println(list2.toString());
		
		
		//리스트를 병합 
		list.addAll(list2);
		System.out.println( list.toString() ); //list 값이 통째로..!
		
				
	}

}
