package Quiz22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.security.KeyStore.TrustedCertificateEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Regex_Quiz_03 {

	public static void main(String[] args) throws Exception {

		/*
		 * 1. 버퍼리더를 사용해서 건담.txt를 읽어들입니다.
		 * 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로 패턴분석
		 * Product객체에 저장하고, 리스트에 저장
		 * 
		 * 3. 외부라이브러리(POI) - 자바에서 엑셀파일로 xlsx 형태로 파일을 쓸 수 있도록 하는 기능
		 * 	  하나에 시트에 각 행데이터를 엑셀 파일로 출력
		 */

		String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz22\\건담.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String result;
			List<Product> list = new ArrayList<>();

			while ((result = br.readLine()) != null) {

				String pattern1 = "\\d+-\\d+-\\d+";
				String pattern2 = "[가-힣]+ .[가-힣]+";
				String pattern3 = "\\[.[가-힣A-Z]+\\].";

				String pattern5 = "\\d+,?\\d+.원";

				Matcher m1 = Pattern.compile(pattern1).matcher(result);
				Matcher m2 = Pattern.compile(pattern2).matcher(result);
				Matcher m3 = Pattern.compile(pattern3).matcher(result);

				Matcher m5 = Pattern.compile(pattern5).matcher(result);

				while(m1.find() && m2.find() && m3.find() && m5.find()) {
					list.add(new Product(m1.group(), m2.group(), m3.group(), result.substring(m3.end(), m5.start()-1), m5.group()));
					System.out.println(list.get(0).getDay());
				}
			}
			// Workbook 생성
			Workbook xlsxWb = new XSSFWorkbook(); // Excel 2007 이상

			// *** Sheet-------------------------------------------------
			// Sheet 생성
			Sheet sheet1 = xlsxWb.createSheet("건담");

			// 컬럼 너비 설정
			//	      for(int k = 0 ; k < list.size() ; k++){ //일괄되게 설정하는 기능
			//	         sheet1.autoSizeColumn(k);
			//	         sheet1.setColumnWidth(k, (sheet1.getColumnWidth(k))+6000); //너비 더 넓게
			//	      }
			sheet1.setColumnWidth(0, (sheet1.getColumnWidth(0))+5000);
			sheet1.setColumnWidth(1, (sheet1.getColumnWidth(1))+4000);
			sheet1.setColumnWidth(2, (sheet1.getColumnWidth(2))+1000);
			sheet1.setColumnWidth(3, (sheet1.getColumnWidth(3))+9000);
			sheet1.setColumnWidth(4, (sheet1.getColumnWidth(4))+1000);
			// ----------------------------------------------------------

			// *** Style--------------------------------------------------
			// Cell 스타일 생성
			CellStyle cellStyle = xlsxWb.createCellStyle();
			CellStyle cellStyle1 = xlsxWb.createCellStyle();


			// 줄 바꿈
			cellStyle.setWrapText(true);
			cellStyle1.setWrapText(true);
			////	      // Cell 색깔, 무늬 채우기
			cellStyle.setFillForegroundColor(IndexedColors.LEMON_CHIFFON.getIndex());
			cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			//	      cellStyle.setFillForegroundColor(HSSFColor.LIME.index);
			////	      cellStyle.setFillPattern(CellStyle.BIG_SPOTS);

			Row row = null;
			Cell cell = null;
			//----------------------------------------------------------

			// 첫 번째 줄
			row = sheet1.createRow(0);

			// 첫 번째 줄에 Cell 설정하기-------------
			cell = row.createCell(0);
			cell.setCellValue("Day");
			cell.setCellStyle(cellStyle);
			cell = row.createCell(1);
			cell.setCellValue("Store");
			cell.setCellStyle(cellStyle);
			cell = row.createCell(2);
			cell.setCellValue("grade");
			cell.setCellStyle(cellStyle);      //---------------------------------
			cell = row.createCell(3);
			cell.setCellValue("detail");
			cell.setCellStyle(cellStyle);      //---------------------------------
			cell = row.createCell(4);
			cell.setCellValue("price");
			cell.setCellStyle(cellStyle);      //---------------------------------

			// 두 번째 줄
			for (int i = 1; i <=list.size(); i++) {

				row = sheet1.createRow(i);

				// 두 번째 줄에 Cell 설정하기-------------
				cell = row.createCell(0);
				cell.setCellValue(list.get(i-1).getDay());
				cell.setCellStyle(cellStyle1); // 셀 스타일 적용

				cell = row.createCell(1);
				cell.setCellValue(list.get(i-1).getStore());
				cell.setCellStyle(cellStyle1); // 셀 스타일 적용

				cell = row.createCell(2);
				cell.setCellValue(list.get(i-1).getGrade());
				cell.setCellStyle(cellStyle1); // 셀 스타일 적용

				cell = row.createCell(3);
				cell.setCellValue(list.get(i-1).getDetail());
				cell.setCellStyle(cellStyle1); // 셀 스타일 적용

				cell = row.createCell(4);
				cell.setCellValue(list.get(i-1).getPrice());
				cell.setCellStyle(cellStyle1); // 셀 스타일 적용
				//---------------------------------
			}

			// excel 파일 저장
			try {
				File xlsFile = new File("C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz22\\건담.xls");
				FileOutputStream fileOut = new FileOutputStream(xlsFile);
				xlsxWb.write(fileOut);

			} catch (FileNotFoundException e) {
				e.printStackTrace();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
