package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.Writer;
import java.io.*;

public class BufferWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙으면 입출력을 빠르게 하는 성능 향상 (보조)스트림
		 * 
		 * 보조스트림이라 부르고, Reader, Writer, InputStream, OutputStream과 같이 사용된다.
		 * 단독 사용 불가능.
		 */
		
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test.txt";
		
		//문자를 쓰고 빨리 읽을거라 Writer
		//Writer fw = new FileWriter(path);		
		//BufferedWriter bw = new BufferedWriter(fw); //Writer의 fw 전달받음
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter(path)); //위에서 만든 걸 한 번에 넣어주는 것.
		//BufferedWriter 기존 내용을 덮고 새롭게 쓰는 것
		
		
		//Writer객체 두번째 매개변수에 true주면, 기존파일에 추가한다.
		//true 유무에 따라 기존파일 + a. 실행할 때마다 누적 됨
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)) ) {
			
			String str = "오늘은 날씨가 맑습니다\n내일은 쉽니다.\n"; // \r은 운영체제마다 달라서 써줄 땐 써줘야함.			
			bw.write(str);			
			
			System.out.println("파일 쓰기 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
