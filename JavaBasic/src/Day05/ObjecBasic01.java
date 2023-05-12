package Day05;

public class ObjecBasic01 {
	
	public static void main(String[] args) {
		
		//기존에 사용하는 방법	
//		add(10);
		System.out.println("=======1번 계산기=======");
		System.out.println( add(10));
		System.out.println( add(20));
		System.out.println( add(30));		
		
		System.out.println("=======2번 계산기=======");
		System.out.println( add2(100));
		System.out.println( add2(200));
		System.out.println( add2(300));
		
		
		
	}
	
	//1번 계산기
	static int result = 0; //변수
	static int add(int a) { //a값을 누적시킬 계산기를 만들 것
		result += a; //a를 누적
		return result;
	} //누적된 60을 가지고 계산을 하고 싶은데 실제로 그렇게 할 방법은 없음..
	
	//2번 계산기 - 기능은 1번과 완전히 똑같은데, 
	static int result2 = 0; 
	static int add2(int a) { 
		result2 += a; 
		return result2;
	}
	
	

	
	
	
}
