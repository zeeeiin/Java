package Quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FileQuiz02 {

	public static void main(String[] args) {

		/*
		 * 1. Date클래스를 이용해서 File경로에 하위폴더로 20230504file 폴더를 생성합니다
		 * 2. 스캐너로 파일명을 입력받고 BufferedWriter를 이용해서 .txt파일을 생성합니다.
		 * 3. 그만을 입력받을 떄 까지 엔터를 포함해서 입력 받습니다.
		 *    \r\n을 적절하게 이용해서 파일 출력을 완료 
		 *    
		 * 4. 파일을 다 썼다면 아무방법으로 읽어들여서 이클립스창에 출력.
		 */

		//근복적인 입력 방법 BufferedReader의 InputStream

		//Scanner scan = new Scanner(System.in);
		//BufferedReader br = new BufferedReader( new InputStreamReader(null));
		//input스트림 리더가 생성자 매개변수로 들어간다. => 1바이트를 2바이트로 변경해주는 클래스

		//String str = br.readLine(); 

		//input으로 입력을 받는 기능은 많지 않은데 read() 메서드. 무조건 다 문자로 들어온다.
		//원래 입력은 다 문자로 들어오는데, read도 정수형으로 반환해준다. readline은 한줄씩.


		//Date 클래스 사용해서 폴더 생성
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String now = sdf.format(date); //년월일	

		Scanner scan = new Scanner(System.in);
		System.out.print("파일명을 입력하시오 > ");
		String filename = scan.nextLine(); 

		//BufferedReader는 생성이 될 때, 기본 생성자는 따로 없음
		//매개변수로 Reader 클래스를 받을 수 있다.
		//문자를 받을 수 있는 변수가 FileReader 클래스
		//BufferedReader 매개변수에 리더클래스 변수를 담기
		//생성자 매개변수에 들어간다고 생각하면 됨.
		//빠른 글자 읽기
		//파일 아웃풋 1바이트 단위/ 파일 인풋 1바이트로 읽어오는 것?		
		//FileReader rd = new FileReader(); ? 이거였나..이 부분은 놓침. 
		//BufferedReader br = new BufferedReader( new FileReader(path)) 여기로 파일 리더로 들어감


		String filepath = "C:\\Users\\user\\Desktop\\course\\java\\file\\" + now + "file"; //폴더경로
		String path = filepath + "\\" + filename + ".txt"; //파일 경로

		//파일을 생성할 수 있는 객체 생성
		File file = new File(filepath);

		//파일 생성전에 조건문
		if(file.exists() == false) {
			file.mkdir();
			System.out.println("폴더 생성 완료");
		} else {
			System.out.println("이미 존재 합니다");
		}


		try( BufferedWriter bw = new BufferedWriter( new FileWriter(path)); //Writer를 먼저써야 Reader가 가능하다.
			 BufferedReader br = new BufferedReader( new FileReader(path)); ){

			//flush로 다 내보내길 바라셨음.
			
			
			//쓰는 작업
			while(true) {
				System.out.print("> ");
				String str = scan.nextLine(); 
				//위에서 next로 들어가고 여기서 nextLine 같이 들어가면 에러생기기때문에 둘 다 nextLine으로 받아주기.
				
				if(str.equals("그만")) {
					System.out.println("종료합니다");
					break;
				}		
				
				bw.write(str + "\n"); //입력	(쓴다)
				bw.flush();
			}

			//읽는 작업
//			String result;
//			while( (result = br.readLine() ) != null ) { //null이 아니라면
//				System.out.println(result);				
//			}//근데 이렇게만 쓰면 flush를 안 쓰면 읽을 값이 없다고 뜰 수도 있음.
			//파일에 실제로 써지긴하는데 이클립스에 읽어 들어오는 게 안 됨.(출력이 안 됨.)

		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}