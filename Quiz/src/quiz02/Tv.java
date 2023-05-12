package quiz02;

public class Tv {
	
	String company = "LG"; //회사
	int channel; //채널
	boolean power; //전원 >> 아무것도 초기화가 안되어있어서 false.
	
	/*
	 * 메서드
	 * changeChannel : int - 매개변수 채널번호(x번)를 받아서 채널을 밴경하는 기능, 변경된 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지는 (스위치처럼) 동작될 수 있도록 하는 기능 - 조건문으로 가능
	 * 
	 */
	
	
	int changeChannel(int a) {
		channel = a;
		System.out.println("채널변경:" + a);
		return channel; //바꾼 채널값
	}
	
	
	void power() { //메서드 호출이 되면 true - false ... 이렇게 계속 바뀔 것.
		if(power) {
			power = false;
			System.out.println("TV Off");
		} else {
			power = true;
			System.out.println("TV On");
		}
	}	
	
}
