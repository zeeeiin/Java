package day15.api.io.readwrite;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
	
	public static void main(String[] args) {
		
//		FileWriter fw= new FileWriter(); 이렇게 해도 됨
		
		/*
		 * 문자를 써서 저장할 때는 2바이트 기반 클래스 FileWriter()를 사용한다.
		 * 
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\text.txt";
		
		
		try (Writer fw= new FileWriter(path) ){ //writer 도 closeable 상속받음
			
			// \n 줄바꿈
			// \r 캐리지리턴(맨 앞으로 당기기)
			
			String str = "그만 좀 자세요. \n\r그만 일어나. \n\r집에 가야지."; //줄바꿈도 명령문이니까 \n 넣어주기
			fw.write(str);			
			//char 배열이라 읽고 들어오는데도 문제가 없다. 정상적으로 실행 됨
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
