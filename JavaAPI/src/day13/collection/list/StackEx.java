package day13.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		
		/*
		 * Stack
		 * => Last in, Fist Out (후입선출)
		 * => push(), pop()
		 */
		
		
		//만약 이 기능의 구현이 List에 있다면 자식인 Stack을 만들어 
		//List<String>으로 저장하면 사용이 가능 > 대신 고유한 stack기능이 사라짐
		Stack<String> stack = new Stack<>();
		
//		stack.push(); //근데 List<String> ~~으로 하면 push기능 사용 불가해짐
		
		
		//값의 추가
		stack.push("홍길동");
		stack.push("이순신");
		stack.push("홍길자");
		
		//형태를 문자열로 확인해주는 메서드
		System.out.println( stack.toString() );
		
		stack.pop(); //값을 제거하는 동시에 어떤 값이 빠졌는지 확인도 가능. 지금 값이 빠진 것
		System.out.println( stack.toString() );
		
		//빠진 값 확인 하고 싶을 때
		String n = stack.pop();
		System.out.println( stack.toString() );
		System.out.println( "pop:" + n );
		
		
		
	}
}
