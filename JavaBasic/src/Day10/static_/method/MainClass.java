package Day10.static_.method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01(); //일반
		c.method02(); //static
		
		//static메서드의 사용
		Count.method02();
		
		//main 과 연관지어 생각, main은 static 이라서 같은 static 호출이 가능
		//main 은 넣고싶은 곳 아무데나 다 넣을 수 있다
		//하지만 실제로 사용할 객체에 넣는 건 좋지 않다
		//분리해 주는게 좋다.
//		MainClass mc = new MainClass();
//		mc.test();
		
		
		//static 메서드의 사용예시
		Math.random();
		Arrays.toString(new int[3]);
		Integer.parseInt("3");
		String.valueOf(3);
		
		
	}
	
//		public void test() {}
//		//바로 사용하고 싶으면 MainClass를 객체로 만들면 test메서드 호출이 가능하다

	
	
}
