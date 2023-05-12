package day12.api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {
		
//		Math.abs(-3);
//		Math.random(); //반환이 더블형이니까 정수로 반환받으려면 형변환
		
		double d = Math.random();
		System.out.println(d);
		
		int r = (int)(Math.random() * 10) + 1; //1~10
				
		double d1 =Math.abs(-3.14); //절대값 구하는 것
		System.out.println(d1);
				
		double d2 = Math.ceil(3.14); //올림
		System.out.println(d2);
		
		double d3 = Math.floor(3.14); //내림
		System.out.println(d3);
				
		double d4 = Math.round(3.5); //반올림
		System.out.println(d4);
		
		int d5 = Math.max(3, 5);
		System.out.println(d5); //큰 수 반환
		
//		Object[] arr = {래퍼클래스, 래퍼클래스 ..}; //객체참조타입 배열이라 이 안에 정수가 원래는 못 들어가는데 들어감
		//숫자도 오브젝트의 자식 타입이어야 중괄호 안에 들어갈 수 있는데
		
		
			
	}

}
