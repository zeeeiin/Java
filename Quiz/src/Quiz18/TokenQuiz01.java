package Quiz18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
		 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
		 * 3. 분리한 토큰의 개수를 출력
		 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
		 *    1. 안녕
		 *    2. 하세요.
		 *    3. 오늘은 
		 * 5. 분리된 문자열을 배열에 저장
		 */


		Scanner scan = new Scanner(System.in);

		System.out.println(">");
		String word = scan.nextLine();

		StringTokenizer st = new StringTokenizer(word); //그냥 넣어도 공백 기준으로 분리된다.

		//배열에 저장하겠다
		String[] arr =  new String[st.countTokens()]; //토큰의 크기만큼!

		for(int i = 1; st.hasMoreTokens(); i++) {

			String str = st.nextToken();
			arr [i-1] = str;

			System.out.println( i + "." + str);
		}	
		//			System.out.println( i + "." + st.nextToken());
		//			arr[i-1] = st.nextToken();
		//이렇게하면 문제가 생김. 바로 위에서 한 번,여기서 두 번 전진하는거라 안 되는 것
		//한 번만 실행되게끔 해야한다. 이럴 때 변수에 저장해서 쓰면 됨!

	}

}
