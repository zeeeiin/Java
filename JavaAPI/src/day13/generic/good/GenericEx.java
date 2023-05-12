package day13.generic.good;

import java.util.*;

public class GenericEx {
	
	public static void main(String[] args) {

		//제네릭 <?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭 < ? extends String > = String과 String의 자식들이 들어갈 수 있다는 의미 
		//제네릭 < ? super String > = String타입이 될 수 있다면 전달 가능		
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		//list1 을 매개변수로 주거나 받을 수도 있음 return으로
		//<?> 와일드카드는 뭐든 다 받을 수 있다는 의미
		
		add1(list1); //o
		add1(list2); //o
		add1(list3); //o
		
		add2(list1); //String o
		//add2(list2); //integer x
		//add2(list3); //object x
		
		
		//형변환을 통해 String이 될 수 있기 때문에 가능
		add3(list1); //String o
		//add3(list2); //integer x
		add3(list3); //Object o
		
		
		
		
		
	}
	
	public static void add1(List<?> list) {
	// 제네릭타입 생략 가능. ?면 어떤 제네릭타입이든 list 다 전달 가능
	}
	
	public static void add2 (List <? extends String> list) {
	//String 이나 String의 자식들만 들어갈 수 있다
	}

	public static void add3 (List <? super String> list) {
	//String 타입을 가지면 전달할 수 있다는 의미
	}
	
}
