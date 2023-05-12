package day15.api.io.file;

import java.io.File;

public class CreateFileEx {
	
	public static void main(String[] args) {
		
		
		/*
		 * File 클래스
		 * 외부경로에 폴더나 단순한 파일 생성이나 삭제를 할 수 있다.
		 * 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\file\\20230504"; //파일 경로 지정
		
		//Closeable 상속받고 있지 않아서 향상된 try catch 구문은 사용 어려움
		
		try {
			File file = new File(path); //괄호 안에 경로
			
			//생성
			if( file.exists() == false ) { //존재하면 true, 존재하지 않으면 false(!file.exists() )
				file.mkdir(); //make directory > 실행하면 경로에 폴더가 생성된 것을 확인할 수 있다.
				System.out.println("폴더 생성 완료");
			} else {
				System.out.println("이미 폴더가 존재합니다.");
			}			
			
			//삭제
			if( file.exists() == true) {
				file.delete();
				System.out.println("폴더 삭제");				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
