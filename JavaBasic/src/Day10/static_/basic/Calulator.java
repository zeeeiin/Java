package Day10.static_.basic;

public class Calulator {


	/*
	 * 클래스 설계를 할 때, 적절한 곳에 static을 붙이면 좋다.
	 * (클래스명. 으로 빠르게 쓸 수 있어서..)
	 * 
	 * 객체마다 다른 값을 가져야하면 일반 변수,
	 * 객체마다 동일한 값을 가져야한다면 static 변수가 된다.
	 */
	
	private String color; //컬러변수..색상.. 객체별로 다 다른 값을 가져야함
	public static double pi = 3.14; //초기값도 바로 주기
	
	/*
	 * 메서드
	 * 일반 멤버변수를 사용하는 메서드는 static이면 안 된다. (getter / setter)
	 * 
	 * 일반 멤버변수를 사용하지 않고,
	 * 외부에서 범용성있게 사용할 메서드는 static이면 좋다.
	 * 
	 */
	
	
	public void setColor(String color) { //여기 일반변수에 static 붙으면 this를 사용할 수 없게 된다.
		//color가 static이 아니어서. static은 밖에 만들어지기 때문에 this를 사용할 수 없다
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	public static double circle(int r) {//일반변수 안 쓰는 메서드의 경우 static이 붙으면 좋다
		return r * r * Math.PI; 		//바로 circle을 호출할 수 있기 때문
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
