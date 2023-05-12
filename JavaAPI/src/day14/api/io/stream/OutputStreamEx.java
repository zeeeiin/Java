package day14.api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * 파일을 쓸 때 사용하는 클래스는 FileOutputStream 이다. 
		 * 생성자 매개값으로 파일을 쓸 경로가 들어간다.
		 * OutputStream out = new FileOutputStream(path); 
			//근데 만들고 나면 에러남
		 * io 패키지 거의 모든 클래스들은 생성자에 throws가 걸려있다. 
		 * 그래서 반드시 예외처리 문장 안에서 사용해야한다.
		 * 경로 잘못입력하면 에러나니까 예외처리 문장에서 쓰라는 것.
		 * 
		 */
																//example.txt에 65를 쓰겠다는 의미
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";
		
		//FileOutputStream out = new FileOutputStream(path);
		
		try {
			OutputStream out = new FileOutputStream(path);
			
			//1st 
			//out.write(65); //현재 int byte 쓴 것. 근데 또 다른 에러가 남
			//out.write(66);
			//out.write(67); //확인해보면 메모장파일에 ABC라고 쓰여져있고, 글자가 덮여져있음
			
			
			//2nd 			
			//byte[] arr = {65, 66, 67, 68, 69}; //배열에 들어있는 데이터를 한 번에 씀
			//out.write(arr);
			//출력하면 배열 안에 들어있는 값(이진데이터)을 한 번에 쓴다.
			
			//3nd 파일 데이터 옮길 때 쓰는 것
			String str = "한글~"; //한글은 1byte기반으로 쓰기엔 적합하지 않다. //"ABCDEFG";
			byte[] arr = str.getBytes(); //문자열을 바이트배열로 변환
						
			out.write(arr);
			
			out.close(); //자원해제
	
		} catch (Exception e) {//FileNotFoundException 했다가 위에서 에러나서 모든 에러를 받을 수 있는 exception으로 바꿈
			e.printStackTrace();
		}
		
		
		//객체지향 원칙 중 하나 - 추상화(부모타입을 사용)
		
	}
}
