package Quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyAccount_ acc = new MyAccount_("123-456", "789", 1000);

		acc.deposit(1000);		
		acc.withDraw(500);		
		
		//잔액확인
		System.out.println( acc.getBalance());
		
	}

}
