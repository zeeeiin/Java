package Quiz03;

public class DmbPhone  extends Phone {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
	
	
	//생성자는 상속안 됨. 고유한 기능이라서!
	//그래서 생성자는 여기에 만들어야함
		
	//모델과 색상은 상속받았기때문에 채널만(필드) 따로 만들기
	int channel;
	
	//기본 생성자 - 지금은 없어도 되지만 만들어두는게 좋다
	DmbPhone(){}
	
	
	//생성자 생성
	DmbPhone(String m, String c, int ch){ //매개변수 3개 들어가야함
		model = m;
		color = c ;
		channel = ch;
	}		
	
	void turnOnDmb() {		
		System.out.println("TV를 켭니다");					
	}
	
	
	
	int changeChannel(int ch) {
		System.out.println(channel + "번 변경");
		return ch;
	}
	
	void turnOffDmb() {	
		System.out.println("TV를 끕니다");
	}

}
