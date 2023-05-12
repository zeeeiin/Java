package Day11.trycatch;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		
		try {
			int result = sum(-10);
			System.out.println(result);
		
		} catch (Exception e) {
			String msg = e.getMessage(); //예외 메시지를 문자열로 반환하는 기능
			System.out.println(msg);
//			System.out.println("예외가 발생해서 메서드가 종료됨");
		}		
	}
	
	public static int sum(int n) throws Exception {
		//void가 아니면 다 리턴이 들어가야함
		
		//예외를 직접 생성해서, 메서드를 종료할 때 사용할 수 있다.		
		if(n < 0) {
			throw new Exception("0 이상의 값이어야 합니다"); //에러 직접 생성. 디테일 메세지에 저장이 됨
		}	//예외를 생성할 때, 예외에서 사용되는 메시지를 전달할 수 있다.
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i; //n까지의 합
		}
		
		return sum;
	}
	
	
}
