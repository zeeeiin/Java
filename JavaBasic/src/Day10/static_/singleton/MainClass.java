package Day10.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		//Singleton s = new Singleton();
		//메서드 호출하면 객체반환이 된다
		
				
		//객체생성할 땐 이렇게 호출해주는게 맞음
		//static으로 만들어진 new Singleton();이 나오는 것.
		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
	
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		//자기자신을 반환시켜 무조건 하나만 만들어지게 하는 것
		//그래서 여러번 호출해도 똑같은 값이 나오는 것
		
		System.out.println(s.getDomain());
		System.out.println(s1.getDomain());
		System.out.println(s2.getDomain());
		
	}
}