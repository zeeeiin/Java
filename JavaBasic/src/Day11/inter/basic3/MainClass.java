package Day11.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		//변수를 하나만 써도 된다
		
		Printed pt = new LG(); //new LG(); new Samsung();
		//LG pt = new LG(); >>이건 인터페이스를 안 끼고 실행하는 거
		pt.print("hello world");
		System.out.println("------------------");
		pt.colorPrint("hello world2", "파란색");
		int result = pt.copy(5);
				
	}

}
