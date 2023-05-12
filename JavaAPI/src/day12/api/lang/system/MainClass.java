package day12.api.lang.system;

public class MainClass {
	
	public static void main(String[] args) {
		
		//System 클래스는 전부 static 메서드로 선언되어있다.
		
		//System.exit(0); - 시스템종료
		
		//UTC - (지구에서의)세계 기준시(영국의 위치기준) 우리나라는 영국시간+9시간
		//1970년 1월 1일 ~ 현재까지 시간을 밀리초로 반환
		//간단한 프로그램 시간체크. 밀리초면 상세한 시간..!
		long start = System.currentTimeMillis(); //반환이 long 타입이라 이렇게 받을 수 있다
		
		//시간이 얼마나 걸리는지 시간을 체크할 때 쓰는 편		
		
		long sum = 0;
		for(long i = 0; i < 100000000; i++) { //1000000만큼 더하는데 걸리는 시간. 
			sum += i;
//			System.out.println(i); //출력까지 더해주면 어마어마..
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println( (end - start) * 0.001); // 1000/1초라서..
		
	}

}
