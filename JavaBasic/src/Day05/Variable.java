package Day05;

public class Variable {
	
	//int a; 멤버변수
//	a = 10; 클래스 바로 아래에는 선언만 가능 이렇게 값 지정 안 됨
	//꼭 쓰고 싶다면 메서드 안에서 써야한다!
	
	int a = 1; //이건 선언(동시에 초기값지정)이니까 가능
	String b; //초기값이 없지만 쓸 수 있다. 자동으로 초기값이 0이 되기 때문
	
	void printNum(int d) { //매개변수도 지역변수
							//매개변수도 호출할 때 꼭 전달하게 되니까 예외적으로 사용가능
		int c = 1; //지역변수 
		
		System.out.println("멤버변수:" + a);
		System.out.println("멤버변수:" + b);
		System.out.println("지역변수:" + c); //지역변수 안에 선언돼서 사용이 안됨
		System.out.println("지역변수(매개변수):" + d);
		
	}
	

}
