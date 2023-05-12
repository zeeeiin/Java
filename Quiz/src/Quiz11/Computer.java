package Quiz11;

public class Computer {
	//1.키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;
	private Mouse mouse;
	private Monitor monitor;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() { 
		this.key = new KeyBoard(); //객체니까 = new Keyboard();
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}
	
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard key, Mouse mouse, Monitor monitor) { //매개변수 3개
		//키보드타입 key, 마우스 타입 mouse, 모니터 타입 monitor
		
		this.key = key;
		this.mouse = mouse;
		this.monitor = monitor;		
	}	

	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	//	반환 없음
	
	public void computerinfo() {
		System.out.println("======컴퓨터 정보======");
		key.info(); //1번의 key 객체에 접근 하는것
		mouse.info();
		monitor.info();
		System.out.println("====================");
	}
	
	// info 메서드는 void 형이라 단순 실행만 가능하다
	
	
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	
	
	public KeyBoard getKey() {
		return key;
	}

	public void setKey(KeyBoard key) {
		this.key = key;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
		
	
}
