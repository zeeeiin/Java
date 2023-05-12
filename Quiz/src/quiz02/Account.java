package quiz02;

public class Account {
	
	//한 사람의 은행 계좌
	/*
	 * 필요한 것 - 변수, 생성자
	 * accountNumber 변수 : 식별 아이디
	 * password 변수 : 비밀번호
	 * balance 변수 : 잔고
	 * 
	 * 생성자
	 * 3가지(매개변수 3개)를 모두 받아서 초기화하는 생성자
	 * 생성자 3개 만들라는게 아니다
	 * 
	 * 메서드
	 * deposit 입금 : void(반환유형) - 기능 : 잔고에 매개변수를 누적하는 기능 = 매개변수가 있따
	 * withDraw 출금 : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance 잔고 : int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서는 각각의 기능을 확인
	 * 
	 */
	
	
	String accountNumber;
	String password;
	int balance;
			
	//생성자
	Account(String num, String pw, int bal) { //생성자도 매개변수가 있다
		accountNumber = num; //받은 값을 초기화 해준다.
		password = pw;
		balance = bal;
	}
	
	
	void deposit(int money) {
		//매개변수가 양수 일 때만 가능하도록 변경
		if(money > 0 ) {
		balance += money;
		} else {
			System.out.println("입금이 0보다 작을 수는 없습니다");
		}
	}
	
	void withDraw(int money) {		
		//매개변수가 잔고보다 클 때만 출금이 가능하도록 변경
		if(money <= balance) {
		balance -= money;
		} else {
			System.out.println("잔고가 부족합니다");
		}
	}
	
	int getBalance() {		
		return balance;//리턴 멤버변수
	}

}
