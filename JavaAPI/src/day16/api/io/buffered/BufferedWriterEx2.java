package day16.api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx2 {

	public static void main(String[] args) {

		/*
		 * flush() - 중간중간 파일을 즉시 쓰고 싶으면 flush() 를 사용한다.
		 * 버퍼라이트가 끝나면 자동으로 flush() 나감
		 */

		Scanner scan = new Scanner(System.in);
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\test2.txt";
		
		try( BufferedWriter bw = new BufferedWriter( new FileWriter(path, true)) ){
									//newFileWriter()안에 생성자매개변수의 객체가 이 자리에 들어옴) 
			System.out.print(">");
			String word1 = scan.next();
			bw.write(word1);
			bw.flush(); //버퍼에 있는 내용을 내보낸다.
			
			System.out.print(">");
			String word2 = scan.next();
			bw.write(word2);
			
			System.out.println("파일 출력 완료");

		} catch (Exception e) {
			e.printStackTrace();
		}	

	}

}
