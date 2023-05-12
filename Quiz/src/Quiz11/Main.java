package Quiz11;

public class Main {

	public static void main(String[] args) {
		
		KeyBoard key = new KeyBoard();
		Mouse mouse = new Mouse();
		Monitor moniter = new Monitor();		
				
		Computer com = new Computer(key, mouse, moniter);
		com.computerinfo();
		
		Monitor m = com.getMonitor(); //getter 메서드
		m.info();
		//그냥 m만 출력하면 객체를 부른거라 주소가 튀어나옴
		
		
		
		
		
//		
//		KeyBoard key = com.getKey();
//		key.info();
//		
//		System.out.println(com.getMo());
//		System.out.println();
//		
		
	}
}
