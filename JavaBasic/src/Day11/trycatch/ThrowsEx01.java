package Day11.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {

		/*
		 * 메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 throws입니다.
		 * throws구문이 붙어있는 생성자 or 메서드는 예외처리를 대신 진행해야 한다.
		 * 
		 * 즉, 예외처리를 강요할 때 사용된다.
		 * 
		 */

		try {
			greeting(10);

		} catch (Exception e) { 
			System.out.println("에러가 발생했습니다.");
			e.printStackTrace(); //에러가 발생했을 때 에러 로그를 확인하기 위해서 많이 사용한다.
		}
		
		
		//throws의 예시
		try {
			Class.forName("#$%#$%");//잘못된 값이 들어오는걸 방지하기 위해 메서드가 던지는 것을 볼 수 있다
									//forName에 궁금하면 커서 올리고 클릭 => throws 로 해결해야 한다
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
		
		
		//throws의 생성자의 예시
		try {
			new FileInputStream("#$%");
		} catch (Exception e) { //Exception?
			System.out.println("에러가 발생했습니다.");
		}
		System.out.println("프로그램 정상종료");		
	}

	private static String[] arr = {"hello", "bye", "say good bye"};

	//만약 index를 계속 여기저기서 쓰면 어차피 에러가 생길테니
	//직접 에러처리가 의미가 없어지기 때문에 throws사용해주기	
	public static void greeting(int index) throws Exception {

		System.out.println(arr[index]);
	}


}
