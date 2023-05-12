package day16.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedReader는 입력에 대한 성능향상 보조스트림 입니다.
		 * Reader 클래스와 같이 사용된다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";
		
		;
		
		try(BufferedReader br = new BufferedReader( new FileReader(path)) ) {
			
			//String result = br.readLine(); //한줄씩 읽음
			String result;
			while( (result = br.readLine()) != null) {
				System.out.println(result);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
