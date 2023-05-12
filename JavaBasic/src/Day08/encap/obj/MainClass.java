package Day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
				
		Chef c = new Chef();
		//사용하는(생성하는) 곳
		Hotel h = new Hotel(c); //변수로 객체를 준다
		
		Chef chef = h.getChef(); //chef에 저장 //반환유형을 보는 습관 들이기
		chef.cooking();//chef안에 들어있는 기능
		System.out.println(c == chef); //true		
		
		Class<?> x = h.getClass();//무슨 메소드인진 모르겠는데 class로 
		
//		Scanner scan = new Scanner(System.in); //객체가 들어간다
				
//		Hotel h = new Hotel();
		
//		h.getChef(); 
		//이걸 고르면 Chef 타입으로 나오게 됨
				
		
		//chef를 매개변수로 넣어주면 된다
		h.setChef(new Chef());
		
//		Chef c = h.getChef();
		//Hotel 안에 있는 Chef를 꺼냄
		//매개변수를 셰프 타입으로 꺼내넣겠다
		
		c.cooking();
		
		//Chef를 생성하서 Hotel 한테 전달 한 것.
//		Chef chef = new Chef();
		
//		Strin str = "ddd";
//		chef.setName();
		
	}
}
