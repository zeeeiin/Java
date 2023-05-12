package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class QuickInsert {

	public static void main(String[] args) {

		//여태 입력을 스캐너로 썼음 => 
		//자바에서 빠른 입력을 사용하려면 BufferedReader

		/*
		 * InputStreamReader는 (빠른 입력)
		 * 1byte 데이터를 2byte 기반으로 변경
		 * InputStreamReader을 리더 클래스 형태로 변경
		 * 
		 */

		//System.in 이 InputStreamReader() 안에 들어갈 수 있다
		//Reader타입에 저장됨
		//Reader new rd = InputStreamReader( System.in ); //1byte 단위로 읽음
		//BufferedReader bw = new BufferedReader(rd); //()안에 reader클래스가 들어갈 수 있음
		//원래 이게 java 입력의 정석...
			

		try {
			BufferedReader bw = new BufferedReader( new InputStreamReader( System.in ) );
			// >>이걸 편하게 해주는 애가 Scanner
			
			System.out.println(">");
			String name = bw.readLine();

			System.out.println(name); //입력받은 결과

			
			bw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
