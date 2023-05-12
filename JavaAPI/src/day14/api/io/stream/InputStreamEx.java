package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 읽는 데 사용하는 클래스 FileInputStream
		 * 2. 생성자 매개변수에 읽을 파일의 경로가 들어간다.
		 * 
		 */

		//파일명 잊지말고 쓰기..
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\example.txt";

		//InputStream이 부모클래스이다
		//FileInputStream is = new FileInputStream(path); 이렇게 써도 되지만 아래처럼
		//InputStream is = new FileInputStream(path); 이렇게 쓰고 try안에 넣어주기

		try {
			InputStream is = new FileInputStream(path);

			//int result = is.read(); //해당 파일로부터 읽어오는 것. int라 정수로 읽어들임
			//System.out.println(result); //그래서 출력해보면 237 을 읽어옴
			//글자로 받고 싶으면
			//System.out.println( (char)result );
			//이전 클래스에서 한글~ 이라고 만들어서 출력값이 음수값이라 결과가 i로 뜸

			//System.out.println(is.read());

			//1st
			//read()는 하나씩 데이터를 읽고, 더 읽을 값이 없다면 -1을 반환한다.
//			while(true) {
//
//				int result = is.read();
//				if(result == -1) break; //그만 //마지막까지 다 돌면 -1 출력되니까 탈출구문 삽입.
//				System.out.println( (char)result );
//			}
			
			//2nd
			//read(배열) 해당 배열 크기만큼 읽어준다
			byte[] arr = new byte[100];			
			int result = is.read(arr); //읽어들인 크기 반환. 반환이 정수형이다.			
			System.out.println(result); //읽어들인 크기 반환
			//System.out.println(Arrays.toString(arr));
			
			//배열 반복 돌리기
			int i = 0;
			while(true) {
				
				if(arr[i] == 0) break;
				System.out.println( (char)arr[i] );				
				i++;
			}		

			int result2 = is.read(arr); //더 읽을 값이 없다면 -1반환. //배열만큼 읽기
			System.out.println( result2 );
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
