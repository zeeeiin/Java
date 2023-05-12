package Day08.encap.obj;

public class Hotel {
	
	//String Chef 둘 다 클래스.
//	private String name; //문자열이라서 String name = "Z호텔" 
	private Chef chef; //클래스를 객체처럼 쓰는거니까 선언을 하고 싶다면
//	private Chef chef = new Chef();//이렇게 선언해주면 된다
	
	
	//호텔은 생성될 때 외부에서 chef 객체를 받는다.
	public Hotel(Chef chef) { // = new chef
//		this.chef = new Chef(); //호텔생성하면 자동으로 생성됨
		this.chef = chef;
	}
	
	//setter 매개변수를 chef로 받을 수 있는 메서드
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//getter
	public Chef getChef() {
		return chef;
	}
	
	
	
	
	
	
	
	
	
//	String s = new String ("s");
	
//	
//	//chef를 매개변수로 갖는다
//	//접근제어자를 붙일 수 있다
//	//접근제어자 타입 변수명
//	private Chef chef;
////	private Chef chef = new Chef();
////>> 이 부분을잠시 주석처리하면 값이 달라짐
//	
//	//생성자 안에서 chef 초기화 가능
//	
//	
////	hotel은 생성될때 chef를 갖는다
//	public Hotel() {
////		this.chef = new Chef(); 
//	}
//	
//	
//	//chef의 게터 세터 만들기. 여기가 중요..!
//	//객체를 매개변수로 받는 모형
//	public void setChef(Chef chef) {
//		this.chef = chef;
//	}
//	
//	//객체를 반환하는 모형
//	public Chef getChef(){ //멤버변수에 있는 chef를 반환하고싶은 것
//		return chef;
//	}
	
	

}
