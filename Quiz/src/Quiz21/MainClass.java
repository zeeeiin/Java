package Quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainClass {
	
	public static void main(String[] args) {
		
	
	//지역명, 규모구분, 연도, 월, 분양 가격 -> 1행 x 4800개
	/* 만약에 연계데이터(다른 회사에서 매 일정시에 전송되는 데이터)
	 * 
	 * 1. 버퍼리더 이용해서 한 줄씩 읽습니다.
	 * 
	 * 2. split(",",5) 사용해 Data객체에 한 줄 단위로 저장하고
	 * 	  => 배열의 최소크기 5로 보장, 구분자는 ,로 구분하겠다.는 의미
	 * 
	 * 3. List<Data>에 하나씩 추가한다.
	 *    리드라인이 다 돌아갔다면 아마도 약 4500행..?
	 *   
	 * 4. 람다식을 이용해서
	 * 	  지역 : 서울, 4분기 중 9~12월, 
	 * 	  분양가격 : 2000이상인 객체만 뽑아서 새로운 리스트로 반환.
	 *    (연도랑 규모 부분빼고 위 부분만 변환)
	 */

	//파일 읽을 때 깨지거나 빈 공간이 있어서 읽어들어올때 주의해야한다.

	//제네릭 타입의 리스트 생성
	List<Data> list = new ArrayList<>();


	//복사된 파일 우클릭 속성 - 경로 확인 가능.
	String path = "C:\\Users\\user\\Desktop\\course\\java\\work\\Quiz\\src\\Quiz21\\주택도시보증공사_전국 평균 분양가격.csv";
	
	//버퍼리더 이용해서 한 줄씩 읽습니다.
	//BufferedReader br = new BufferedReader( new FileReader(path));


	/*
	try(BufferedReader br = new BufferedReader( new FileReader(path))) { 

		String str;
		while ( (str = br.readLine()) != null) {
			System.out.println(str);//확인 
			//csv 파일 자체가 윈도우 기본형태의 ~~고 지금 여기랑 형태가 다르기 때문에 다 깨진채로 출력됨.
			//utf-8로 변행해야함.		
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	 */




	//파일을 읽어들일 때, 인코딩해서 읽어들이는 방법.	
	//해당파일을 읽어서 중간에 리더파일형태로 변환시키고 버퍼리더를 사용하겠다
	//인코딩 형식을 EUC-KR로 할 것이다.

	try( BufferedReader br = new BufferedReader( new InputStreamReader( new FileInputStream(path), "EUC-KR")) ) {

		br.readLine(); //(제목 행) 한 번 넘어감

		String str;
		while ( (str = br.readLine()) != null) {
			System.out.println(str);// 출력해서 확인해보면 값이 비어있거나.. 하는 문제가 있음.

			//최소한의 크기 지정
			String[] arr = str.split(",", 5); //, 기준으로 데이터가 들어간 배열

			String region = arr[0];
			String size = arr[1];
			String year = arr[2];
			String month = arr[3];
			String price = arr[4].replace(" ", "").replace(",", "").replace("\"", "").replace("-", ""); //2)replace로 공백제거 근데 이렇게 해도 빈 값을 해결할 수 없다고 뜸
			//3) 이런 경우 0이라는 문자열로 해결해주기				// 4)콤마와 쌍따옴표 없애기 / 쌍따옴표 : \" 없애겠다고 넣어주기. / 추가로 하이픈도 제거.

			price = price.equals("") ? "0" : price; //공백이라면, "0" 대입 : 그대로 //이렇게 값 치환하면 다행히 잘 나옴.	

			System.out.println( Integer.parseInt(price) ); //정수로 치환
			//근데 이렇게 출력해봐도 문제가 생김..>> 1)그래서 다시 위로가서 price를 replace와 equals로 해결.

			Data data = new Data(region, size, year, month, price);
			list.add(data); //리스트에 추가
			//여기까지 하고 돌려보면 뭔가 문제가 있단걸 발견하게 되는데....
			//price만 출력해보면 공백도 있고(값이 없는 것), 어떤 것들은 쌍따옴표가 들어간 데이터들이 보인다.

		}

		//4번에 대한 처리
		
		
		
		System.out.println();

	} catch (Exception e) {
		e.printStackTrace();
	}



	}

}
