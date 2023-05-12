package day14.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyEx {

	public static void main(String[] args) {

		/*
		 * FileInputStream, FileOutputStream은
		 * 동영상, 이미지 파일을 읽거나 쓸 때 사용한다.
		 */

		//해당 폴더 안의 파일명까지 꼭 들어가야함.
		String readPath = "C:\\Users\\user\\Desktop\\course\\java\\file\\메서드1.mp4";
		String writePath = "C:\\Users\\user\\Desktop\\course\\java\\filecopy\\메서드1copy.mp4";

		//향상된 try ~ catch 구문
		//closeable 인터페이스를 상속받고 있는 클래스만 사용 가능하다
		//close작업을 대신 한다.		
		
	
		
		try(InputStream is = new FileInputStream(readPath);
			OutputStream out = new FileOutputStream(writePath);) {

			//읽음 			
			byte[] arr = new byte[2048]; //2kb //1byte = 1024 -> 1024byte = 1kb

//			while(true) {
//				int result = is.read(arr); //가져오려는 파일이 크기 때문에 read해서 가져오는 작업을 반복해야함
//				System.out.println(result);
//				if(result == -1) break;
//			} //실제로 실행해보면 읽는데 엄청 오래 걸린다.
			
			//읽은 길이를 반환 - is.read()
			//파일을 읽고 나서 써야함(출력)
			//이 코드를 예쁘게 짜려면 변수 선언을 while문 밖에다.
			
			int result;
			while( (result = is.read(arr)) != -1 ) { //읽은 값이 -1이 아닐 때 까지 쓰게 되는 것 
				//값을 저장한 result의 결과가 -1이 아니면 반복.
				//(들어온 값이 100이면 다시 돌아가는 것) -1이 아닐때까지 도는 것
				//이렇게 되면 따로 탈출문을 쓰지 않아도 되는 장점이 있음
				//is.read(배열단위라 arr)로 읽은 걸 result 에 저장하는 형태
				
				//쓰기 
				out.write(arr, 0, result); //arr데이터를 0에서 ~ 바이트배열의 result까지
				//배열, 시작 길이(위치), 읽은곳까지(몇번째 데이터까지)
				
				//read write를 막 돌리면 안 된다. 파일을 사용하겠다고 붙잡고 있는 거라..
				//프로그램이 비정상적으로 종료되면 파일이 붙잡혀있게 됨.(삭제도 안되고 복사나 이동도 안 됨)
				//현재 write로 쓰다가 에러로 터지면 캐치로 넘어가게 되면서 -> close가 생기지 않게 됨.
				//이런 경우 finally로 써주는게 좋다. 
				//상단의 is에 null 값주고 close를 아래로.
			}
			
			//is.close();
			//out.close(); is 를 finally에서 처리.

		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		/*finally {
			
			try {
			is.close();
			out.close();
			} catch (Exception e2) {
				System.out.println("파일 close 에러");
			}
		}*/
		
		System.out.println("프로그램 정상 종료");
	}
}
