package quiz02;

public class Account01 {

	public static void main(String[] args) {
		
		Account acc = new Account("123-456", "1234", 1000); //잔고 1000원 입금..

		acc.deposit(-5000); //입금
		acc.withDraw(10000); //출금
		acc.getBalance();
		
		
		int balance = acc.getBalance();
		System.out.println("현재 잔고는:" + balance + "원");
		
		
	}
}
