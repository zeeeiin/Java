package Quiz07;

public class Car {
	
	String model;
	int speed; //따로 값 안넣어도 0이다.
	
	//1. model을 전달받아서 model에 저장하는 생성자를 생성하세요

	Car(String model){
		this.model = model;	
//		System.out.println("모델명 : " + model);
	}
	
	
	void accel(int speed) {
		/*
		멤버변수 speed가 150 이상이라면 "속도를 올릴 수 없습니다" 를 출력
		그렇지 않으면 매개변수를 멤버변수에 저장하세요
		*/
				
		if(this.speed >= 150) { //speed 매개변수
			System.out.println("속도를 올릴 수 없습니다");			
		} else {
			this.speed = speed; //매개변수를 멤버변수에 저장한다.						
		}		

	}
	
	void run() {
		/*	
		0-200 까지 30씩 증가하는 for문을 생성하고, 
		for문안에서 accel()를 호출하세요
		멤버변수 speed도 출력하세요
		*/
						
		for(int i = 0; i <= 200; i+=30) { //30씩이니까 i+=30
			this.accel(i); 
			//먼저 호출이 들어가니까 실행에서 맨마지막에 현재속도:150이라고 나오는것
			//accel(i); 라고 써도 됨.
			System.out.println("현재속도:" + this.speed );
		}
		
	}
}







