package Day05;

public class VarMain {

	public static void main(String[] args) {
		
		//뭘 해야할지 모르겠다면 일단은 객체 생성..
		Variable var = new Variable();
		
		var.a = 100; //외부에서 값 변경.
		var.b = "바꿔버릴거야";
		
		var.printNum(10);
		
		
		
		
	}
}
