package day14.api.thread;

public class MainClass02 {
	
	public static void main(String[] args) {
		
		//스레드를 상속받은 클래스는 직접 사용
		ThreadTest02 thread = new ThreadTest02();
		thread.setName("Thread_B"); //스레드명
		thread.start();
		
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드 종료");
		
	}

}
