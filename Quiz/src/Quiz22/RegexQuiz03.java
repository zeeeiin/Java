package Quiz22;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz03 {

	public static void main(String[] args)  {


		/*
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 *    readLine으로 한 줄씩 읽어들입니다.
		 * 
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 패턴분석
		 * 	  Product 객체에 저장하고, 리스트에 저장
		 * 
		 * 3. 외부 라이브러리 POI - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수 있도록 하는 기능
		 * 	  하나의 시트에 각 행데이터를 엑셀파일로 추출...
		 * 
		 * hint. 가격패턴의 마지막과 등급패턴의 마지막을 잘라서 중간을 얻는 방식..
		 */


		List<Product> list = new ArrayList<>();
		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz22\\건담.txt";

		try (BufferedReader br = new BufferedReader( new FileReader(path)) ) {

			//한 줄씩 파일 가져옴.
			String str;						
			while( (str = br.readLine()) != null ){

				//패턴은 4개면 됨. 5개 기준일 때 4번째가 패턴으로 자르기 애매해서.
				String pattern1 = "[0-9]{8}-[0-9]{2}-[0-9]{12,13}";
				String pattern2 = "[가-힣]+ [가-힣]+(점|)"; //점이 있거나 없거나. 가장 처음 발견되는 한글로 사용할 것. / [가-힣]+(강남점|평내호평점|인천점)도 가능.근데 너무 많아서 이렇게...
				String pattern3 = "\\[[가-힣A-Z]+\\]"; //  [[가-힣A-Z]]+ 도 가능할거 같긴함.
				String pattern4 = "\\d+,*\\d*원"; //가격

				Matcher m1 = Pattern.compile(pattern1).matcher(str);
				Matcher m2 = Pattern.compile(pattern2).matcher(str);
				Matcher m3 = Pattern.compile(pattern3).matcher(str);
				Matcher m4 = Pattern.compile(pattern4).matcher(str);

				if( m1.find() && m2.find() && m3.find() && m4.find()  ) {

					System.out.println("======================================================");
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group(); 
					String detail = str.substring(m3.end()+1, m4.start()); //공백도 잘라주려면 +- 활용
					//grade의 마지막과 price의 첫번째 위치
					String price = m4.group();

					System.out.println(day);
					System.out.println(store);
					System.out.println(grade);
					System.out.println(detail);
					System.out.println(price);

					//1행을 Product객체에 저장
					Product p = new Product(day, store, grade, detail, price);

					//Product를 리스트
					list.add(p);					
				}
			} //end while
			
			//엑셀 쓰기 호출
			createExcel(list);			
			

		}	catch (Exception e) {
			e.printStackTrace();
		}
	

	} //end main


		//main 밖에 쓰기
		//리스트를 매개변수로 받으려면? -> 제네릭타입 생략하고 그냥 쓰기		
		public static void createExcel( List<Product> list ) { //정확히 받을거라면 이렇게 표시.
			
			//Workbook 생성
			XSSFWorkbook workbook = new XSSFWorkbook();
			
			//Sheet 생성
			XSSFSheet sheet = workbook.createSheet(); //시트 모양으로 반환
			
			//시트 안에 행
			XSSFRow row1 = sheet.createRow(0); 
			//
			XSSFCell cel1 = row1.createCell(0);
			row1.createCell(0).setCellValue("날짜");
			row1.createCell(1).setCellValue("지점");
			row1.createCell(2).setCellValue("등급");
			row1.createCell(3).setCellValue("상세");
			row1.createCell(4).setCellValue("가격");
			
			//리스트를 엑셀파일로 쓰기
			for(int i = 0; i < list.size(); i++) {
				
				//0번째 row 가 제목
				
				Product p = list.get(i);//리스트 안에 객체
				
				XSSFRow row = sheet.createRow(i + 1);
				row.createCell(0).setCellValue(p.getDay()); //row 변수가 된 것.
				row.createCell(1).setCellValue(p.getStore()); //괄호안에 프로덕트 객체가 들어가야함.
				row.createCell(2).setCellValue(p.getGrade()); //String 값을 밸류 매개변수에 전달하고 2번째(셀)에 쓰게 만든 것.
				row.createCell(3).setCellValue(p.getDetail());
				row.createCell(4).setCellValue(p.getPrice());
			}
						
			String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz22\\건담.xlsx";
						
			try ( FileOutputStream fos = ( new FileOutputStream(path)) ) { //이건 1byte 기반
			
				workbook.write(fos);
				
			} catch (Exception e) {
				
			}			
			
		}
		

}		