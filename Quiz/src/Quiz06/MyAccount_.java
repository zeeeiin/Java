package Quiz06;

import java.util.Scanner;

public class MyAccount_ extends Account {

	   /*
	   철수는 Account를 상속받는 나의계좌를 만드려고 한다.
	   기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.
	   
	   MyAccount에 생성자를 생성하세요.
	   Account를 상속받고
	   withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
	   금액을 감소시키려고 한다.
	   또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
	   withDraw() 메서드를 오버라이딩 해주세요.
	   
	   */
	
		
	//부모님의 생성자는 상속이 안 되니까 만들어줘야한다!
		MyAccount_(String num, String pw, int bal) { //생성자도 매개변수가 있다
		accountNumber = num; //받은 값을 초기화 해준다.
		password = pw;
		balance = bal;
	}
	
	void withDraw(int money) {		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("비밀번호>");
		String pw = scan.next();
		
		if(pw.equals(password)) { //비밀번호에 대한 비교
			
			if(money <= balance) { //금액에 대한 비교
				balance -= money;
				System.out.println("출금처리 되었습니다");
			} else {
				System.out.println("잔액이 부족합니다");
			}
			
		} else {
			System.out.println("비밀번호를 확인하세요");
		}

	}
	
	
	
	
	
}
