package Quiz17;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception {
		/*
		 * 1. 스캐너로 정수 2개를 입력받아 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환. >> 문자열 입력시 에러 <<
		 * 3. 예외가 발생하면, 직접 예외를 생성하고 예외 메시지를 외부로 전달하면 된다.
		 * 4. scan.close() 작업은 finally에서 처리하세요.
		 */


		Scanner scan = new Scanner(System.in);

		try {
			
			int num1 = scan.nextInt();	//입력받은거에서 예외가 있으면 캐치로 가야함
			int num2 = scan.nextInt();	//여기서 예외가 생기면 가장 가까운 catch문으로 이동한다. (throws Exception으로 가거나)
			
			return num1 + num2; //정상입력시 여기서 리턴하고 끝
						
		} catch (Exception e) { //잘못된 입력시 여기로 와서 아래부분 출력
			throw new Exception("문자를 입력하세요"); //예외생성 >> 이걸 throws로 넘겨줄 것. 맨위로!
		} finally {
			scan.close();
		}
	}

}
