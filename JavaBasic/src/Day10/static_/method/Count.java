package Day10.static_.method;

public class Count {

	public int a;
	public static int b;
	
	
	//일반 메서드 - 일반멤버와 정적멤버 모두 사용이 가능
	public int method01() {
		a = 10;
		b++; //b는 하나씩 증가
		return b; //정수반환
	}
	
	//정적 메서드 - 일반멤버를 사용할 수 없음, 정적멤버는 사용 가능
//				 단, 객체 생성을 통해서는 일반멤버 사용이 된다.
	public static int method02() {
//		a = 10; //a는 사용 불가. static 이 생성될 당시에 a변수는 없기 때문에 a를 참조할 수 없는 것.
				//a는 객체로 뽑혀야하기 때문.
		//a를 사용하고 싶으면 직접 만들면 된다
		Count c = new Count();
		c.a = 10; // 직접 개체 생성해서는 사용이 가능하다.
		
		b++; //같은 클래스 안에 있어서 사용 가능
		return b;
	}		
	
}
