package Quiz20;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해 파일명을 입력받는다.
		 * 2. 입력받은 파일을 filecopy폴더로 복사해서 옮겨주면 된다.
		 * 3. 자원해제주의!
		 * 
		 */


		//Scanner도 closeable을 받고 있다
		Scanner scan = new Scanner(System.in); 

		System.out.println("파일명>");
		String name = scan.next();

		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + name; //읽을 경로
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\" + name ; //나갈 경로

		try( InputStream in = new FileInputStream(readPath);
			 OutputStream out = new FileOutputStream(writePath); ) {

			//배열 선언
			byte[] arr = new byte[2048];
			int result;			 // = in.read(arr); 하면 오류남
			while( (result = in.read(arr)) != -1) { //읽고 저장하고 실행하고의 반복				
				out.write(arr, 0, result); //3가지변수를 줘서 옮겨주는 작업
			} 
			
			System.out.println("파일 복사 완료");
			
		} catch (Exception e) {			
			e.printStackTrace();
		}

	}
}
