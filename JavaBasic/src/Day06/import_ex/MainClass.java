package Day06.import_ex;

//import Day06.fruit.Apple; //패키지명을 포함한 클래스명
//import Day06.fruit.Melon;
import Day06.fruit.*;

public class MainClass {

	public static void main(String[] args) {
		
		Apple app = new Apple(); //패키지가 달라서 빨간줄로 뜬다 이럴땐 import로 가져오겠다고 선언!
		Melon melon = new Melon();
		
	}
}
