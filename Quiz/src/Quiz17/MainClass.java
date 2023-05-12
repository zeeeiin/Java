package Quiz17;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		
		try {
			
			int result = cal.input();
			System.out.println(result);
//			cal.input();
		} catch (Exception e) {
//			e.printStackTrace(); //예외가 출력됨
			System.out.println( e.getMessage() );
		}
		
	}

}
